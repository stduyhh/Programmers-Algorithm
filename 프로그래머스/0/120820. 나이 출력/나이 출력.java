import java.time.LocalDate;

class Solution {
    public int solution(int age) {
        LocalDate date = LocalDate.now();
        int year = date.getYear();

        int result = (year - age)-2;
        return result;
    }
}