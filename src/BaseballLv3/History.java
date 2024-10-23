package BaseballLv3;

import java.util.ArrayList;

public class History {
    public int count =1;
    public ArrayList<Integer> historyList;

    public History() {
         this.historyList = new ArrayList<>();
    }


    public void printHistory() {
        for (int i = 0; i < historyList.size(); i++) {
            System.out.println((i + 1) + "번째 게임 : 시도 횟수 - " + historyList.get(i));

        }

    }


}
