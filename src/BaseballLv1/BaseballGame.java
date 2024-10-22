package BaseballLv1;

import java.util.*;
import java.util.stream.Stream;
/*
오류 났을때 안터지게 확인
범위를 1이상 확인
중복제거 스트림
 */

public class BaseballGame {
    int cntBall = 0;
    int cntStrike = 0;
    private ArrayList<Integer> list;
    BaseballGame(){
        this.list = RandomNumber();
        System.out.println(list);
    }

    private ArrayList<Integer> RandomNumber() {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size() != 3) {
            set.add(random.nextInt(9) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.shuffle(list);
        return list;
    }
    public int countBall(int num) {
        int[] nums = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        for(int i=0;i<this.list.size();i++){
            for (int j = 0; j < nums.length; j++) {
                if(i!=j && list.get(i).equals(nums[j])){
                    cntBall++;
                }

            }
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
        this.cntStrike=cntStrike;
        this.cntBall=cntBall;
        if (cntStrike == 3) {
            System.out.println("정답입니다. 축하합니다.");
            return false;
        } else if (cntStrike == 0 && cntBall == 0) {
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
