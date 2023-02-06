package Level1;

//소수 찾기
public class Ex11 {
    public static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; ++i) {
            if (arr[i] == 1) continue;
            for (int j = i + i; j <= n; j += i) {
                arr[j] = 1;
            }
            ++answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
}
