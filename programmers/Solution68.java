import java.util.Arrays;

class Solution68 {
    // 문제 설명
    // 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를
    // 완성해보세요.

    // 제한사항
    // 1 ≤ array의 길이 ≤ 100
    // 0 ≤ array 원소 ≤ 1,000
    // array에 중복된 숫자는 없습니다.

    public int[] solution(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return new int[] { max, maxIndex };
    }

    public static void main(String[] args) {
        Solution68 sol = new Solution68();
        int[] result = sol.solution(new int[] { 1, 2, 3, 4, 5 });
        int[] result2 = sol.solution(new int[] { 1, 8, 3 });

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }
}
