package Level1;

import java.util.Arrays;
import java.util.Collections;

//문자열 내림차순으로 배치하기
public class Ex8 {
    public static String solution(String s) {
        String answer = "";
        String[] array = s.split("");
        Arrays.sort(array, Collections.reverseOrder());
        answer = String.join("", array);
        return answer;
    }

    public static void main(String[] args) {
        String s = "abegiurbABCABC";
        System.out.println(solution(s));
    }
}
