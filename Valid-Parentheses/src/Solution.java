import java.util.Stack;
/**
 * 描述:力扣  20. 有效的括号
 *
 */
public class Solution {
    public boolean isValid(String s) {

        Stack<Character>  stack = new Stack<>();

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }else {
                    char topChar = stack.pop();
                    if(c ==')' && topChar !='('){
                        return false;
                    }
                    if(c ==']' && topChar !='['){
                        return false;
                    }
                    if(c =='}' && topChar !='{'){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
