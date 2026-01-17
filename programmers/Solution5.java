class Solution5 {
    // 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 
    // 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.

    // 제한사항
    // 1 ≤ n ≤ 100
    // 입출력 예
    // n	result
    // 7	1
    // 1	1
    // 15	3

    public int solution5(int n) {
        return (n + 6) / 7;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int test1 = 7;
        int result1 = sol.solution5(test1);
        System.out.println("예 1: \"" + test1 + "\" -> \"" + result1 + "\" (기대값: 1)");
        int test2 = 1;
        int result2 = sol.solution5(test2);
        System.out.println("예 2: \"" + test2 + "\" -> \"" + result2 + "\" (기대값: 1)");
        int test3 = 15;
        int result3 = sol.solution5(test3);
        System.out.println("예 3: \"" + test3 + "\" -> \"" + result3 + "\" (기대값: 3)");
    }

}
