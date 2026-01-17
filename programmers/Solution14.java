class Solution14 {
    // 문제 설명
    // 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다. 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이
    // n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.

    // 제한사항
    // 1 ≤ n ≤ 1,000,000

    // 입출력 예
    // n result
    // 20 6
    // 100 9

    public int solution14(int n) {
        int count = 0;

        // (예시) 72의 약수 i 값들을 보면: 1, 2, 3, 4, 6, 8, 9, 12, 18, 24, 36, 72
        // 약수는 항상 i 와 n/i 형태의 쌍으로 존재함
        // 이 쌍의 기준이 되는 값이 √n 이라서, 1부터 √n까지만 검사해도 모든 약수 쌍을 찾을 수 있음
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }

        // √n 이하에서 찾은 약수 개수 * 2 = 전체 약수 개수
        // 단, 완전제곱수인 경우 (i == n/i)는 한 번만 카운트해야 함
        int sqrtN = (int) Math.sqrt(n);
        if (sqrtN * sqrtN == n) {
            // 완전제곱수: count에서 1을 빼고 * 2, 그 다음 1을 더함
            // 예: n=100일 때 count=5, (5-1)*2+1 = 9
            return (count - 1) * 2 + 1;
        } else {
            // 일반적인 경우: 모든 약수가 쌍으로 존재
            return count * 2;
        }
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution14 sol = new Solution14();

        // 예 1: n = 20
        System.out.println("=== 예 1: n = 20 ===");
        System.out.println("√20 ≈ " + String.format("%.2f", Math.sqrt(20)));
        System.out.println("약수 쌍: (1, 20), (2, 10), (4, 5)");
        System.out.println("총 약수 개수: 6개");
        int result1 = sol.solution14(20);
        System.out.println("결과: " + result1 + " (기대값: 6)");
        System.out.println("--------------------------------");

        // 예 2: n = 100
        System.out.println("=== 예 2: n = 100 ===");
        System.out.println("√100 = " + (int) Math.sqrt(100));
        System.out.println("약수 쌍: (1, 100), (2, 50), (4, 25), (5, 20), (10, 10)");
        System.out.println("총 약수 개수: 9개");
        int result2 = sol.solution14(100);
        System.out.println("결과: " + result2 + " (기대값: 9)");
        System.out.println("--------------------------------");

        // 예 3: n = 72 (주석에 나온 예시)
        System.out.println("=== 예 3: n = 72 ===");
        System.out.println("√72 ≈ " + String.format("%.2f", Math.sqrt(72)));
        System.out.println("약수 쌍: (1, 72), (2, 36), (3, 24), (4, 18), (6, 12), (8, 9)");
        System.out.println("총 약수 개수: 12개");
        System.out.println("※ 주석 예시: 1, 2, 3, 4, 6, 8, 9, 12, 18, 24, 36, 72");
        int result3 = sol.solution14(72);
        System.out.println("결과: " + result3 + " (기대값: 12)");
    }
}
