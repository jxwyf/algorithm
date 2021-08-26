/**
 * @author : 刘唯卿
 * @date : 15:36 2020/11/20
 * 数组生成器
 */
public class ArrayGenerator {

    private ArrayGenerator (){}

    //生成数组
    public static Integer[] generateOrderedArray(int n){

        Integer[] arr = new Integer[n];

        for (int i = 0; i <n ; i++) {

            arr[i] =i;

        }
        return arr;
    }
}
