
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String numbers = my_string.replaceAll("[^0-9]", "");

        int[] arr = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            arr[i] = Character.getNumericValue(numbers.charAt(i));
        }
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}