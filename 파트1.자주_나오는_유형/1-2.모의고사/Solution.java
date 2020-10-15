import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {

        int[] correct = new int[3];
        int[] sort = new int[3];
        int max = 0;

        ArrayList<Integer> ans = new ArrayList();

        int[] po1 = {1, 2, 3, 4, 5};
        int[] po2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] po3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == po1[i%5]) {
                correct[0]++;
                sort[0]++;
            }
            if (answers[i] == po2[i%8]) {
                correct[1]++;
                sort[1]++;
            }
            if (answers[i] == po3[i%10]) {
                correct[2]++;
                sort[2]++;
            }
        }
        Arrays.sort(sort);
        max = sort[sort.length-1];

        for(int i = 0; i < correct.length; i++){
            if(correct[i]==max){
                ans.add(i+1);
            }
        }

        int[] answer = new int[ans.size()];
        int size = 0;
        for(int i : ans){
            answer[size++] = i;
        }

        return answer;
    }
}