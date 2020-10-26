import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] answers) {
        int max;
        Student st = new Student();
        int NumOfStudent = st.SetNumOfStudent();
        int[][] po = st.SetPattern(NumOfStudent);

        ArrayList<Integer> ans = new ArrayList();

        //int[][] po = {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        int student = po.length;
        int[] correct = new int[student];
        int[] sort = new int[student];

        int LengthOfAnswer = answers.length;

        for (int i = 0; i < student; i++) {
            for(int j = 0; j < LengthOfAnswer; j++){
                if (answers[j] == po[i][j%po[i].length]) {
                    correct[i]++;
                    sort[i]++;
                }
            }
        }
        Arrays.sort(sort);
        max = sort[sort.length-1];

        for(int i = 0; i < correct.length; i++){
            if(correct[i]==max){
                ans.add(i+1);
            }
        }

        int[] answer = new int[ans.size()];
        int size = 0;
        for(int i : ans){
            answer[size++] = i;
        }
        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }

        return answer;
    }
}

class Student {
    ArrayList<Integer> pattern = new ArrayList<>();
    public int SetNumOfStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("수포자 학생의 수를 입력하세요 : ");
        int NumOfStudent;
        NumOfStudent = sc.nextInt();

        return NumOfStudent;
    }

    public int[][] SetPattern(int NumOfStudent){
        int[][] patterns = new int[NumOfStudent][];
        int[] arr;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < NumOfStudent; i++) {
            System.out.println(i+1 + "번 학생의 패턴 길이를 입력하세요 : ");
            int length = sc.nextInt();
            System.out.println("패턴" + length + "개를 입력하세요 : ");
            arr = new int[length];
            for (int j = 0; j < length; j++) {
                arr[j] = sc.nextInt();
            }
            patterns[i] = arr;
        }
        return patterns;
    }

}