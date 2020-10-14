class Solution {
    public int solution(int n) {
        int one = 0;

        one = count_one(n);
        while(true){
            ++n;
            if(one==count_one(n)){
                return n;
            }
        }
    }

    public int count_one(int num) {
        int one = 0;
        int divided = 0;

        while(num != 0){
            divided = num % 2;
            num = num / 2;
            if(divided == 1) {
                one++;
            }
        }

        return one;
    }
}
