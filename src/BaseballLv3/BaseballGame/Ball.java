package BaseballLv3.BaseballGame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.Stream;

public class Ball {
    int cntBall = 0;
    int cntStrike = 0;
    ArrayList<Integer> randList;
    Ball(){
        this.randList=RandomNumber();

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
        int[] nums = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        for(int i=0;i<this.randList.size();i++){
            for (int j = 0; j < nums.length; j++) {
                if(i!=j && randList.get(i).equals(nums[j])){
                    cntBall++;
                }

            }
        }
        return this.cntBall;
    }

    public int countStrike(int num) {
        int[] nums = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < this.randList.size(); i++) {
            if (this.randList.get(i).equals(nums[i])) {
                this.cntStrike++;
            }
        }
        return cntStrike;
    }

    public boolean printStrikeBall(int cntStrike, int cntBall) {
        this.cntStrike=cntStrike;
        this.cntBall=cntBall;
        if (cntStrike == 3) {
            System.out.println("정답입니다. 축하합니다.");
            return false;
        } else if (cntStrike == 0 && cntBall == 0 ) {
            System.out.println("아웃!!");
        } else if (cntStrike >0 && cntBall==0) {
            System.out.println(cntStrike + " 스트라이크");
        }else if(cntStrike ==0 && cntBall>0){
            System.out.println(cntBall+" 볼");
        } else {
            System.out.println(cntStrike + " 스트라이크 " + cntBall + " 볼");
        }
        this.cntStrike=0;
        this.cntBall=0;
        return true;

    }




}
