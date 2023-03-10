package Level1;

import java.util.Arrays;

//체육복
public class Ex38 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = reserve[j] = -1;
                    break;
                }
            }
        }

        for (int lostPerson : lost) {
            for (int i = 0; i < reserve.length; i++) {
                if (reserve[i] == lostPerson + 1 || reserve[i] == lostPerson - 1) {
                    answer++;
                    reserve[i] = -1;
                    break;
                }
            }
        }

        return answer;
    }

    private final int n;
    private final int[] lost;
    private final int[] reserve;

    public Ex38(int n, int[] lost, int[] reserve) {
        this.n = n;
        this.lost = lost;
        this.reserve = reserve;
    }

    public static void main(String[] args) {
        Ex38 test1 = new Ex38(5, new int[]{2, 4}, new int[]{1, 3, 5});
        Ex38 test2 = new Ex38(5, new int[]{2, 4}, new int[]{3});
        Ex38 test3 = new Ex38(3, new int[]{3}, new int[]{1});

        System.out.println(solution(test1.n, test1.lost, test1.reserve));
        System.out.println(solution(test2.n, test2.lost, test2.reserve));
        System.out.println(solution(test3.n, test3.lost, test3.reserve));
    }
}
