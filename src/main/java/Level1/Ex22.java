package Level1;

//짝수와 홀수
public class Ex22 {
    public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println(solution(num));
    }
}
