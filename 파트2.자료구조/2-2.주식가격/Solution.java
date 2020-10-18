class Solution {
    public int[] solution(int[] prices) {
        int length = prices.length;
        int[] time = new int[length];
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                if (prices[i] > prices[j]) {
                    time[i] = j-i;
                    break;
                }
                if (j==time.length-1)
                    time[i] = j-i;
            }
        }
        return time;
    }
}