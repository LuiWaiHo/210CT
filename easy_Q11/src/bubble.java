/**
 * @Author Lui
 * @create 2018-11-25-下午 05:16
 **/
public class bubble {

    int moving_time = 0;
    int comparison_time = 0;
    public bubble(int[] arr)
    {
        bubble(arr);
    }
    public void bubble(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++){

            for(int j = i ; j < arr.length; j++ ){

                comparison_time+= 1;
                if (arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    moving_time+=1;
                    System.out.println("comparison time of this round "+comparison_time);
                    System.out.println("element moving time of this round "+moving_time);
                    for (int k = 0; k < arr.length; k++){
                        System.out.print(arr[k]);
                        System.out.print("\t");
                    }
                    System.out.println();

                }
            }
        }
    }

    public int getMoving_time()
    {
        return moving_time;
    }
    public int getComparison_time()
    {
        return comparison_time;
    }
}
