class Solution {
    public int solution(int n, int t) {
            //n 세균 수
        //t 경과 시간
        for(int i = 0; i<t; i++){
            n *= 2;
        }
        return n;
    }
}