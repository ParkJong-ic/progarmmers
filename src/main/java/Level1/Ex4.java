package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 나누어 떨어지는 숫자 배열
public class Ex4 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(arr.length);
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                integerArrayList.add(arr[i]);
            }
        }
        if(integerArrayList.size() < 1) {
            integerArrayList.add(-1);
        }
        Collections.sort(integerArrayList);
        return integerArrayList.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        Ex4 ex4 = new Ex4();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(ex4.solution(arr, divisor)));
    }

}
