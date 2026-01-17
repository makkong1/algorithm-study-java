class Solution9 {
    // 문제 설명
    // 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.

    // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
    // 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를
    // return하도록 solution 함수를 완성해주세요.

    // 제한사항
    // sides의 원소는 자연수입니다.
    // sides의 길이는 3입니다.
    // 1 ≤ sides의 원소 ≤ 1,000

    // 입출력 예
    // sides result
    // [1, 2, 3] 2
    // [3, 6, 2] 2
    // [199, 72, 222] 1

    // 입출력 예 설명

    // 입출력 예 #1
    // 가장 큰 변인 3이 나머지 두 변의 합 3과 같으므로 삼각형을 완성할 수 없습니다. 따라서 2를 return합니다.

    // 입출력 예 #2
    // 가장 큰 변인 6이 나머지 두 변의 합 5보다 크므로 삼각형을 완성할 수 없습니다. 따라서 2를 return합니다.

    // 입출력 예 #3
    // 가장 큰 변인 222가 나머지 두 변의 합 271보다 작으므로 삼각형을 완성할 수 있습니다. 따라서 1을 return합니다.

    public int solution9(int[] sides) {
        // [3, 6, 2] 2
        int max = 0;
        int sum = 0;

        // 가장 큰 변의 길이와 전체 합을 한 번의 루프로 구함
        for (int side : sides) {
            if (side > max) {
                max = side;
            }
            sum += side;
        }

        // 문제점: 기존 코드는 '나머지 두 변의 합'을 구할 때 max와 같은 값이 두 번 나올 경우(예: {5,5,8})
        // max 하나만 제외하고 나머지 합에 더함. 하지만 삼각형 조건은 '가장 긴 변 < 나머지 두 변의 합'이므로,
        // 반드시 전체 합에서 max 하나만 빼서 두 변의 합을 구해야 함. 즉, 같은 값이 여러 번일 때 오류날 수 있음.

        int remainder = sum - max; // '나머지 두 변의 합' 올바르게 계산

        if (max < remainder) {
            return 1;
        } else {
            return 2;
        }
    }

    // == 요약 주석 ==
    // 기존 코드는 max와 같은 값이 sides에 여러 개 있을 때 '나머지 두 변의 합'이 잘못 구해져 버그가 발생함.
    // 전체 합에서 max 하나만 빼는 방식으로 고쳐야 함.

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        int[] test1 = { 1, 2, 3 };
        System.out.println(test1.length);
        int result1 = sol.solution9(test1);
        System.out.print("예 1: ");
        System.out.print(" -> " + result1);
        System.out.println(" (기대값: 2)");
        System.out.println("--------------------------------");
        int[] test2 = { 3, 6, 2 };
        System.out.println(test2.length);
        int result2 = sol.solution9(test2);
        System.out.print("예 2: ");
        System.out.print(" -> " + result2);
        System.out.println(" (기대값: 2)");
        System.out.println("--------------------------------");
        int[] test3 = { 199, 72, 222 };
        int result3 = sol.solution9(test3);
        System.out.print("예 3: ");
        System.out.print(" -> " + result3);
        System.out.println(" (기대값: 1)");
    }
}
