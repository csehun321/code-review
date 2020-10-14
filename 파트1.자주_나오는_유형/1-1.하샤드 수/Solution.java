class Solution {
    public boolean solution(int x) {
        int num = 0;
        if(x<10){
            return true; //한자리수는 하샤드 수임
        }
        else if(x>=10 && x<100){
            num = x/10 + x%10; //두자리수는 10으로 나눈 몫과 나머지를 합침
            if (x%num==0)
                return true; 
        }
        else if(x>=100 && x<1000){
            num = x/100 + (x%100)/10 + (x%100)%10; //세자리수는 100으로 나눈 몫과 100으로 나눈 나머지를 10으로 나눈 몫과 나머지를 모두 더한다
            if (x%num==0)
                return true; 
        }
        else if(x>=1000 && x<10000){
            num = x/1000 + (x%1000)/100 + ((x%1000)%100)/10 + ((x%1000)%100)%10; //네자리수도 마찬가지 방법으로 진행
            if (x%num==0)
                return true;
        }
        else
            return true;
        return false;
    }
}
