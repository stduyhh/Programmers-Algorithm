class Solution {
    public int solution(int n) {
          int pizza = 7;
        int result = 0;

        if ( n % pizza == 0){   // 7명이 최소 1판이 필요함.
            result = n / pizza;  //n명이 피자가 필요한 갯수.
        } else{
            result = n / pizza + 1;  //홀수로 인원이 남는경우 피자 1판이 필요함.
        }
        return result;
    }
}