package Level1;

// 수박수박수박수박수박수?
public class Ex12 {
    public static String solution(int n) {
        String answer = "";
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 == 0) {
                answer += "박";
            } else {
                answer += "수";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }
}
