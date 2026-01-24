
class Solution40 {

    // 문제 설명
    // 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    // s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

    // 제한 사항
    // str은 길이 1 이상인 문자열입니다.
    // 입출력 예

    public String solution40(String s) {
        char[] chars = s.toCharArray();
        String answer = "";
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] < chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }

        for (int i = 0; i < chars.length; i++) {
            answer += chars[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution40 sol = new Solution40();
        System.out.println(
                "예 1: " + sol.solution40("Zbcdefg") + " (기대값: gfedcbZ)");
        System.out.println(
                "예 2: " + sol.solution40("ABcdefg") + " (기대값: gfedcbA)");
    }
}
