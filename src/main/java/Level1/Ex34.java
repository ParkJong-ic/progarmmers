package Level1;

//다트 게임
public class Ex34 {
    public static int solution(String dartResult) {
        int answer = 0;
        int[] dart = new int[3];
        int n = 0;
        int idx = 0;

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (c >= '0' && c <= '9') {
                str.append(c);

            } else if (c == 'S' || c == 'D' || c == 'T') {
                n = Integer.parseInt(str.toString());
                if (c == 'S') {
                    dart[idx++] = (int) Math.pow(n, 1);
                } else if (c == 'D') {
                    dart[idx++] = (int) Math.pow(n, 2);
                } else {
                    dart[idx++] = (int) Math.pow(n, 3);
                }
                str = new StringBuilder();
            } else {
                if (c == '*') {
                    dart[idx - 1] *= 2;
                    if (idx - 2 >= 0) dart[idx - 2] *= 2;
                } else {
                    dart[idx - 1] *= (-1);
                }
            }
        }
        answer = dart[0] + dart[1] + dart[2];
        return answer;
    }

    private final String dartResult;

    public Ex34(String dartResult) {
        this.dartResult = dartResult;
    }

    public static void main(String[] args) {
        Ex34 test1 = new Ex34("1S2D*3T");
        Ex34 test2 = new Ex34("1D2S#10S");
        Ex34 test3 = new Ex34("1D2S0T");
        Ex34 test4 = new Ex34("1S*2T*3S");
        Ex34 test5 = new Ex34("1D#2S*3S");
        Ex34 test6 = new Ex34("1T2D3D#");
        Ex34 test7 = new Ex34("1D2S3T*");
        System.out.println(solution(test1.dartResult));
        System.out.println(solution(test2.dartResult));
        System.out.println(solution(test3.dartResult));
        System.out.println(solution(test4.dartResult));
        System.out.println(solution(test5.dartResult));
        System.out.println(solution(test6.dartResult));
        System.out.println(solution(test7.dartResult));

    }
}
