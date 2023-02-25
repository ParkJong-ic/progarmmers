package Level1;

import java.util.Arrays;

//행렬의 덧셈
public class Ex28 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    private final int[][] arr1;
    private final int[][] arr2;

    public Ex28(int[][] arr1, int[][] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public static void main(String[] args) {
        Ex28 test1 = new Ex28(new int[][]{{1, 2},
                                          {2, 3}},
                              new int[][]{{3, 4},
                                          {5, 6}});
        Ex28 test2 = new Ex28(new int[][]{{1},
                                          {2}},
                              new int[][]{{3},
                                          {4}});
        System.out.println(Arrays.deepToString(solution(test1.arr1, test1.arr2)));
        System.out.println(Arrays.deepToString(solution(test2.arr1, test2.arr2)));
    }
}
