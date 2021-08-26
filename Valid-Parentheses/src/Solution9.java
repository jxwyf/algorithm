/**
 * 描述:力扣 回文数
 */
public class Solution9 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        boolean palindrome = solution9.isPalindrome(0);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(int x) {
        long number = 0;
        int z = x;
        while (x != 0){
            number = number * 10 + x%10;
            x = x / 10;
        }
        System.out.println(number);
        System.out.println(z);
        if(number == z && number >=0){
            return true;
        }
        return false;
    }

}
