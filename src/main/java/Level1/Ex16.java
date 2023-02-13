package Level1;

//이상한 문자 만들기
public class Ex16 {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] ss = s.split("");
        int idx = 0;
        for (int i = 0; i < ss.length; i++) {
            if (ss[i].equals(" ")) {
                idx = 0;
                answer.append(" ");
            } else if (idx % 2 == 0) {
                answer.append(ss[i].toUpperCase());
                idx++;
            } else {
                answer.append(ss[i].toLowerCase());
                idx++;
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "try to hello world";
        System.out.println(solution(s));
    }
}
