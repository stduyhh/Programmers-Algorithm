class Solution {
        int x = 12000;
        int y = 2000;
        int result = 0;

    public int solution(int n, int k) {
        if (n/10 >=1 ){
            result = (x*n)+(y*k)-((n/10)*2000);
        } else {
            result = (x*n)+(y*k);
        }
        return result;
    }
}