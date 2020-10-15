class Solution {
    public int solution(int n) {
        int one = 0;

        one = CountOne(n);
        while(true){
            ++n;
            if(one==CountOne(n)){
                return n;
            }
        }
    }

    private int CountOne(int num) {
        int one = 0;
        int divided = 0;

        while(num != 0){
            divided = num % 2;
            num = num >> 1;
            if(divided == 1) {
                one++;
            }
        }

        return one;
    }
}
