package Level1;

import java.util.stream.Stream;

//자릿수 더하기
public class Ex17 {
    public static int solution(int n) {
        int answer = 0;
        int[] intList = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < intList.length; i++) {
            answer += intList[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 987;
        System.out.println(solution(n));
    }
}
