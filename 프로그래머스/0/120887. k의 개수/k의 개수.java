class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char c = (char)(k + '0');

        for (int n = i; n <= j; n++){
            for (char ch: String.valueOf(n).toCharArray()){
                if (ch == c){
                    answer++;
                }
            }
        }
        return answer;
    }
}