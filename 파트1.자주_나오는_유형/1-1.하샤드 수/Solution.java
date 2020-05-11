public class Solution {
    public bool solution(int x) {
        boolean answer = true;

        int checkTempNum1 = 0;
        int checkTempNum2 = 0;
        int checkTempNum3 = x;

        while (true) {
            checkTempNum1 += checkTempNum3 % 10;
            checkTempNum2 = checkTempNum3 / 10;

            if (checkTempNum2 < 10) {
                break;
            }

            checkTempNum3 = checkTempNum2;
        }

        int checkTempSum = checkTempNum1 + checkTempNum2;

        if ( x % checkTempSum != 0 ){
            answer = false;
        }

        return answer;
    }
}
