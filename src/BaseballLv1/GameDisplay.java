package BaseballLv1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameDisplay {
    Scanner sc = new Scanner(System.in);
    Validator validator=new Validator();
    public void gameStart(){
        BaseballGame baseballGame=new BaseballGame();
        System.out.println("숫자를 입력해주세요");
        int num = 0;
        try {
            num= sc.nextInt();
            validator.duplicateCheck(num);
        }catch (InputMismatchException e){
            System.out.println("[Error] 숫자를 입력해주세요");
        }
        baseballGame.printStrikeBall(baseballGame.countStrike(num), baseballGame.countBall(num) );



    }
}
