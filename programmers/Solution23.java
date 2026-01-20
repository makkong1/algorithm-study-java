class Solution23 {

    // 문제 설명
    // 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
    // 예를들어 n이 118372면 873211을 리턴하면 됩니다.

    // 제한 조건
    // n은 1이상 8000000000 이하인 자연수입니다.

    public long solution23(long n) {
        long answer = 0;
        String[] numbers = String.valueOf(n).split("");
        // System.out.println("초기 배열: " + java.util.Arrays.toString(numbers));

        // numbers를 내림차순으로 정렬
        for (int j = 0; j < numbers.length; j++) {
            boolean swapped = false; // 매 패스 시작할 때 false
            // System.out.println("\n=== 외부 루프 j=" + j + " ===");
            for (int i = 0; i < numbers.length - 1 - j; i++) {
                String temp = numbers[i];
                String temp2 = numbers[i + 1];
                // System.out.print(" i=" + i + ": 비교 [" + temp + "] vs [" + temp2 + "] -> ");
                if (temp.equals(temp2)) {
                    // System.out.println("같음, skip");
                    continue;
                } else if (Integer.parseInt(temp) < Integer.parseInt(temp2)) {
                    numbers[i] = temp2;
                    numbers[i + 1] = temp;
                    swapped = true; // 스왑이 발생했을 때만 true
                    // System.out.println("스왑! 결과: " + java.util.Arrays.toString(numbers));
                } else {
                    // System.out.println("스왑 안함");
                }
            }
            // 내부 루프가 끝난 후, 스왑이 한 번도 없었으면 이미 정렬 완료
            if (!swapped) {
                // System.out.println("스왑 없음! 조기 종료");
                break;
            }
        }
        answer = Long.parseLong(String.join("", numbers));
        return answer;
    }

    public static void main(String[] args) {
        Solution23 sol = new Solution23();
        long result1 = sol.solution23(59712408);
        System.out.println(result1);
    }
}
