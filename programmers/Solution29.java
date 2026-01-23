class Solution29 {

    // 문제 설명
    // 어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열
    // signs가 매개변수로 주어집니다. 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.

    // 제한사항
    // absolutes의 길이는 1 이상 1,000 이하입니다.
    // absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
    // signs의 길이는 absolutes의 길이와 같습니다.
    // signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.

    public int solution29(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution29 sol = new Solution29();
        System.out.println(
                "예 1: " + sol.solution29(new int[] { 1, 4, 7, 12 }, new boolean[] { false, true, false, true })
                        + " (기대값: 9)");
        System.out.println(
                "예 2: " + sol.solution29(new int[] { 1, 2, 3 }, new boolean[] { false, false, true }) + " (기대값: 0)");
    }
}
