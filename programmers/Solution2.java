class Solution2 {
    // 문제 설명
    // 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록
    // solution 함수를 완성해주세요.

    // 제한사항
    // 1 ≤ num_list의 길이 ≤ 1,000
    // 0 ≤ num_list의 원소 ≤ 1,000

    // 입출력 예
    // num_list result
    // [1, 2, 3, 4, 5] [5, 4, 3, 2, 1]
    // [1, 1, 1, 1, 1, 2] [2, 1, 1, 1, 1, 1]
    // [1, 0, 1, 1, 1, 3, 5] [5, 3, 1, 1, 1, 0, 1]

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - i - 1];
        }
        return answer;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution2 sol = new Solution2();

        // 입출력 예 1
        int[] test1 = { 1, 2, 3, 4, 5 };
        int[] result1 = sol.solution(test1);
        System.out.print("예 1: ");
        printArray(test1);
        System.out.print(" -> ");
        printArray(result1);
        System.out.println(" (기대값: [5, 4, 3, 2, 1])");

        // 입출력 예 2
        int[] test2 = { 1, 1, 1, 1, 1, 2 };
        int[] result2 = sol.solution(test2);
        System.out.print("예 2: ");
        printArray(test2);
        System.out.print(" -> ");
        printArray(result2);
        System.out.println(" (기대값: [2, 1, 1, 1, 1, 1])");

        // 입출력 예 3
        int[] test3 = { 1, 0, 1, 1, 1, 3, 5 };
        int[] result3 = sol.solution(test3);
        System.out.print("예 3: ");
        printArray(test3);
        System.out.print(" -> ");
        printArray(result3);
        System.out.println(" (기대값: [5, 3, 1, 1, 1, 0, 1])");
    }

    // 배열 출력 헬퍼 메서드
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

}
