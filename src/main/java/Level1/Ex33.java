package Level1;

import java.util.Arrays;
import java.util.Objects;

//[1차] 비밀지도
public class Ex33 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[][] str = new String[n][n];
        String[][] str2 = new String[n][n];
        array(n, arr1, str);
        array(n, arr2, str2);
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (Objects.equals(str[i][j], " ")) {
                    str[i][j] = str2[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (answer[i] == null) {
                answer[i] = "";
            }
            for (int j = 0; j < n; j++) {
                answer[i] += str[i][j];
            }
        }
        return answer;
    }

    private static void array(int n, int[] arr1, String[][] str) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i] >= Math.pow(2, n - 1 - j)) {
                    arr1[i] -= Math.pow(2, n - 1 - j);
                    str[i][j] = "#";
                    continue;
                } else {
                    str[i][j] = " ";
                }
                if (arr1[i] == 1 && j == n - 1) {
                    str[i][j] = "#";
                }
            }
        }
    }

    private final int n;
    private final int[] arr1;
    private final int[] arr2;

    public Ex33(int n, int[] arr1, int[] arr2) {
        this.n = n;
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public static void main(String[] args) {
        Ex33 test1 = new Ex33(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        Ex33 test2 = new Ex33(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10});
        System.out.println(Arrays.toString(solution(test1.n, test1.arr1, test1.arr2)));
        System.out.println(Arrays.toString(solution(test2.n, test2.arr1, test2.arr2)));
    }
}
