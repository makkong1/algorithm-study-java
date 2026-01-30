import java.util.Arrays;

class Solution51 {

    // 문제 설명
    // 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
    // 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
    // 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는
    // [3, 12]를 반환해야 합니다.

    // 제한 사항
    // 두 수는 1이상 1000000이하의 자연수입니다.
    public int[] solution51(int n, int m) {
        int gcd = getGCD(n, m); // 최대공약수
        int lcm = n * m / gcd; // 최소공배수
        return new int[] { gcd, lcm };
    }

    // 유클리드 호제법: GCD(n, m) = GCD(m, n % m). m이 0이 되면 n이 최대공약수
    // 예: GCD(12, 8) → GCD(8, 4) → GCD(4, 0) → 답은 4
    private int getGCD(int n, int m) {
        if (m == 0)
            return n;
        return getGCD(m, n % m);
    }

    public static void main(String[] args) {
        Solution51 sol = new Solution51();
        System.out.println("solution: " + Arrays.toString(sol.solution51(3, 12)));
        System.out.println("solution: " + Arrays.toString(sol.solution51(2, 5)));
        System.out.println("solution: " + Arrays.toString(sol.solution51(12, 8)));
    }
}
