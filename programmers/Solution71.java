import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution71 {
    // 문제 설명
    // 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
    // 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

    // 제한사항
    // numbers의 길이는 2 이상 100 이하입니다.
    // numbers의 모든 수는 0 이상 100 이하입니다.
    // 입출력 예
    // numbers result
    // [2,1,3,4,1] [2,3,4,5,6,7]
    // [5,0,2,7] [2,5,7,9,12]

    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!answer.contains(sum)) {
                    answer.add(sum);
                }
            }
        }
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution71 sol = new Solution71();
        int[] result = sol.solution(new int[] { 2, 1, 3, 4, 1 });
        int[] result2 = sol.solution(new int[] { 5, 0, 2, 7 });
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }
}
