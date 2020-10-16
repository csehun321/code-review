import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {

        int[] answer = new int[2];

        ArrayList<String> player[] = new ArrayList[n];
        for(int i = 0; i < n; i++){
            player[i] = new ArrayList<String>();
        }

        int NumberOfWord = words.length;
        int CurrentWord = 0;

        while(CurrentWord != NumberOfWord) {
            for(int i = 0; i < n; i++){
                if(CurrentWord > 0 && words[CurrentWord].charAt(0) != words[CurrentWord-1].charAt(words[CurrentWord-1].length()-1)){
                    answer[0] = i + 1;
                    answer[1] = (CurrentWord / n) + 1;
                    return answer;
                }
                for(int j = 0; j < n; j++) {
                    if (player[j].contains(words[CurrentWord])) {
                        answer[0] = i + 1;
                        answer[1] = (CurrentWord / n) + 1;
                        return answer;
                    }
                }
                player[i].add(words[CurrentWord]);
                CurrentWord++;
            }

        }
        return answer;
    }
}