import java.util.Arrays;

class Solution54 {

    // 문제 설명
    // S사에서는 각 부서에 필요한 물품을 지원해 주기 위해 부서별로 물품을 구매하는데 필요한 금액을 조사했습니다.
    // 그러나, 전체 예산이 정해져 있기 때문에 모든 부서의 물품을 구매해 줄 수는 없습니다.
    // 그래서 최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 합니다.

    // 물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해 줘야 합니다.
    // 예를 들어 1,000원을 신청한 부서에는 정확히 1,000원을 지원해야 하며,
    // 1,000원보다 적은 금액을 지원해 줄 수는 없습니다.

    // 부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때,
    // 최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.

    // 제한사항
    // d는 부서별로 신청한 금액이 들어있는 배열이며, 길이(전체 부서의 개수)는 1 이상 100 이하입니다.
    // d의 각 원소는 부서별로 신청한 금액을 나타내며, 부서별 신청 금액은 1 이상 100,000 이하의 자연수입니다.
    // budget은 예산을 나타내며, 1 이상 10,000,000 이하의 자연수입니다.

    public int solution54(int[] d, int budget) {
        int answer = 0;
        // 버블소트 오름차순 + early exit: 한 패스에서 스왑이 없으면 이미 정렬됨 → 종료
        for (int i = 0; i < d.length - 1; i++) {
            System.out.println("패스 " + (i + 1) + " 시작: " + Arrays.toString(d));
            boolean swapped = false;
            for (int j = 0; j < d.length - 1 - i; j++) {
                if (d[j] > d[j + 1]) {
                    System.out.println("스왑: " + d[j] + "와 " + d[j + 1]);
                    int temp = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("패스 " + (i + 1) + " 종료: " + Arrays.toString(d));
            if (!swapped)
                break;
        }
        for (int i = 0; i < d.length; i++) {
            if (budget >= d[i]) {
                budget -= d[i];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution54 sol = new Solution54();
        // System.out.println("solution: " + sol.solution54(new int[] { 1, 3, 2, 5, 4 },
        // 9));
        // System.out.println("solution: " + sol.solution54(new int[] { 2, 2, 3, 3 },
        // 10));
        System.out.println("solution: " + sol.solution54(new int[] { 5, 3, 8, 2, 7, 4, 6, 1, 9 }, 25));
    }
}
