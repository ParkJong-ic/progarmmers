package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//모의고사
public class Ex37 {
    public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] firstTester = new int[answers.length];
        int[] secondTester = new int[answers.length];
        int[] thirdTester = new int[answers.length];

        int firstTesterScore = 0;
        int secondTesterScore = 0;
        int thirdTesterScore = 0;

        for (int i = 0; i < answers.length; i++) {
            firstTester[i] = i % 5 + 1;
            if (i % 2 == 0) {
                secondTester[i] = 2;
            } else if (i == 1) {
                secondTester[i] = 1;
            } else {
                if (secondTester[i - 2] == 1) {
                    secondTester[i] = 3;
                } else if (secondTester[i - 2] == 3) {
                    secondTester[i] = 4;
                } else if (secondTester[i - 2] == 4) {
                    secondTester[i] = 5;
                } else {
                    secondTester[i] = 1;
                }
            }
            if (i % 10 == 0 || i % 10 == 1) {
                thirdTester[i] = 3;
            } else if (i % 10 == 2 || i % 10 == 3) {
                thirdTester[i] = 1;
            } else if (i % 10 == 4 || i % 10 == 5) {
                thirdTester[i] = 2;
            } else if (i % 10 == 6 || i % 10 == 7) {
                thirdTester[i] = 4;
            } else {
                thirdTester[i] = 5;
            }
        }

        List<Integer> answersList = new ArrayList<>();
        for (int j : answers) {
            answersList.add(j);
        }

        for (int i = 0; i < answers.length - 5; i++) {
            answersList.add(answersList.get(i));
        }

        for (int i = 0; i < answers.length; i++) {
            if (answersList.get(i) == firstTester[i]) {
                firstTesterScore++;
            }
        }
        for (int i = 0; i < answers.length; i++) {
            if (answersList.get(i) == secondTester[i]) {
                secondTesterScore++;
            }
        }
        for (int i = 0; i < answers.length; i++) {
            if (answersList.get(i) == thirdTester[i]) {
                thirdTesterScore++;
            }
        }

        int[] order = {firstTesterScore, secondTesterScore, thirdTesterScore};

        if (order[0] == order[1] && order[0] == order[2]) {
            answer = new int[]{1, 2, 3};
        } else if (order[0] == order[1] && order[0] > order[2]) {
            answer = new int[]{1, 2};
        } else if (order[0] == order[2] && order[0] > order[1]) {
            answer = new int[]{1, 3};
        } else if (order[1] == order[2] && order[1] > order[0]) {
            answer = new int[]{2, 3};
        } else if (order[0] > Math.max(order[1], order[2])) {
            answer = new int[]{1};
        } else if (order[1] > Math.max(order[0], order[2])) {
            answer = new int[]{2};
        } else if (order[2] > Math.max(order[0], order[1])) {
            answer = new int[]{3};
        }

        return answer;
    }

    private final int[] answers;

    public Ex37(int[] answers) {
        this.answers = answers;
    }

    public static void main(String[] args) {
        Ex37 test1 = new Ex37(new int[]{1, 2, 3, 4, 5});
        Ex37 test2 = new Ex37(new int[]{1, 3, 2, 4, 2});

        System.out.println(Arrays.toString(solution(test1.answers)));
//        System.out.println(Arrays.toString(solution(test2.answers)));
    }
}
