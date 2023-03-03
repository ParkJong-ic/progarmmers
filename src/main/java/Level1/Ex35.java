package Level1;

import java.util.Arrays;

//완주하지 못한 선수
public class Ex35 {
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (participant[i].equals(completion[i])) {
            } else {
                return participant[i];
            }
        }

        return participant[participant.length - 1];
    }

    private final String[] participant;
    private final String[] completion;

    public Ex35(String[] participant, String[] completion) {
        this.participant = participant;
        this.completion = completion;
    }

    public static void main(String[] args) {
        Ex35 test1 = new Ex35(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        Ex35 test2 = new Ex35(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
        Ex35 test3 = new Ex35(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});

        System.out.println(solution(test1.participant, test1.completion));
        System.out.println(solution(test2.participant, test2.completion));
        System.out.println(solution(test3.participant, test3.completion));
    }
}
