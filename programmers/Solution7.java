class Solution7 {
    // 문제 설명
    // 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

    // 제한사항
    // 0 ≤ numbers의 원소 ≤ 10,000
    // 2 ≤ numbers의 길이 ≤ 100

    // 입출력 예
    // numbers result
    // [1, 2, 3, 4, 5] 20
    // [0, 31, 24, 10, 1, 9] 744

    // 입출력 예 설명

    // 입출력 예 #1
    // 두 수의 곱중 최댓값은 4 * 5 = 20 입니다.

    // 입출력 예 #1
    // 두 수의 곱중 최댓값은 31 * 24 = 744 입니다.

    // int[] test1 = { 1, 2, 3, 4, 5 };
    public int solution7(int[] numbers) {
        int max = 0;
        int max2 = 0;

        // 한 번의 루프로 가장 큰 두 값 찾기
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                // 새로운 최댓값을 찾으면, 기존 max를 max2로 이동
                max2 = max;
                max = numbers[i];
            } else if (numbers[i] > max2) {
                // max보다는 작지만 max2보다 큰 값
                max2 = numbers[i];
            }
        }

        return max * max2;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        int[] test1 = { 1, 2, 3, 10, 5 };
        System.out.println(test1.length);
        int result1 = sol.solution7(test1);
        System.out.print("예 1: ");
        System.out.print(" -> " + result1);
        System.out.println(" (기대값: 50)");
        int[] test2 = { 0, 31, 12, 24, 10, 1, 9 };
        int result2 = sol.solution7(test2);
        System.out.print("예 2: ");
        System.out.print(" -> " + result2);
        System.out.println(" (기대값: 372)");
        int[] test3 = { 9, 10, 24, 4, 5, 15 };
        int result3 = sol.solution7(test3);
        System.out.print("예 3: ");
        System.out.print(" -> " + result3);
        System.out.println(" (기대값: 240)");
    }

}
