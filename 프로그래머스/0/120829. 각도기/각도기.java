class Solution {
        int result;

    public int solution(int angle) {
        if (angle < 90){
            result = 1;
        } else if (angle == 90){
            result = 2;
        } else if (angle < 180){
            result = 3;
        } else if (angle == 180){
            result = 4;
        }
        return result;
    }
}