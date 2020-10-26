import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> scov = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            scov.add(scoville[i]);
        }
        while(scov.peek() < K) {
            if(scov.size() == 1)
                return -1;
            int MostMin = scov.poll();
            int seconMin= scov.poll();
            int mix = MostMin + (seconMin*2);
            scov.add(mix);
            answer ++;
        }
        return answer;
    }
}