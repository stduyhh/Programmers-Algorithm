class Solution {
    public int[] solution(int[] num_list) {
        int[] rseult = new int[2];
        int a = 0;
        int b = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                rseult[0] = ++a;
            } else {
                rseult[1] = ++b;
            }
        }
        return rseult;
    }
}