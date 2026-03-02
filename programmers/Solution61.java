import java.util.Stack;

class Solution61 {
    // 문제 설명
    // 짝지어 제거하기는, 알파벳 소문자로 이루어진 문자열을 가지고 시작합니다.
    // 먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾습니다.
    // 그다음, 그 둘을 제거한 뒤, 앞뒤로 문자열을 이어 붙입니다.
    // 이 과정을 반복해서 문자열을 모두 제거한다면 짝지어 제거하기가 종료됩니다.
    // 문자열 S가 주어졌을 때, 짝지어 제거하기를 성공적으로 수행할 수 있는지 반환하는 함수를 완성해 주세요.
    // 성공적으로 수행할 수 있으면 1을, 아닐 경우 0을 리턴해주면 됩니다.

    // 예를 들어, 문자열 S = baabaa 라면
    // b aa baa → bb aa → aa →
    // 의 순서로 문자열을 모두 제거할 수 있으므로 1을 반환합니다.

    // 제한사항
    // 문자열의 길이 : 1,000,000이하의 자연수
    // 문자열은 모두 소문자로 이루어져 있습니다.

    public int solution61(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() == 0) {
            System.out.println("입력 문자열이 비어있음");
            return 1;
        }

        stack.push(s.charAt(0));
        System.out.println("초기 push: " + s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);

            System.out.println("-------------------");
            System.out.println("현재 문자: " + current);
            System.out.println("현재 스택: " + stack);

            if (!stack.isEmpty() && stack.peek() == current) {
                System.out.println("같은 문자 → pop 실행");
                stack.pop();
            } else {
                System.out.println("다른 문자 → push 실행");
                stack.push(current);
            }

            System.out.println("처리 후 스택: " + stack);
        }

        System.out.println("최종 스택 상태: " + stack);

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution61 sol = new Solution61();
        System.out.println("solution: " + sol.solution61("baabaa"));
    }
}
