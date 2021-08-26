/**
 * @author : 刘唯卿
 * @date : 12:42 2020/11/20
 */
public class Student implements Comparable<Student>{

    private String name;

    private int score;


    public Student(String name,int score){
        this.name = name;
        this.score = score;
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

    @Override
    public int compareTo(Student another) {
//        if(this.score<another.score){
//            return -1;
//        }
//        else if(this.score==another.score){
//            return 0;
//        }
//
//        return -1;

        //从小到大
        return this.score-another.score;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", score=").append(score);
        sb.append('}');
        return sb.toString();
    }
}
