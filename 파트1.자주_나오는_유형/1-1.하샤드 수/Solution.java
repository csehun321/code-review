class Solution {
    public boolean solution(int x) {
        int num = 0;
        int divided = x;
        int left = 0;
        while(divided != 0){
            left = divided % 10;
            divided = divided/10;
            num = num + left;
        }
        if (x%num==0)
            return true;
        else
            return false;
    }
}