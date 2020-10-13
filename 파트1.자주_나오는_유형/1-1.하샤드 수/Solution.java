class Solution {
    public boolean solution(int x) {
        String temp = Integer.toString(x);
        int[] digits = new int[temp.length()];
        
        int sum = 0;
        
        for (int i = 0; i < temp.length(); i++){
            digits[i] = temp.charAt(i) - '0';
            sum += digits[i];
        }
        
        return x%sum==0;
    }
}
