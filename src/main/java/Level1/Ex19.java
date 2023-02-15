package Level1;

import java.util.ArrayList;
import java.util.Collections;

//정수 내림차순으로 배치하기
public class Ex19 {
    public static long solution(long n) {
        long answer = 0;
        long num = n;
        ArrayList<Long> arrayList = new ArrayList<>();
        for (int i = 0; num != 0; i++) {
            arrayList.add(num % 10);
            num /= 10;
        }
        arrayList.sort(Collections.reverseOrder());
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            s.append(arrayList.get(i));
        }
        answer = Long.parseLong(String.valueOf(s));
        return answer;
    }

    public static void main(String[] args) {
        long n = 118372;
//        118372
        System.out.println(solution(n));
    }
}
