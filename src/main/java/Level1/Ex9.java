package Level1;

import java.util.regex.Pattern;

//문자열 다루기 기본
public class Ex9 {
    public static boolean solution(String s) {
        boolean answer = false;
        if(s.length() == 4 || s.length() == 6) {
            answer = Pattern.matches("^\\d*$", s);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "123a45";
        System.out.println(solution(s));
    }
}
