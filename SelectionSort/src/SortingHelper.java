/**
 * @author : 刘唯卿
 * @date : 21:17 2020/11/22
 * 测试排序方法
 */
public class SortingHelper {

    private SortingHelper(){}

    //判断一个数组是否有序
    public static <E extends Comparable<E>> boolean isSorted(E[] arr){
        for (int i = 1; i < arr.length; i++)
            if(arr[i-1].compareTo(arr[i])>0)
                return false;
        return true;
    }

    //
    public static <E extends Comparable<E>> void sortTest(String sortname,E[] arr){
        //开始时间
        long startTime = System.nanoTime();
        if(sortname.equals("SelectionSort")){
            SelectionSort.sort(arr);
        }else if(sortname.equals("InsertionSort")){
            InsertionSort.sort(arr);
        }
        //结束时间
        long endTime = System.nanoTime();
        //相差时间
        double time = (endTime-startTime) / 1000000000.0;

        if(SortingHelper.isSorted(arr)){
            throw new RuntimeException(sortname + "failed");
        }
        System.out.println(String.format("%s , n = %d : %f s",sortname,arr.length,time));
    }
}
