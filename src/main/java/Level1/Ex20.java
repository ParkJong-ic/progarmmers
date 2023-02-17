package Level1;

//정수 제곱근 판별
public class Ex20 {
    public static long solution(long n) {
        long answer = 0;
        for (int i = 0; i < Math.sqrt(n) + 1; i++) {
            if (Math.sqrt(n) == i) {
                answer = (long) (i + 1) * (i + 1);
            } else {
                answer = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        long n = 3;
        System.out.println(solution(n));
    }
}
