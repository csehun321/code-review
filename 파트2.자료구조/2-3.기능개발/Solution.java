import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int NumOfProgress = progresses.length;
        Queue<Integer> time = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int cnt = 0;
        for(int i = 0; i < NumOfProgress; i++){
            while(progresses[i]<100) {
                progresses[i] += speeds[i];
                cnt++;
            }
            time.offer(cnt);
            cnt = 0;
        }
        int prevQueue = time.poll();
        int cnt2 = 1;
        while(!time.isEmpty()){
            int nextQueue = time.poll();
            if(prevQueue >= nextQueue){
                cnt2++;
            }
            if(prevQueue < nextQueue){
                prevQueue = nextQueue;
                ans.add(cnt2);
                cnt2 = 1;
            }
        }
        ans.add(cnt2);
        int SizeOfAnswer = ans.size();
        int[] answer = new int[SizeOfAnswer];
        for(int i = 0; i < SizeOfAnswer; i++){
            answer[i] = ans.get(i);
        }

        return answer;
    }
}