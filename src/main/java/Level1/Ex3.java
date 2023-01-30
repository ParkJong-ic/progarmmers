package Level1;

import java.util.ArrayList;
import java.util.Arrays;

// 같은 숫자는 싫어
public class Ex3 {
    public int[] solution(int []arr) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(arr.length);
        integerArrayList.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(!(arr[i - 1] == arr[i])) {
                integerArrayList.add(arr[i]);
            }
        }
        System.out.println("Hello Java");
        return integerArrayList.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        Ex3 ex3 = new Ex3();
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(ex3.solution(arr)));
    }
}
