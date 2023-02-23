package Level1;

//핸드폰 번호 가리기
public class Ex27 {
    public static String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        String[] str = phone_number.split("");
        for (int i = 0; i < str.length; i++) {
            if (str.length - i > 4) {
                str[i] = "*";
            }
        }
        for (String s : str) {
            answer.append(s);
        }
        return answer.toString();
    }

    private final String phone_number;

    public Ex27(String phone_number) {
        this.phone_number = phone_number;
    }

    public static void main(String[] args) {
        Ex27 test1 = new Ex27("01033334444");
        Ex27 test2 = new Ex27("027778888");
        System.out.println(solution(test1.phone_number));
        System.out.println(solution(test2.phone_number));
    }
}
