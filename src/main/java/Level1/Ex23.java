package Level1;

import java.util.Arrays;

//최대공약수와 최소공배수
public class Ex23 {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }
        for (int i = 1; i < 1000000; i++) {
            if ((n * i) % m == 0) {
                answer[1] = n * i;
                break;
            }
        }
        return answer;
    }

    private final int n;
    private final int m;

    public Ex23(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public static void main(String[] args) {
        Ex23 test1 = new Ex23(3, 12);
        Ex23 test2 = new Ex23(2, 5);
        Ex23 test3 = new Ex23(60, 48);
        System.out.println(Arrays.toString(solution(test1.n, test1.m)));
        System.out.println(Arrays.toString(solution(test2.n, test2.m)));
        System.out.println(Arrays.toString(solution(test3.n, test3.m)));
    }
}
