class Solution {
    public boolean solution(int x) {
        int num = 0;
        int divided = x;
        while(divided != 0){
            int left;
            left = divided % 10;
            divided = divided/10;
            num = num + left;
        }
        return x%num==0;
    }
}