class Solution {
   public int[] solution(int[] answers) {
        int[] aPattern = {1, 2, 3, 4, 5};
        int[] bPattern = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] cPattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int aCorrectCnt = getCorrectCount(aPattern, answers);
        int bCorrectCnt = getCorrectCount(bPattern, answers);
        int cCorrectCnt = getCorrectCount(cPattern, answers);

        int[] correctArray = {aCorrectCnt, bCorrectCnt, cCorrectCnt};

        return getMostCorrectStudent(correctArray);
    }

    public int getCorrectCount(int[] pattern,int[] answers){
        int patternCnt = 0;
        int correct = 0;

        for(int i = 0; i < answers.length; i++){

            if(answers[i] == pattern[patternCnt]) correct += 1;

            patternCnt += 1;

            if(patternCnt == pattern.length) patternCnt = 0;
        }

        return correct;
    }

    public int[] getMostCorrectStudent(int[] correctArray){
        int[] winList = new int[3];
        int winListCount = 0;

        int bestScore = getBestScore(correctArray);

        for(int i = 0; i < 3; i++){
            if(correctArray[i] == bestScore){
                winList[winListCount] = i + 1;
                winListCount++;
            }
        }

        int[] answer = new int[winListCount];

        for(int i = 0; i < answer.length ; i++){
            answer[i] = winList[i];
        }

        return answer;
    }

    public int getBestScore(int[] correctArray){
        int bestScore = correctArray[0];

        for(int i = 0; i < 3; i++){
            if(correctArray[i] > bestScore){
                bestScore = correctArray[i];
            }
        }

        return bestScore;
    }

}
