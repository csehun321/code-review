import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int max = 0;

        ArrayList<Integer> ans = new ArrayList();

        int[][] po = {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        int student = po.length;
        int[] correct = new int[student];
        int[] sort = new int[student];

        int LengthOfAnswer = answers.length;

        for (int i = 0; i < student; i++) {
            for(int j = 0; j < LengthOfAnswer; j++)
                if (answers[j] == po[i][j%po[i].length]) {
                    correct[i]++;
                    sort[i]++;
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