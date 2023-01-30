package Level1;

// 두 정수 사이의 합
public class Ex5 {
    public long solution(int a, int b) {
        long answer = 0;
        for(int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex5 ex5 = new Ex5();
        int a = 3;
        int b = 5;
        System.out.println(ex5.solution(a, b));
    }
}
