package BaseballLv4.BaseballGame;



import BaseballLv4.History;
import BaseballLv4.Validation.*;

import java.util.Scanner;

public class GameDisplay {

    public void gameStart() {
        boolean check = true;
        History history = new History();
        Scanner sc = new Scanner(System.in);
        String num;
        while (check) {
            Ball ball = new Ball();
            System.out.println("환영합니다! 원하시는 번호를 입력해주세요.");
            System.out.println("1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기");
            int startExit = sc.nextInt();
            sc.nextLine();
            int answer=0;
            while (answer==0) {

                switch (startExit) {

                    case 1:
                        //기능

                        System.out.println("숫자를 입력해주세요");
                        num = sc.nextLine();
                        Validator[] validators = {new NumberCheck(), new DigitsCheck(), new DuplicateCheck(), new ExceedOneCheck()};
                        for (Validator validator : validators) {
                            if (!validator.validation(num)) {
                                answer = -1;
                                break;
                            }
                        }

                        if (answer == 0) {
                            if(ball.printStrikeBall(ball.countStrike(Integer.parseInt(num)), ball.countBall(Integer.parseInt(num)))){
                                history.count++;
                            }else {
                                history.historyList.add(history.count);
                                history.count=1;
                                answer=-1;
                                break;
                            }
                        }
                        break;


                    case 2:
                        history.printHistory();
                        answer=-1;
                        break;

                    case 3:
                        System.out.println("< 숫자 야구 게임을 종료합니다. >");
                        answer=-1;
                        check=false;
                        break;
                    default:
                        System.out.println("값이 올바르지 않습니다");
                        answer= -1;
                }
            }
        }
    }
}
