import java.util.*;
public class duplicateParentheses{
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //closing bracket
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;//duplicate exists
                }

                /*//or
                if(ch == ')'){ 
                    int count = 0;
                    while(s.pop() != '('){
                        count++;
                    }
                    if(count < 1){
                        return true;
                    }
                }
                */
                
            }else{
                //opening bracket, operand, opertaor
                s.push(ch);
            }
        }
        return false;//duplicate does not exists 
    }

    public static void main(String args[]){
        String str = "((a+b))";//true
        String str2 = "(a-b)";//flase
        System.out.println(isDuplicate(str2));
    }
}

