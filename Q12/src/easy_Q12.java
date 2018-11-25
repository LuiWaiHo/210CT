import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lui
 * @create 2018-11-14-上午 09:22
 **/
public class easy_Q12 {

    public static List<Integer> quick_sort(List<Integer> array) {
        if (array.size() < 2)
            return array;
        // use the mid of the array to pivot
        int pivot = array.get(array.size()/2);
        array.remove(array.size()/2);
        List<Integer> less = new ArrayList<Integer>();
        List<Integer> great = new ArrayList<Integer>();
        List<Integer> total = new ArrayList<Integer>();

        //Based on pivot to allocate array elements, if the number is less than pivot, it is placed in less array
        // , and if it is larger than pivot, it is placed in greater array.
        for (int i = 0 ; i < array.size(); i++)
        {
            if (array.get(i)<pivot)
            {
                less.add(array.get(i));
            }
            else
            {
                great.add(array.get(i));
            }
        }
        //Repeat the above actions recursively until there is only one less array left
        List<Integer>less_result = quick_sort(less);

        //By recursion, we find the smallest value and then merge it with pivot.
        for (int i : less_result)
        {
            total.add(i);
        }
        total.add(pivot);
        //Use the greater array to recurse again, repeat the above actions, spell and merge
        List<Integer> great_result = quick_sort(great);
        for (int i : great_result)
        {
            total.add(i);
        }
        return total;
    }
    public static void main(String []args)
    {
        List<Integer> list = new ArrayList<Integer>();
        int[] array = {30,13,22,90,50};
        for (int i = 0 ; i < array.length; i++)
            list.add(array[i]);
        List<Integer> result = quick_sort(list);

        for (int i : result)
        {
            System.out.println(i);
        }
        //quick_sort(array);
    }
}
