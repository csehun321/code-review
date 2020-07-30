public class Solution {
    public boolean solution(int x) {

        int x_copy=x;
        int num=0;

        while(x_copy>0){
            num+=x_copy/10;
            x_copy/=10;
        }
        
        //System.out.println("x"+x);
        //System.out.println("num"+num);

        return x/num==0?true:false;
    }
}
