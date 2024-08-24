import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class App {

    public static boolean isValid(String s) {
        if(s.length() % 2 != 0){
            System.out.println("Cannot divde by 2, so the string is an invalid string");
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < s.length(); i++){
            char currentCharacter = s.charAt(i);
            switch (currentCharacter) {
                case '{':
                    stack.push(currentCharacter);
                    break;
                case '[':
                    stack.push(currentCharacter);
                    break;
                case '(':
                    stack.push(currentCharacter);
                    break;
                case '}':
                    if (stack.peek() != currentCharacter){
                        return false;
                    }
                case ']':
                    if (stack.peek() != currentCharacter){
                        return false;
                    }
                case ')':
                    if (stack.peek() != currentCharacter){
                        return false;
                    }
                default:
                    if(currentCharacter != stack.peek()){
                        return false;
                    }
                    System.err.println("Unkown Character!");
                    break;
            }
        }      
        return true;
    }
    public static void main(String[] args) throws Exception {
        boolean validString = false;
        String s = "()[]{}";
        validString = isValid(s);
        if (validString){
            System.out.println("The String: " + s + " is valid");
        }else {
            System.out.println("The String: " + s + " is not valid");
        }

        
    }
}
