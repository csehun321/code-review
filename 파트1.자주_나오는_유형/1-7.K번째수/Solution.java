import java.util.ArrayList;
public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> sub = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();

        int NumberOfCommands = commands.length;

        for(int i = 0; i < NumberOfCommands; i++){
            int start = commands[i][0]-1;
            int end = commands[i][1];
            for(int j = start; j < end; j++){
                sub.add(array[j]);
            }
            sub.sort(null);
            number.add(sub.get(commands[i][2]-1));
            sub.clear();
        }

        int[] ans = new int[number.size()];
        int size = 0;
        for(int temp : number){
            ans[size++]=temp;
        }
        return ans;
    }
}