/**
 * 描述:
 */
public class SolutionB {
    public static void main(String[] args) {
        SolutionB sb = new SolutionB();
        int fib1 = sb.fib(44);
        System.out.println(fib1);

    }
    public int fib(int n) {
        if (n==0) {
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
