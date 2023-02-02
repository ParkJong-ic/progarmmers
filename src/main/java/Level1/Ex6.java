package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//문자열 내 마음대로 정렬하기
public class Ex6 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(n, n + 1);
        }
        Arrays.sort(answer);
        ArrayList<String> stringArrayList = new ArrayList<>(List.of(strings));
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < stringArrayList.size(); j++) {
                if(stringArrayList.get(j).substring(n, n + 1).equals(answer[i])) {
                    answer[i] = stringArrayList.get(j);
                    stringArrayList.remove(stringArrayList.get(j));
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex6 ex6 = new Ex6();
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        System.out.println(Arrays.toString(ex6.solution(strings, n)));
    }
}
