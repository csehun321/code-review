import java.util.ArrayList;
class Solution {
    public int solution(String skill, String[] SkillTree) {
        int answer = 0;
        int NumberOfTree = SkillTree.length;

        ArrayList<Integer> index = new ArrayList<>();

        for(int i = 0; i < NumberOfTree; i++){
            int lengthOfSkill = skill.length();
            for(int j = 0; j < lengthOfSkill; j++){
                if(!SkillTree[i].contains(skill.substring(j,j+1)))
                    index.add(SkillTree[i].length());
                else
                    index.add(SkillTree[i].indexOf(skill.charAt(j)));
            }
            answer++;

            for(int k = 1; k < lengthOfSkill; k++){
                if(index.get(k-1)>index.get(k)){
                    answer--;
                    break;
                }
            }
            index.clear();
        }

        return answer;
    }
}