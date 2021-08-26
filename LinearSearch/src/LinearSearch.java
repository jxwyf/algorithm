/**
 * @author : 刘唯卿
 * @date : 8:45 2020/11/20
 * 线性查找法
 */
public class LinearSearch {


    private LinearSearch(){};


    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] .equals(target) ) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int n =100000;
        //生成数组
        Integer[] data = ArrayGenerator.generateOrderedArray(n);

        //开始时间
        long startTime = System.nanoTime();
        Integer res = LinearSearch.search(data, n);
        //结束时间
        long endTime = System.nanoTime();

        double time = (endTime - startTime) /1000000000.0;

        System.out.println(time + "s");
//        Student[] students ={new Student("bobo"),
//                             new Student("lbe"),
//                             new Student("礼拜三")};
//
//        Student lbs = new Student("礼拜三");
//        int search = LinearSearch.search(students, lbs);
//        System.out.println(search);



    }

}
