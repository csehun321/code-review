import java.util.ArrayList;

class Solution {
    boolean solution(String s) {
        ArrayList<Integer> stack = new ArrayList<>();
        int length = s.length();
        for(int i = 0; i < length; i++){
            if(s.charAt(i)=='('){
                stack.add(0);
            }
            else if(s.charAt(i)==')'){
                if(stack.size()==0){
                    return false;
                }
                stack.remove(stack.size()-1);
            }
        }
        return stack.size()==0;
    }
}
