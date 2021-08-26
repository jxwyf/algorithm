/**
 * @author : 刘唯卿
 * @date : 20:39 2020/11/22
 * 选择排序
 */
public class SelectionSort {


    private SelectionSort(){}

    public static<E extends Comparable<E>> void sort(E[] arr){

        //arr[0...i]是有序的 arr[i....n]是无序的
        for (int i = 0; i < arr.length; i++) {
            //选择arr【i...n)中最小值的索引
            int minIndex = i;

            for (int j =i;j<arr.length;j++){
                if(arr[j].compareTo(arr[minIndex])<0){
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }

    }


    public static void sort1(Comparable[] arr){

        //arr[0...i]是有序的 arr[i....n]是无序的
        for (int i = 0; i < arr.length; i++) {
            //选择arr【i...n)中最小值的索引
            int minIndex = i;

            for (int j =i;j<arr.length;j++){
                if(arr[j].compareTo(arr[minIndex])<0){
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }

    }

    private static<E> void swap(E[] arr,int i, int j){
        E t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }


    /**
     * 测试
     */
    public static void main(String[] args) {

        Integer[] arr = {1,4,2,3,12,5,12,22};

        //选择排序
        SelectionSort.sort1(arr);

        for (int e: arr) {
            System.out.println(e);
        }

        Student[] students = {
                new Student("abc",100),
                new Student("ceo",9999),
                new Student("cbd",10),
                new Student("cbd",12)};

        SelectionSort.sort1(students);

        for (Student student: students) {
            System.out.println(student);
        }

    }
}
