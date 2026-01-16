public class Solution3 {
    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution3 sol = new Solution3();

        // 입출력 예 1
        String test1 = "jaron";
        String result1 = sol.solution3(test1);
        System.out.println("예 1: \"" + test1 + "\" -> \"" + result1 + "\" (기대값: \"noraj\")");

        // 입출력 예 2
        String test2 = "bread";
        String result2 = sol.solution3(test2);
        System.out.println("예 2: \"" + test2 + "\" -> \"" + result2 + "\" (기대값: \"daerb\")");
    }

    // 문제 설명
    // 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를
    // 완성해주세요.

    // 제한사항
    // 1 ≤ my_string의 길이 ≤ 1,000

    // 입출력 예
    // my_string return
    // "jaron" "noraj"
    // "bread" "daerb"

    public String solution3(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
