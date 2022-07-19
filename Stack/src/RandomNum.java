import java.sql.Time;
import java.util.Random;

/**
 * @author: 敷衍
 * @description:
 * @date: 2022/4/14 20:42
 * @version: 1.0
 */
public class RandomNum {

    public static void main(String[] args) {

        int min = 1,max = 100000000,n=max - min+1;

        //开始时间
        long startTime = System.nanoTime();
        int[] ints = randomNums1(min, max, n);
        //结束时间
        long endTime = System.nanoTime();

        double time = (endTime - startTime) /1000000000.0;



        System.out.println(time + "s");

    }



    public static int[] randomNums1(int min,int max,int n){
        int range = max - min + 1;

        if (min > max || n < 0 || n > range){
            return null;
        }

        int[] nums = new int[n];

        int[] sources = new int[range];

        for (int i = 0; i < range; i++) {
            sources[i] = min + 1;
        }
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int index = random.nextInt(range - 1);
            nums[i] = sources[index];

            if (index != range- i -1){
                sources[index] = sources[range - i -1];
            }
        }

        return nums;

    }

}
