class Solution6 {
    // 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를
    // return하도록 solution 함수를 완성해주세요.

    // 제한사항
    // 1 ≤ n ≤ 10
    // 1 ≤ t ≤ 15
    // 입출력 예
    // n t result
    // 2 10 2048
    // 7 15 229,376

    public int solution6(int n, int t) {
        int answer = n; // n = 2
        for (int i = 0; i < t; i++) { // t = 5
            answer *= 2;
        }
        return answer;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        int test1 = 2;
        int result1 = sol.solution6(test1, 10);
        System.out.println("예 1: \"" + test1 + "\" -> \"" + result1 + "\" (기대값: 1)");
        int test2 = 1;
        int result2 = sol.solution6(test2, 15);
        System.out.println("예 2: \"" + test2 + "\" -> \"" + result2 + "\" (기대값: 1)");
        int test3 = 7;
        int result3 = sol.solution6(test3, 15);
        System.out.println("예 3: \"" + test3 + "\" -> \"" + result3 + "\" (기대값: 3)");
    }

}
