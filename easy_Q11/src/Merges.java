
/**
 * @Author Lui
 * @create 2018-11-25-下午 04:35
 **/
public class Merges {
    int merge_count = 0;

    int comparison_count = 0;
    public Merges(int[] arr) {
        Megre(arr);
    }

    public  int[] Megre(int[] array)
    {
        // return , stop iteration if the length of array only one
        if (array.length == 1)
        {
            return array;
        }
        // find the midpoint of array
        int midpoint = array.length/2;
        int[] left = new int[midpoint];
        int [] right;
        // If the result of dividing 2 is an integer,
        // then the array can be assigned the same number.
        if (array.length %2 == 0)
        {
            right = new int [midpoint];

        }
        //If the result of dividing 2 is a decimal, then the distribution cannot be evenly distributed.
        // The right array has one more than the left array.
        else {
            right = new int [midpoint+1];
        }
        //Split the array into left and right
        for (int i = 0; i < midpoint ; i++)
        {
            merge_count += 1;
            left[i] = array[i];

        }
        for (int i = 0; i < right.length ; i++)
        {
            merge_count += 1;
            right[i] = array[midpoint+i];

        }
        int[] result = new int [array.length];
        //Recursive method,
        // the elements in the array are separated ...
        left = Megre(left);
        right = Megre(right);
        //Compare two arrays for merging and sorting
        result = Megre(left, right);

        return result;
    }
    public  int[] Megre(int[] left, int[]right)
    {
        int[] result = new int[left.length+right.length];
        int leftPoint = 0;
        int rightPoint = 0;
        int resultPoint = 0;
        while (leftPoint < left.length || rightPoint < right.length)
        {
            comparison_count += 1;
            if (leftPoint < left.length && rightPoint < right.length)
            {
                if (left[leftPoint] > right[rightPoint])
                {
                    result[resultPoint] = right[rightPoint];
                    resultPoint++;
                    rightPoint++;
                }
                else
                {
                    result[resultPoint] = left[leftPoint];
                    resultPoint++;
                    leftPoint++;
                }
            }
            else if (leftPoint < left.length)
            {
                result[resultPoint] = left[leftPoint];
                resultPoint++;
                leftPoint++;

            }else if (rightPoint < right.length)
            {
                result[resultPoint] = right[rightPoint];
                resultPoint++;
                rightPoint++;

            }
            merge_count += 1;
            System.out.println("element comparison time of this round : "+comparison_count);
            System.out.println("element moving time of this round: "+merge_count);
            for (int i : result)
            {
                System.out.print(i);
                System.out.print("\t");
            }
            System.out.println();
        }

        return result;
    }
    public int getMerge_count(){
        System.out.println("totally spend "+ merge_count +"round");
        return merge_count;
    }
    public int getComparison_count(){
        System.out.println("totally spend "+ comparison_count +"round");
        return comparison_count;
    }

}
