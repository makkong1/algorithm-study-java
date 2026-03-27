class Solution67 {
    // 문제 설명
    // 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution
    // 함수를 완성해주세요.

    // 제한사항
    // 1 ≤ my_string의 길이 ≤ 1,000
    // my_string은 영어 대문자와 소문자로만 구성되어 있습니다.

    // "cccCCC""CCCccc""abCdEfghIJ""ABcDeFGHij"

    public String solution(String my_string) {
        // String answer = my_string;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (Character.isUpperCase(ch)) {
                answer.append(Character.toLowerCase(ch));
            } else {
                answer.append(Character.toUpperCase(ch));
            }
        }

        System.out.println(answer.toString());
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution67 sol = new Solution67();
        String result = sol.solution("cccCCC");
        String result2 = sol.solution("abCdEfghIJ");

        System.out.println(result);
        System.out.println(result2);
    }
}
