/**
 * 描述:演示数组
 */
public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }



        Array<Integer> array = new Array(3);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);
//        array.add(2,100);
//        System.out.println(array);
    }
}
