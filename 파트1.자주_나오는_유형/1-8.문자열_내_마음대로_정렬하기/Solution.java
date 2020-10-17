import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        int NumberOfStrings = strings.length;

        for(int i = 0; i < NumberOfStrings; i++){
            strings[i] = strings[i].substring(n,n+1).concat(strings[i]);
        }

        Arrays.sort(strings);

        for(int i = 0; i < NumberOfStrings; i++){
            strings[i] = strings[i].substring(1,strings[i].length());
        }

        return strings;
    }
}