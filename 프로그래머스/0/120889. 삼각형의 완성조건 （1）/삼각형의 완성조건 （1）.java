import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);

        int longSet = sides[2];
        int sumOthers = sides[0] + sides[1];

        int i = longSet < sumOthers ? 1 : 2;

        return i;
    }
}