import java.util.Arrays;

class Solution26 {

    // 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
    // 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

    // 제한 조건
    // n은 10,000,000,000이하인 자연수입니다.

    public int[] solution26(long n) {
        String[] numbers = String.valueOf(n).split("", 0);
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[numbers.length - i - 1] = Integer.parseInt(numbers[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution26 sol = new Solution26();
        System.out.println("예 1: " + Arrays.toString(sol.solution26(12345)) + " (기대값: [5,4,3,2,1])");
    }
}
