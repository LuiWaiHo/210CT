import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lui
 * @create 2018-11-25-下午 04:46
 **/
public class Selection {

    int count = 0;
    int comparison_count = 0;
    public Selection(int[] arr)
    {
        List<Integer> sort = new ArrayList<Integer>();
        List<Integer> sorted = new ArrayList<Integer>();

        for (int i = 0; i<arr.length;i++)
        {
            sort.add(arr[i]);
        }
        sort(sort,sorted);
    }
    public void sort(List<Integer> sort, List<Integer> sorted)
    {
        int index ;
        while(sort.size()!=0) {
            int min = sort.get(0);
            index = 0;
            // find the minimum element in the array and add to sorted list
            for (int i = 0; i < sort.size(); i++) {
                int cur = sort.get(i);
                comparison_count += 1;
                if (cur < min) {
                    min = cur;
                    index = i;
                }
            }
            sorted.add(min);
            sort.remove(index);
            count += 1;

            System.out.println("element comparison time of this round  "+comparison_count);
            System.out.println("element moving time of this round  "+count);
            System.out.println("unsort list");
            for (int i = 0; i < sort.size(); i++) {
                System.out.print(sort.get(i));
                System.out.print('\t');
            }
            System.out.println();
            System.out.println("sorted list");
            for (int i = 0; i < sorted.size(); i++) {
                System.out.print(sorted.get(i));
                System.out.print('\t');
            }
            System.out.println();
            System.out.println("======================================");
        }
    }
    public int getCount()
    {
        return count;
    }
    public int getComparison_count()
    {
        return comparison_count;
    }
}
