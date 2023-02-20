package Level1;

//콜라츠 추측
public class Ex24 {
    public static int solution(int num) {
        long answer = num;
        int index = 0;
        while (index <= 500) {
            if (answer % 2 == 0) {
                answer = answer / 2;
            } else {
                answer = answer * 3 + 1;
            }
            index++;
            if (answer == 1) {
                break;
            }
        }
        if (answer != 1) {
            index = -1;
        }
        if (num == 1) {
            index = 0;
        }
        return index;
    }

    private final int num;

    public Ex24(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Ex24 test1 = new Ex24(6);
        Ex24 test2 = new Ex24(16);
        Ex24 test3 = new Ex24(626331);
        System.out.println(solution(test1.num));
        System.out.println(solution(test2.num));
        System.out.println(solution(test3.num));
    }
}
