class Solution48 {

    // 문제 설명
    // 길이가 같은 배열 A, B 두개가 있습니다. 각 배열은 자연수로 이루어져 있습니다.
    // 배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱합니다. 이러한 과정을 배열의 길이만큼 반복하며,
    // 두 수를 곱한 값을 누적하여 더합니다. 이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다.
    // (단, 각 배열에서 k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없습니다.)

    // 예를 들어 A = [1, 4, 2] , B = [5, 4, 4] 라면
    // A에서 첫번째 숫자인 1, B에서 첫번째 숫자인 5를 뽑아 곱하여 더합니다. (누적된 값 : 0 + 5(1x5) = 5)
    // A에서 두번째 숫자인 4, B에서 세번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 5 + 16(4x4) = 21)
    // A에서 세번째 숫자인 2, B에서 두번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 21 + 8(2x4) = 29)

    public int wrongSolution(int[] A, int[] B) {
        // ❌ 매 단계마다 가장 작은 곱을 선택하는 '로컬 그리디' 방식이라
        // 전체 누적 합이 최소라는 보장이 없음 (전역 최적해 X)

        boolean[] usedA = new boolean[A.length];
        boolean[] usedB = new boolean[B.length];

        int sum = 0;

        for (int k = 0; k < A.length; k++) {
            int min = Integer.MAX_VALUE;
            int ai = -1, bi = -1;

            for (int i = 0; i < A.length; i++) {
                if (usedA[i])
                    continue;

                for (int j = 0; j < B.length; j++) {
                    if (usedB[j])
                        continue;

                    int val = A[i] * B[j];
                    if (val < min) {
                        min = val;
                        ai = i;
                        bi = j;
                    }
                }
            }

            usedA[ai] = true;
            usedB[bi] = true;
            sum += min;
        }

        return sum;
    }

    public int solution48(int[] A, int[] B) {
        // ✅ A는 오름차순, B는 내림차순으로 정렬해
        // 큰 수와 작은 수를 짝지어 전체 합을 최소화하는 그리디 전략

        // A 오름차순
        for (int i = 0; i < A.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = A[i];
            A[i] = A[minIdx];
            A[minIdx] = temp;
        }

        // B 내림차순
        for (int i = 0; i < B.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < B.length; j++) {
                if (B[j] > B[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = B[i];
            B[i] = B[maxIdx];
            B[maxIdx] = temp;
        }

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * B[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution48 sol = new Solution48();

        System.out.println("solution: " + sol.solution48(new int[] { 1, 4, 2 }, new int[] { 8, 5, 4 }));
        System.out.println("wrong: " + sol.wrongSolution(new int[] { 1, 4, 2 }, new int[] { 8, 5, 4 }));
    }

}