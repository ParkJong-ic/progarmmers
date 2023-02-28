package Level1;

import java.util.Arrays;

//예산
public class Ex32 {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        int cnt = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) {
                break;
            }
            cnt++;
        }
        answer = cnt;
        return answer;
    }

    private final int[] d;
    private final int budget;

    public Ex32(int[] d, int budget) {
        this.d = d;
        this.budget = budget;
    }

    public static void main(String[] args) {
        Ex32 test1 = new Ex32(new int[]{1, 3, 2, 5, 4}, 9);
        Ex32 test2 = new Ex32(new int[]{2, 2, 3, 3}, 10);
        System.out.println(solution(test1.d, test1.budget));
        System.out.println(solution(test2.d, test2.budget));
    }
}
