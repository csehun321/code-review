class Solution {
    public int solution(String dirs) {
        int answer = 0;

        int[][][][] map = new int[11][11][11][11];
        char[] cmd = dirs.toCharArray();

        int x = 5;
        int y = 5;

        for(int i = 0; i < cmd.length; i++){
            int afterX = x;
            int afterY = y;

            switch (cmd[i]){
                case 'U':
                    afterY += 1;
                    break;
                case 'D':
                    afterY -= 1;
                    break;
                case 'R':
                    afterX += 1;
                    break;
                case 'L':
                    afterX -= 1;
                    break;
                default:
            }

            if(rangeCheck(afterX, afterY)) continue;

            if(map[x][y][afterX][afterY] == 0){
                map[x][y][afterX][afterY] = 1;
                map[afterX][afterY][x][y] = 1;

                answer += 1;
            }

            x = afterX;
            y = afterY;
        }

        return answer;
    }

    private Boolean rangeCheck(int x, int y){
        return (x < 0 || x > 10 || y < 0 || y > 10);
    }
}
