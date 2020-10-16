class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0;
        int y = 0;

        int[][] map = new int[21][21];

        int length = dirs.length();

        for(int i = 0; i < length; i++) {

            char move = dirs.charAt(i);

            if ('U' == move && y < 10) {
                y += 2;
                map[10 - y + 1][10 + x] += 1;
                if (map[10 - y + 1][10 + x] == 1)
                    answer++;
            }
            if ('D' == move && y > -10) {
                y -= 2;
                map[10 - y - 1][10 + x] += 1;
                if (map[10 - y - 1][10 + x] == 1)
                    answer++;
            }
            if ('R' == move && x < 10) {
                x += 2;
                map[10 - y][10 + x - 1] += 1;
                if (map[10 - y][10 + x - 1] == 1)
                    answer++;

            }
            if ('L' == move && x > -10) {
                x -= 2;
                map[10 - y][10 + x + 1] += 1;
                if (map[10 - y][10 + x + 1] == 1)
                    answer++;

            }
        }

        return answer;
    }
}