package Level1;

// 문자열 내 p와 y의 개수
public class Ex7 {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        System.out.println("Hello Java");
        for (int i = 0; i < s.length(); i++) {
            if ('p' == (s.charAt(i)) || 'P' == (s.charAt(i))) {
                pCount++;
            }
            if ('y' == (s.charAt(i)) || 'Y' == (s.charAt(i))) {
                yCount++;
            }
        }
        if (pCount == yCount) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex7 ex7 = new Ex7();
        String s = "pPoooyY";
        System.out.println(ex7.solution(s));
    }
}
