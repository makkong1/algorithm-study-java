
class Solution55 {

    // 문제 설명
    // 자연수 n이 매개변수로 주어집니다.
    // n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 함수 solution을 완성해주세요.
    //
    // 3진법: 0,1,2만 쓰는 진법.
    // 10진 45 = 1×27 + 2×9 + 0×3 + 0×1 → 3진수 "1200". 앞뒤 뒤집으면 "0021" → 10진으로
    // 0×27+0×9+2×3+1 = 7.

    // 제한사항
    // n은 1 이상 100,000,000 이하인 자연수입니다.
    //
    // 4진법 예시: radix만 4로 바꾸면 됨.
    //   int n = 17;
    //   String base4 = Integer.toString(n, 4);  // "101" (1×16 + 0×4 + 1×1 = 17)
    //   int back = Integer.parseInt("101", 4);  // 17

    // 10진 → 3진 문자열 → 뒤집기 → 그 문자열을 3진수로 해석해 10진 반환
    public int solution55(int n) {
        String base3 = Integer.toString(n, 3);
        System.out.println("base3: " + base3);
        String reversed = new StringBuilder(base3).reverse().toString();
        System.out.println("reversed: " + reversed);
        return Integer.parseInt(reversed, 3);
    }

    public static void main(String[] args) {
        Solution55 sol = new Solution55();
        System.out.println("solution: " + sol.solution55(45));
        System.out.println("solution: " + sol.solution55(125));
    }
}
