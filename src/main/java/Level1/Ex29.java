package Level1;

import java.util.Arrays;

//x만큼 간격이 있는 n개의 숫자
public class Ex29 {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }

    private final int x;
    private final int n;

    public Ex29(int x, int n) {
        this.x = x;
        this.n = n;
    }

    public static void main(String[] args) {
        Ex29 test1 = new Ex29(2, 5);
        Ex29 test2 = new Ex29(4, 3);
        Ex29 test3 = new Ex29(-4, 2);
        System.out.println(Arrays.toString(solution(test1.x, test1.n)));
        System.out.println(Arrays.toString(solution(test2.x, test2.n)));
        System.out.println(Arrays.toString(solution(test3.x, test3.n)));
    }
}
