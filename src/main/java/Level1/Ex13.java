package Level1;

//문자열을 정수로 바꾸기
public class Ex13 {
    public static int soluiton(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        String s = "1234";
        System.out.println(soluiton(s));
    }
}
