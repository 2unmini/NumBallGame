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
        int num = 0;
        System.out.println("환영합니다! 원하시는 번호를 입력해주세요.");
        System.out.println("1. 게임 시작하기 2. 종료하기");
        int startExit = sc.nextInt();
        switch (startExit) {
            case 1:
                //기능
                while (check) {
                    System.out.println("숫자를 입력해주세요");
                    try {
                        num = sc.nextInt();
                        validator = new DigitsCheck();
                        if (validator.validation(num)){
                            validator = new DuplicateCheck();
                            validator.validation(num);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("[Error] 숫자를 입력해주세요");

                    }
                }
            case 2:
                return;

        }
    }
}
