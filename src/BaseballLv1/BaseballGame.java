package BaseballLv1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.Stream;

public class BaseballGame {
    private int cntBall = 0;
    private int cntStrike = 0;
    private ArrayList<Integer> list;
    BaseballGame(){
        this.list = RandomNumber();
    }

    private ArrayList<Integer> RandomNumber() {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size() != 3) {
            set.add(random.nextInt(9) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        return list;
    }
    public int countBall(int num) {
        while (num > 0) {
            if (this.list.contains(num % 10)) {
                this.cntBall++;
            }
            num /= 10;
        }
        return this.cntBall;
    }
    public int countStrike(int num) {
        int[] nums = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).equals(nums[i])) {
                this.cntStrike++;
            }
        }
        return cntStrike;
    }
    public boolean printStrikeBall(int cntStrike, int cntBall) {
        if (cntStrike == 3) {
            System.out.println("정답입니다. 축하합니다.");
            return false;
        } else if (cntStrike == 0 && cntBall == 0) {
            System.out.println("아웃!!");
        } else if (cntStrike == cntBall) {
            System.out.println(cntStrike + " 스트라이크");
        }else if(cntStrike==0){
            System.out.println(cntBall+" 볼");
        } else {
            System.out.println(cntStrike + " 스트라이크 " + cntBall + " 볼");
        }
        cntStrike=0;
        cntBall=0;
        return true;

    }



}
