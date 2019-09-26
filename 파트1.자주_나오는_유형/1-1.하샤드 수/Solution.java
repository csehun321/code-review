class Solution {

bool solution(int x) {
 
return (x % sumOfxDigit(x) == 0);
}
      // 1. 각 자리수를 구하기 위해서 10으로 나머지계산을 해준다. => 십진법
    // 2. sumOfxdigit 변수에 각 자리수를 더해준다. 10으로 나머지 계산을 하면서, 결국 마지막에 1의 자리보다 적으면 계산을 멈추게한다.

int sumOfxDigit(int x){
    int temp = x; 
    int sum  = 0;
    
    while(temp > 0){
        sum += temp%10;
        temp = temp/10;
    }
    
    return sum;
}
}
