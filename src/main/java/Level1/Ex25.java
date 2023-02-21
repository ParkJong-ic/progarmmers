package Level1;

//평균 구하기
public class Ex25 {
    public static double solution(int[] arr) {
        double cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
        }
        return cnt / arr.length;
    }

    private final int[] arr;

    public Ex25(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        Ex25 test1 = new Ex25(new int[]{1, 2, 3, 4});
        Ex25 test2 = new Ex25(new int[]{5, 5});
        System.out.println(solution(test1.arr));
        System.out.println(solution(test2.arr));
    }
}
