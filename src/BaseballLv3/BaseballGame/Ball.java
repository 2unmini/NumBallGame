package BaseballLv3.BaseballGame;


import java.util.stream.Stream;

public class Ball {
    int cntBall = 0;
    int cntStrike = 0;
    NumberCreate randNumber = new NumberCreate();


    public int countBall(int num) {
        int[] nums = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        for(int i=0;i<this.randNumber.getRandList().size();i++){
            for (int j = 0; j < nums.length; j++) {
                if(i!=j && randNumber.getRandList().get(i).equals(nums[j])){
                    cntBall++;
                }

            }
        }
        return this.cntBall;
    }

    public int countStrike(int num) {
        int[] nums = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < randNumber.getRandList().size(); i++) {
            if (this.randNumber.getRandList().get(i).equals(nums[i])) {
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
