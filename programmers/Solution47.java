import java.util.Stack;

class Solution47 {

    // 문제 설명
    // 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다.

    // 예를 들어 "()()" 또는 "(())()" 는 올바른 괄호입니다.
    // ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.

    // '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은
    // 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

    // 제한사항
    // 문자열 s의 길이 : 100,000 이하의 자연수
    // 문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.

    // 입출력 예
    // s return
    // "()()" true
    // "(())()" true
    // ")()(" false
    // "(()(" false

    public boolean solution47(String s) {
        boolean answer = true;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == ')') {
                answer = false;
                break;
            }
            if (s.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                answer = false;
                break;
            }

        }
        if (count != 0) {
            answer = false;
        }
        return answer;
    }

    public boolean solution47_stack(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else { // ')'
                if (stack.isEmpty()) {
                    return false; // 닫을 게 없음
                }
                stack.pop();
            }
        }

        return stack.isEmpty(); // 남아 있으면 '('가 남은 것
    }

    public static void main(String[] args) {
        Solution47 sol = new Solution47();

        System.out.println(sol.solution47("()()"));
        System.out.println(sol.solution47_stack("()()"));

        System.out.println(sol.solution47("(())()"));
        System.out.println(sol.solution47_stack("(())()"));

        System.out.println(sol.solution47(")()("));
        System.out.println(sol.solution47_stack(")()("));

        System.out.println(sol.solution47("(()("));
        System.out.println(sol.solution47_stack("(()("));
    }

}