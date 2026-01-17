class Solution8 {
    // 문제 설명
    // 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
    // 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때, 머쓱이보다 키 큰 사람 수를
    // return 하도록 solution 함수를 완성해보세요.

    // 제한사항
    // 1 ≤ array의 길이 ≤ 100
    // 1 ≤ height ≤ 200
    // 1 ≤ array의 원소 ≤ 200
    // 입출력 예
    // array height result
    // [149, 180, 192, 170] 167 3
    // [180, 120, 140] 190 0
    // 입출력 예 설명
    // 입출력 예 #1

    // 149, 180, 192, 170 중 머쓱이보다 키가 큰 사람은 180, 192, 170으로 세 명입니다.
    // 입출력 예 #2

    // 180, 120, 140 중 190보다 큰 수는 없으므로 0명입니다.
    public int solution8(int[] array, int height) {
        int count = 0;
        for (int n : array) {
            if (n > height) {
                count++;
            }
        }
        return count;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        int[] test1 = { 149, 180, 192, 170 };
        System.out.println(test1.length);
        int result1 = sol.solution8(test1, 167);
        System.out.print("예 1: ");
        System.out.print(" -> " + result1);
        System.out.println(" (기대값: 3)");
        int[] test2 = { 180, 150, 200 };
        int result2 = sol.solution8(test2, 190);
        System.out.print("예 2: ");
        System.out.print(" -> " + result2);
        System.out.println(" (기대값: 1)");
    }

}
