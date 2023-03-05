package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//K번째수
public class Ex36 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                arrayList.add(array[j]);
            }
            Collections.sort(arrayList);
            answer[i] = arrayList.get(commands[i][2] - 1);
        }

        return answer;
    }

    private final int[] array;
    private final int[][] commands;

    public Ex36(int[] array, int[][] commands) {
        this.array = array;
        this.commands = commands;
    }

    public static void main(String[] args) {
        Ex36 test1 = new Ex36(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3},
                                                                          {4, 4, 1},
                                                                          {1, 7, 3}});
        System.out.println(Arrays.toString(solution(test1.array, test1.commands)));
    }
}
