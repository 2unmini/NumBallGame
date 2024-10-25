package BaseballLv4;

import java.util.Scanner;

public class InputManager {

    private Scanner scanner = new Scanner(System.in);


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

    public String errorInput(String error) {
        return error;
    }

    public String runInput() {
        return scanner.nextLine();
    }

}
