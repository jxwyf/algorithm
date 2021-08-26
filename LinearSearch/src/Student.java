/**
 * @author : 刘唯卿
 * @date : 12:42 2020/11/20
 */
public class Student {

    private String name;


    public Student(String name){
        this.name = name;
    }



    /**
     * 重写 equals 方法 用来判断
     */
    @Override
    public boolean equals(Object student){

        if (this == student) {
            return true;
        }

        if (student==null) {
            return false;
        }
        //判断两个类地址是否一样
        if (this.getClass() != student.getClass()) {
            return false;
        }

        Student another = (Student) student;
        return this.name.equals(another.name);
    }
}
