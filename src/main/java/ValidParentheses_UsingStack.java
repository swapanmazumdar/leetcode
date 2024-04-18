import java.util.Stack;

public class ValidParentheses_UsingStack {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        String openingBrackets = "{([";
        String closingBrackets = "})]";
        for (int i = 0; i < s.length(); i++) {
            if (openingBrackets.contains(String.valueOf(s.charAt(i)))) {
                stack.push(Character.valueOf(s.charAt(i)));
                continue;
            }
            if (closingBrackets.contains(String.valueOf(s.charAt(i))) && stack.empty()) {
                return false;
            }
            if (s.charAt(i) == '}' && !stack.empty() && stack.peek().charValue() != '{') {
                return false;
            }
            if (s.charAt(i) == ')' && !stack.empty() && stack.peek().charValue() != '(') {
                return false;
            }
            if (s.charAt(i) == ']' && !stack.empty() && stack.peek().charValue() != '[') {
                return false;
            }
            stack.pop();
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses_UsingStack().isValid("(])"));
        System.out.println(new ValidParentheses_UsingStack().isValid("()[]{}"));
        System.out.println(new ValidParentheses_UsingStack().isValid("(]"));
        System.out.println(new ValidParentheses_UsingStack().isValid("]"));
    }
}
