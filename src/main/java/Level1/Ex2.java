package Level1;

// 가운데 글자 가져오기
public class Ex2 {
    public String solution(String s) {
        return s.length() % 2 == 0 ? s.substring(s.length() / 2 - 1, s.length() / 2 + 1) : s.substring(s.length() / 2, s.length() / 2 + 1);
    }

    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        String s = "abcde";
        System.out.println(ex2.solution(s));

    }
}
