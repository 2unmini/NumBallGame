package BaseballLv1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameDisplay {
    Scanner sc = new Scanner(System.in);
    Validator validator=new Validator();
    public void gameStart(){

        System.out.println("숫자를 입력해주세요");
        try {
            validator.duplicateCheck(sc.nextInt());
        }catch (InputMismatchException e){
            System.out.println("[Error] 숫자를 입력해주세요");
        }



    }
}
