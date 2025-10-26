import java.util.Arrays;

class Solution {
  public int solution(int[] numbers) {
        int result = 0;
        int result2 = 0;
        Arrays.sort(numbers);
        result = numbers[numbers.length - 1];
        result2 = numbers[numbers.length - 2];
        int x = result * result2;
        return x;
    }
}