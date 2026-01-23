import java.util.Arrays;

class Solution31 {

    // 문제 설명
    // array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수,
    // solution을 완성해주세요.
    // divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

    // 제한사항
    // arr은 자연수를 담은 배열입니다.
    // 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
    // divisor는 자연수입니다.
    // array는 길이 1 이상인 배열입니다.

    public int[] solution31(int[] arr, int divisor) {
        int[] solution = new int[arr.length];
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[i] % divisor == 0) {
                solution[x] = arr[i];
                x++;
            }
        }

        int[] answer = new int[x]; // 반환 배열
        for (int i = 0; i < x; i++) {
            answer[i] = solution[i]; // 반환 배열에 값 복사
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - 1; j++) { // 버블 정렬
                if (answer[j] > answer[j + 1] && j < x - 1) {
                    int temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
            }
        }

        if (x == 0) {
            return answer = new int[] { -1 };
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution31 sol = new Solution31();
        System.out.println(
                "예 1: " + Arrays.toString(sol.solution31(new int[] { 1, 3, 5, 7, 0 }, 2))
                        + " (기대값: [-1])");
        System.out.println(
                "예 2: " + Arrays.toString(sol.solution31(new int[] { 1, 4, 8, 9, 2 }, 2))
                        + " (기대값: [2, 4, 8])");
    }
}
