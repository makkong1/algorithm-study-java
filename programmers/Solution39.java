class Solution39 {

    // 문제 설명
    // 두 정수 left와 right가 매개변수로 주어집니다.
    // left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
    // 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

    // 제한사항
    // 1 ≤ left ≤ right ≤ 1,000

    public int solution39(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int count = 0; // 약수 개수 카운트 변수
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) { // 약수 개수가 짝수인 경우
                answer += i;
            } else { // 약수 개수가 홀수인 경우
                answer -= i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution39 sol = new Solution39();
        System.out.println(
                "예 1: " + sol.solution39(13, 17) + " (기대값: 43)");
        System.out.println(
                "예 2: " + sol.solution39(20, 27) + " (기대값: -13)");
    }
}
