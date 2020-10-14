class Solution {
    public boolean solution(int x) {
        int num = 0;
        if(x<10){
            return true;
        }
        else if(x>=10 && x<100){
            num = x/10 + x%10;
            if (x%num==0)
                return true;
        }
        else if(x>=100 && x<1000){
            num = x/100 + (x%100)/10 + (x%100)%10;
            if (x%num==0)
                return true;
        }
        else if(x>=1000 && x<10000){
            num = x/1000 + (x%1000)/100 + ((x%1000)%100)/10 + ((x%1000)%100)%10;
            if (x%num==0)
                return true;
        }
        else
            return true;
        return false;
    }
}
