package Level1;

//시저 암호
public class Ex14 {
    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                answer.append(ch);
            } else if (ch >= 'a' && ch <= 'z') {
                answer.append((char) ('a' + (ch + n - 'a') % 26));
            } else {
                answer.append((char) ('A' + (ch + n - 'A') % 26));
            }
        }
        System.out.println(answer);
        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "a b z";
        int n = 4;
        System.out.println(solution(s, n));
    }
}
