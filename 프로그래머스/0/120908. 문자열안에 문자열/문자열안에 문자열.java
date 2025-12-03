class Solution {
    public int solution(String str1, String str2) {
        boolean result1 = str1.contains(str2);
        return result1 ? 1 : 2;
    }
}