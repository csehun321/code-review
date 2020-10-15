class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0;
        int y = 0;

        int[][] map = new int[21][21];
        map[10][10] = 1;

        int length = dirs.length();

        for(int i = 0; i < length; i++){
            if("U".equals(dirs.substring(i,i+1)) && y<10){
                y+=2;
                map[10-y+1][10+x]+=1;
                if(map[10-y+1][10+x]==1)
                    answer++;
            }
            if("D".equals(dirs.substring(i,i+1)) && y>-10){
                y-=2;
                map[10-y-1][10+x]+=1;
                if(map[10-y-1][10+x]==1)
                    answer++;
            }
            if("R".equals(dirs.substring(i,i+1)) && x<10){
                x+=2;
                map[10-y][10+x-1]+=1;
                if(map[10-y][10+x-1]==1)
                    answer++;

            }
            if("L".equals(dirs.substring(i,i+1)) && x>-10){
                x-=2;
                map[10-y][10+x+1]+=1;
                if(map[10-y][10+x+1]==1)
                    answer++;

            }
        }
        /*for(int i = 0; i < 21; i++){
            for(int j = 0; j < 21; j++){
                System.out.print(map[i][j]);
            }
            System.out.println('\n');
        }*/

        return answer;
    }
}