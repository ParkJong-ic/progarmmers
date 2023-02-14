package Level1;

import java.util.Arrays;

//자연수 뒤집어 배열로 만들기
public class Ex18 {
    public static int[] solution(Long n) {
        long num = n;
        int cnt = 0;
        while (num != 0) {
            num /= 10;
            cnt++;
        }
        int[] answer = new int[cnt];
        num = n;
        for (int i = 0; num != 0; i++) {
            answer[i] = (int) (num % 10);
            num /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        long n = 12345;
        System.out.println(Arrays.toString(solution(n)));
    }
}
