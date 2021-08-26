/**
 * 描述: 插入排序
 */
public class InsertionSort {

    private InsertionSort(){};

    public static void main(String[] args) {
        Integer[] arr = {1,2,7,4,6,5};

//        System.out.println(arr[arr.length-1]);

        //选择排序
        InsertionSort.sort3(arr);

        for (int e: arr) {
            System.out.println(e);
        }


//        int[] dataSize = {1000000,10000000};
//        for (int n:dataSize) {
//            Integer[] arr = ArrayGenerator.generateRandomArray(n,n);
//            SortingHelper.sortTest("InsertionSort",arr);
//
//        }
    }

    //插入排序 实现接口
    public static <E extends Comparable<E>> void  sort(E[] arr){

//        //v1
//        for (int i = 0; i < arr.length; i++) {
//            //将arr【i】 插入到合适的位置
//            for(int j = i;j-1 >=0;j --){
//                //比前面元素还要小
//                if(arr[j].compareTo(arr[j-1])<0){
//                    //插入
//                    swap(arr,j,j-1);
//                }else {
//                    break;
//                }
//            }
//        }

        //v2
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j-1 >=0 && arr[j].compareTo(arr[j-1])<0; j --) {
                swap(arr,j,j-1);
            }
        }
    }
    //优化后的插入排序
    public static <E extends Comparable<E>> void  sort2(E[] arr){
        for (int i = 0; i < arr.length; i++) {

            //将arr[i] 插入到合适的位置
            E t = arr[i];
            int j;
            for (j = i; j-1>= 0 && t.compareTo(arr[j-1]) <0 ; j-- ) {
                arr[j] = arr[j-1];
            }

            arr[j] = t;
            
        }
    }
    //和sort2相反 原理
    public static <E extends Comparable<E>> void  sort3(E[] arr){
        for (int i = arr.length-1; i >=0; i--) {

            //将arr[i] 插入到合适的位置
            E t = arr[i];
            int j;
            for (j = i; j+1< arr.length && t.compareTo(arr[j+1]) >0 ; j++ ) {
                arr[j] = arr[j+1];
            }

            arr[j] = t;

        }
    }




    //交换位置
    private static<E> void swap(E[] arr,int i, int j){
        E t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

}
