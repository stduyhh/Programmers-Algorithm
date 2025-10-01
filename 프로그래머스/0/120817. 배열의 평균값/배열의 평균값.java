class Solution {
    public double solution(int[] numbers) {
        double result = 0;
        int sum = 0;

        for( int num : numbers ){
            sum += num;
        }
        double av = sum;
        int avg = numbers.length;
        result = av / avg;
        return result;
    }
}