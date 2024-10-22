package BaseballLv3.BaseballGame;


import BaseballLv3.History;
import BaseballLv3.Validation.*;

import java.util.Scanner;

public class GameDisplay {
    History history;

    public void gameStart() {
        boolean check = true;
        Ball ball = new Ball();
        Scanner sc = new Scanner(System.in);
        String num;
        System.out.println("환영합니다! 원하시는 번호를 입력해주세요.");
        System.out.println("1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기");
        int startExit = sc.nextInt();
        int answer=0;
        sc.nextLine();
        switch (startExit) {
            case 1:
                //기능
                while (check) {
                    System.out.println("숫자를 입력해주세요");
                    num = sc.nextLine();
                    Validator[] validators = {new NumberCheck(),new DigitsCheck(), new DuplicateCheck(),new ExceedOneCheck()};
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
                history.printHistory();

            case 3:
                System.out.println("< 숫자 야구 게임을 종료합니다. >");
                check=false;
            default:
                System.out.println("올바른 숫자를 입력해 주세요");

        }
    }
}
