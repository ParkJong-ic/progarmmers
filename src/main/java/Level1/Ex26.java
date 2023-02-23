package Level1;

//하샤드 수
public class Ex26 {
    public static boolean solution(int x) {
        boolean answer = true;
        int num = x;
        int cnt = 0;
        while (num > 0) {
            cnt += num % 10;
            num = num / 10;
        }
        if (x % cnt != 0) {
            answer = false;
        }
        return answer;
    }

    private final int arr;

    public Ex26(int arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        Ex26 test1 = new Ex26(10);
        Ex26 test2 = new Ex26(12);
        Ex26 test3 = new Ex26(11);
        Ex26 test4 = new Ex26(13);
        System.out.println(solution(test1.arr));
        System.out.println(solution(test2.arr));
        System.out.println(solution(test3.arr));
        System.out.println(solution(test4.arr));
    }
}
