class Solution {
    public int solution(int n) {
        int one = 0;
        one = CountOne(n);
        while(one!=CountOne(n+1)) {
            n++;
        }
        return n+1;
    }

    private int CountOne(int num) {
        int one = 0;
        while(num != 0){
            int divided;
            divided = num & 1;
            num = num >> 1;
            if(divided == 1) {
                one++;
            }
        }

        return one;
    }
}
