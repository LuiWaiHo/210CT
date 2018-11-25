/**
 * @Author Lui
 * @create 2018-10-24-下午 10:20
 **/
import javax.xml.transform.Result;
import java.util.Random;

public class easy_Q9 {


    public static void guess (int initial ,int total, int answer)
    {
        int mid_num = (total - initial) /2;
        mid_num = mid_num + initial;
        System.out.print( mid_num+ "  ");
        if (answer > initial && answer < mid_num){   //prev of mid
            guess(initial, mid_num, answer);
        }
        else if (answer < total && answer > mid_num){    //next of mid
            guess(mid_num, total , answer);
        }
        else
        {
            System.out.println();
            System.out.println("found");
            System.out.println(mid_num);
        }
    }
    /*using the example to explain this algorithm
     *
     * the programme will start with initial = 0,  total = 2000
     *
     * calculate midden number when you enter this method
     * mid_num = ((total - initial ) / 2 ) + initial
     * when answer is 800
     *
     * (2000-0)/ 2 = 1000 + 0 = 1000 ==> midden number
     *  if answer : 800 < midden number :1000
     *      guess(initial: 0, midden number  : 1000, answer: 800)
     *  it will recursive the initial , midden number and answer
     *  when the answer is less than midden number
     *
     *(1000-0) / 2 = 500 + 0 = 500
     *if 800 > 500:
     *   guess(midden number: 500 , total: 1000, answer: 800)
     *  it will recursive the midden number , total and answer
     *  when the answer is greater than midden number
     *
     *keep recursive still  midden number == answer
     *
     */
    public static int genNum ()
    {
        Random ran = new Random();
        int num_ = ran.nextInt(2000)+1;
        return num_;
    }

    public static void  main (String []args)
    {
        int num = genNum();
        int total = 2000;
        System.out.println("the answer is : "+num);
        System.out.println("=====guess it !=====");
        System.out.print("guessing the number : ");
        guess(0,total,12);
    }
}
