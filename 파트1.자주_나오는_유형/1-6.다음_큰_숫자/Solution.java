public class Solution {
    private int numOfOne(final int n) {
        int num = n;
        int numOfOne = 0;
        while (num > 0) {
            if (num % 2 == 1) {
                numOfOne++;
            }
            num = num / 2;
        }
        return numOfOne;
    }

    public int solution(int n) {
        int answer = 0;
        int startNum = n + 1;

        int currentNum = numOfOne(n);
        while (true) {
            if (currentNum == numOfOne(startNum)) {
                answer = startNum;
                break;
            }
            startNum++;
        }
        return answer;
    }
}