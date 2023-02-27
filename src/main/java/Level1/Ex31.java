package Level1;

//소수 만들기
public class Ex31 {
    public static int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i]+nums[j]+nums[k];

                    if(isPrime(sum)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private final int[] nums;

    public Ex31(int[] nums) {
        this.nums = nums;
    }

    public static void main(String[] args) {
        Ex31 test1 = new Ex31(new int[]{1, 2, 3, 4});
        Ex31 test2 = new Ex31(new int[]{1, 2, 7, 6, 4});
        System.out.println(solution(test1.nums));
        System.out.println(solution(test2.nums));
    }
}
