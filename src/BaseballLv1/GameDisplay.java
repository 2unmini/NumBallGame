package BaseballLv1;

import java.util.Scanner;

public class GameDisplay {
    Scanner sc = new Scanner(System.in);
    Validator validator=new Validator();
    private boolean check=true;
    public void gameStart(){
        BaseballGame baseballGame=new BaseballGame();
        while(check) {
            System.out.println("숫자를 입력해주세요");
            int num=validator.wholeCheck(sc.nextLine());
            if(num!=0){
                check = baseballGame.printStrikeBall(baseballGame.countStrike(num), baseballGame.countBall(num));
            }else {
                check=false;
            }
        }


    }
}
