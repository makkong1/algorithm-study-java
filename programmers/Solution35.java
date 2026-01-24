class Solution35 {

    // 문제 설명
    // 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
    // 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

    // 재한사항
    // s는 길이가 1 이상, 100이하인 스트링입니다.

    public String solution35(String s) {
        String answer = "";
        int stringlength = s.length();
        if (stringlength % 2 == 0) {// 짝수
            answer = s.substring(stringlength / 2 - 1, stringlength / 2 + 1);
        } else {// 홀수
            answer = s.substring(stringlength / 2, stringlength / 2 + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution35 sol = new Solution35();
        System.out.println(
                "예 1: " + sol.solution35("abcdegqdczsfqgfz")
                        + " (기대값: fz)");
        System.out.println(
                "예 2: " + sol.solution35("qwerrq")
                        + " (기대값: er)");
    }
}
