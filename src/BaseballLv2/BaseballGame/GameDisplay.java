package BaseballLv2.BaseballGame;

import BaseballLv2.Validation.DigitsCheck;
import BaseballLv2.Validation.DuplicateCheck;
import BaseballLv2.Validation.Validator;

import java.util.InputMismatchException;
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
        sc.nextLine();
        switch (startExit) {
            case 1:
                //기능
                while (check) {
                    System.out.println("숫자를 입력해주세요");
                    num = sc.nextLine();
                    Validator[] validators = {new DigitsCheck(), new DuplicateCheck()};
                    for (Validator validator : validators) {
                        if (!validator.validation(num)) {
                            break;
                        }
                    }

                }
            case 2:
                check=false;

        }
    }
}
