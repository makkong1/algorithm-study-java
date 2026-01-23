class Solution30 {

    // 문제 설명
    // 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

    // 제한사항
    // 1 ≤ numbers의 길이 ≤ 9
    // 0 ≤ numbers의 모든 원소 ≤ 9
    // numbers의 모든 원소는 서로 다릅니다.

    public int solution30(int[] numbers) {
        int answer = 0;
        for (int i = 1; i <= 9; i++) {
            int x = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    x = 1;
                    break;
                }
            }
            if (x == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution30 sol = new Solution30();
        System.out.println(
                "예 1: " + sol.solution30(new int[] { 1, 2, 3, 4, 5, 7, 8, 0 }) + " (기대값: 15)");
    }
}
