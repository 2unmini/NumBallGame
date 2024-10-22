package BaseballLv2.BaseballGame;

import BaseballLv2.Validation.DigitsCheck;
import BaseballLv2.Validation.DuplicateCheck;
import BaseballLv2.Validation.ExceedOneCheck;
import BaseballLv2.Validation.Validator;
import java.util.Scanner;

public class GameDisplay {
    Validator validator;

    public void gameStart() {
        boolean check = true;
        Ball ball = new Ball();
        Scanner sc = new Scanner(System.in);
        String num;
        System.out.println("환영합니다! 원하시는 번호를 입력해주세요.");
        System.out.println("1. 게임 시작하기 2. 종료하기");
        int startExit = sc.nextInt();
        int answer=0;
        sc.nextLine();
        switch (startExit) {
            case 1:
                //기능
                while (check) {
                    System.out.println("숫자를 입력해주세요");
                    num = sc.nextLine();
                    Validator[] validators = {new DigitsCheck(), new DuplicateCheck(),new ExceedOneCheck()};
                    for (Validator validator : validators) {
                        if (!validator.validation(num)) {
                            answer=-1;
                            break;
                        }
                        answer=0;
                    }
                    if(answer==0) {
                        check = ball.printStrikeBall(ball.countStrike(Integer.parseInt(num)), ball.countBall(Integer.parseInt(num)));
                    }

                }
            case 2:
                check=false;

        }
    }
}
