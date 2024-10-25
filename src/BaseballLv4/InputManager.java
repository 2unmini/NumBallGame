package BaseballLv4;

import java.util.Scanner;

public class InputManager {

    private Scanner scanner = new Scanner(System.in);// Scanner타입 변수

    public Scanner getScanner() {
        return scanner;
    }


    public String menuInput() {
        return scanner.nextLine();
    }

    public String getLevel() {
        return scanner.nextLine();
    }

    public String replayInput() {
        return scanner.nextLine();
    }

    public String myInput() {
        return scanner.nextLine();
    }

}
