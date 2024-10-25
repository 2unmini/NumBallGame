package BaseballLv4;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Result {

    int cntBall = 0;
    int cntStrike = 0;
    int count = 1;
    private ArrayList<Integer> historyList = new ArrayList<>();
    private ArrayList<Integer> randList;

    public int countBall(String input) {
        int[] nums = Stream.of(input.split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < this.randList.size(); i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && this.randList.get(i).equals(nums[j])) {
                    cntBall++;
                }
            }
        }
        return this.cntBall;
    }

    public int countStrike(String input) {
        int[] nums = Stream.of(input.split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < this.randList.size(); i++) {
            if (this.randList.get(i).equals(nums[i])) {
                this.cntStrike++;
            }
        }
        return cntStrike;
    }

    public boolean printStrikeBall(ArrayList<Integer> randList, String input) {
        this.randList = randList;
        this.cntBall = countBall(input);
        this.cntStrike = countStrike(input);
        if (this.cntStrike == this.randList.size()) {
            System.out.println("정답입니다. 축하합니다.");
            count++;
            historyList.add(count);
            return false;
        } else if (this.cntStrike == 0 && this.cntBall == 0) {
            System.out.println("아웃!!");
            count++;
        } else if (this.cntStrike > 0 && this.cntBall == 0) {
            System.out.println(cntStrike + " 스트라이크");
            count++;
        } else if (this.cntStrike == 0 && this.cntBall > 0) {
            System.out.println(cntBall + " 볼");
            count++;
        } else {
            System.out.println(cntStrike + " 스트라이크 " + cntBall + " 볼");
            count++;
        }
        this.cntStrike = 0;
        this.cntBall = 0;
        return true;

    }

    public void printHistory() {
        for (int i = 0; i < historyList.size(); i++) {
            System.out.println((i + 1) + "번째 게임 : 시도 횟수 - " + historyList.get(i));

        }
    }
}
