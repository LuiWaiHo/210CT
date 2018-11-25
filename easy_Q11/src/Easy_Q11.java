import com.sun.scenario.effect.Merge;

/**
 * @Author Lui
 * @create 2018-11-25-下午 04:07
 **/

public class Easy_Q11 {



    public static void main(String []args)
    {
        int [] arr = {30,13,22,90 };
        System.out.println("Bubble_sort");
        bubble bubble = new bubble(arr);
        int bubble_Comparison_time = bubble.getComparison_time();
        int bubble_getMoving_time_time = bubble.getMoving_time();

        System.out.println("==================================================");
        System.out.println("Merge_sort");
        Merges  Merges = new Merges(arr);
        int merge_Moving_time = Merges.getMerge_count();
        int merge_Comparison_time = Merges.getComparison_count();
        System.out.println("==================================================");
        System.out.println("Selection_sort");
        Selection  Selection = new Selection(arr);
        int Selection_Comparison_time = Selection.getComparison_count();
        int Selection_Moving_time = Selection.getCount();

        System.out.println("==================================================");
        System.out.println("The comparison time");
        System.out.println("bubble sort  " + bubble_Comparison_time);
        System.out.println("Selection sort  " + Selection_Comparison_time);
        System.out.println("merge sort  " + merge_Comparison_time);
        System.out.println();;
        System.out.println("The Moving_time");
        System.out.println("bubble sort  " + bubble_getMoving_time_time);
        System.out.println("Selection sort  " + Selection_Moving_time);
        System.out.println("merge sort  " + merge_Moving_time);

        System.out.println();
        System.out.println("Which is the best performing method for sorting this array of integers? Which would be the worst arrangement of this sequence?");
        for (int i : arr)
            System.out.print(i+"\t");

        System.out.println();

        System.out.println();
        int total_bubble = bubble_Comparison_time+bubble_getMoving_time_time;
        int total_selection = Selection_Moving_time + Selection_Comparison_time;
        int total_merge = merge_Comparison_time+ merge_Moving_time;
        int[] good_worst_time = new int[3];
        good_worst_time[0] = total_bubble;
        good_worst_time[1] = total_selection;
        good_worst_time[2] = total_merge;
        int i = getMax(good_worst_time);
        if (i == total_bubble)
            System.out.println("bubble_sort is the best");
        else if (i == total_selection)
            System.out.println("selection_sort is the best");
        else
            System.out.println("merge is the best");

        int j = getMin(good_worst_time);

        if (j == total_bubble)
            System.out.println("bubble_sort is the worst");
        else if (j == total_selection)
            System.out.println("selection_sort is the worst");
        else
            System.out.println("merge is the worst");





    }
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }






}
