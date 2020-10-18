import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        ArrayList<String> player = new ArrayList<>();
        Arrays.sort(participant);
        Arrays.sort(completion);
        int NumberOfPlayer = participant.length;
        for(int i = 0; i < NumberOfPlayer-1; i ++){
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[NumberOfPlayer-1];
    }
}