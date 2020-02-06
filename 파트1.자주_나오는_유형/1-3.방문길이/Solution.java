class Solution {
    public int solution(String dirs) {
        int answer = 0;

        int[][][][] map = new int[11][11][11][11];
        char[] cmd = dirs.toCharArray();

        Point point = new Point(5, 5);
    		Path path = new Path();

        for(int i = 0; i < cmd.length; i++){
            int afterX = point.x;
            int afterY = point.y;

            switch (cmd[i]){
                case 'U':
                    afterY += path.up;
                    break;
                case 'D':
                    afterY += path.down;
                    break;
                case 'R':
                    afterX += path.right;
                    break;
                case 'L':
                    afterX += path.left;
                    break;
                default:
            }

            if(rangeCheck(afterX, afterY)) continue;

            if(map[point.x][point.y][afterX][afterY] == 0){
                map[point.x][point.y][afterX][afterY] = 1;
                map[afterX][afterY][point.x][point.y] = 1;

                answer += 1;
            }

            point.move(afterX, afterY);
        }

            return answer;
        }

        private Boolean rangeCheck(int x, int y){
            return (x < 0 || x > 10 || y < 0 || y > 10);
        }

        class Point {
            int x = 0;
            int y = 0;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public void move(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }

      	class Path {
      		int up = 1;
              int down = -1;
      		int right = 1;
              int left = -1;

              public Path(){

              }
      	}
}
