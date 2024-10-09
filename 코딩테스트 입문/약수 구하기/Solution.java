class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        answer = new int[count];
        int index = 0;
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer[index++] = i;
            }
        }
        return answer;
    }
}
