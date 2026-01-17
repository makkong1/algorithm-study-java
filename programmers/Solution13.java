class Solution13 {
    // 문제 설명
    // 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution
    // 함수를 완성해주세요.

    // 제한사항
    // 1 ≤ s1, s2의 길이 ≤ 100
    // 1 ≤ s1, s2의 원소의 길이 ≤ 10
    // s1과 s2의 원소는 알파벳 소문자로만 이루어져 있습니다
    // s1과 s2는 각각 중복된 원소를 갖지 않습니다.

    // 입출력 예
    // s1 s2 result
    // ["a", "b", "c"] ["com", "b", "d", "p", "c"] 2
    // ["n", "omg"] ["m", "dot"] 0

    public int solution13(String[] s1, String[] s2) {
        int count = 0;
        for (String s : s1) {
            for (String t : s2) {
                if (s.equals(t)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    // break 있을 때 (비교 횟수 로그)
    public int solution13WithBreak(String[] s1, String[] s2) {
        int count = 0;
        int comparisons = 0;
        for (String s : s1) {
            for (String t : s2) {
                comparisons++;
                if (s.equals(t)) {
                    count++;
                    System.out.println("  [break 있음] '" + s + "' 찾음! 비교 횟수: " + comparisons);
                    break;
                }
            }
        }
        System.out.println("  [break 있음] 총 비교 횟수: " + comparisons);
        return count;
    }

    // break 없을 때 (비교 횟수 로그)
    public int solution13WithoutBreak(String[] s1, String[] s2) {
        int count = 0;
        int comparisons = 0;
        for (String s : s1) {
            for (String t : s2) {
                comparisons++;
                if (s.equals(t)) {
                    count++;
                    System.out.println("  [break 없음] '" + s + "' 찾음! (계속 비교 진행)");
                }
            }
        }
        System.out.println("  [break 없음] 총 비교 횟수: " + comparisons);
        return count;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution13 sol = new Solution13();

        System.out.println("=== 예 1: [\"a\", \"b\", \"c\"] vs [\"com\", \"b\", \"d\", \"p\", \"c\"] ===");
        System.out.println("\n[break 있을 때]");
        int result1With = sol.solution13WithBreak(new String[] { "a", "b", "c" },
                new String[] { "com", "b", "d", "p", "c" });
        System.out.println("결과: " + result1With + " (기대값: 2)");

        System.out.println("\n[break 없을 때]");
        int result1Without = sol.solution13WithoutBreak(new String[] { "a", "b", "c" },
                new String[] { "com", "b", "d", "p", "c" });
        System.out.println("결과: " + result1Without + " (기대값: 2)");

        System.out.println("\n========================================");
        System.out.println("=== 예 2: [\"n\", \"omg\"] vs [\"m\", \"dot\"] ===");
        System.out.println("\n[break 있을 때]");
        int result2With = sol.solution13WithBreak(new String[] { "n", "omg" }, new String[] { "m", "dot" });
        System.out.println("결과: " + result2With + " (기대값: 0)");

        System.out.println("\n[break 없을 때]");
        int result2Without = sol.solution13WithoutBreak(new String[] { "n", "omg" }, new String[] { "m", "dot" });
        System.out.println("결과: " + result2Without + " (기대값: 0)");
    }
}
