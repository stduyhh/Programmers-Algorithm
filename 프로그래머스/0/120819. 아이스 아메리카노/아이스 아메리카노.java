import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int money) {
        int coffee = 5500;

        ArrayList<Integer> list = new ArrayList();

        // 커피 잔의 개수
        int x = money / coffee;
        list.add(x);

        // 커피 사고 남은 잔액
        for (int i = 0; i < x; i++){
            money -= coffee;
        }

        list.add(money);

        return list;
    }
}