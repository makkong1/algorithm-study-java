class Solution69 {
    // 문제 설명
    // 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해
    // 주세요.

    // 제한사항
    // 1 ≤ my_string의 길이 ≤ 100
    // my_string은 영소문자로만 이루어져 있습니다.
    // 1 ≤ k ≤ 100

    public String solution(String my_string, int k) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < k; i++) {
            answer.append(my_string);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution69 sol = new Solution69();
        String result = sol.solution("hello", 3);
        String result2 = sol.solution("helloasd", 5);

        System.out.println(result);
        System.out.println(result2);
    }
}
