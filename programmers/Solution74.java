
class Solution74 {
    // 문제 설명
//     네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.

// 다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
// 1478 → "one4seveneight"
// 234567 → "23four5six7"
// 10203 → "1zerotwozero3"
// 이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
// 참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.
// 숫자	영단어
// 0	zero
// 1	one
// 2	two
// 3	three
// 4	four
// 5	five
// 6	six
// 7	seven
// 8	eight
// 9	nine
    /**
     * true면 치환 과정을 한 줄씩 출력 (이해용). 제출/실행 시 false로 바꾸면 됨.
     */
    private static final boolean TRACE = true;

    public int solution(String s) {
        String result = s;
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (TRACE) {
            System.out.println("[입력 s] 길이=" + s.length() + "  내용=\"" + s + "\"");
            System.out.println("→ for는 단어 종류 10개(zero~nine)만큼만 돕니다. 입력 길이만큼 도는 게 아닙니다.\n");
        }
        for (int i = 0; i < words.length; i++) {
            result = result.replace(words[i], String.valueOf(i));
            String before = result;
            String digit = String.valueOf(i);
            result = result.replace(words[i], digit);
            if (TRACE) {
                System.out.println("--- i=" + i + "  replace(\"" + words[i] + "\", \"" + digit + "\")");
                System.out.println("    replace 전: \"" + before + "\"");
                System.out.println("    replace 후: \"" + result + "\"");
                if (before.equals(result)) {
                    System.out.println("    (변화 없음: 이 문자열 안에 \"" + words[i] + "\" 부분이 없음)");
                }
                System.out.println();
            }
        }
        if (TRACE) {
            System.out.println("[최종 문자열] \"" + result + "\" → parseInt\n");
        }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        Solution74 sol = new Solution74();
        System.out.println(sol.solution("23four5six7"));
        System.out.println(sol.solution("1zerotwozero3"));
    }
}
