package Level1;

// 2016년
public class Ex1 {
    public String solution(int a, int b) {
        String[] week = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int x = 0;
        for(int i = 0; i < a - 1; i++) {
            x += month[i];
        }
        x += b -1;
        return week[x % 7];
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        int a = 5;
        int b = 24;
        System.out.println(ex1.solution(a, b));

    }
}
