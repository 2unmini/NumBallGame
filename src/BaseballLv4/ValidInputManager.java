package BaseballLv4;

import java.util.InputMismatchException;

public class ValidInputManager {
    private InputManager inputManager;
    private ValidManager validManager;
    private OutputManager outputManager;

    public ValidInputManager() {
        this.inputManager = new InputManager();
        this.validManager = new ValidManager();
    }

    public String isValidMenu(){
        String menuNum=inputManager.menuInput();
        if(!validManager.numberCheck(menuNum)){
            throw new InputMismatchException("유효하지 않은 메뉴 값 입니다." );
        }
        return menuNum;
    }

    public String isValidLevel(){
        String level=inputManager.getLevel();
        if(!validManager.levelCheck(level)){
            throw new IllegalArgumentException("유효하지 않은 레벨 값입니다: " );
        }
        return level;
    }
    public String isValidInput(){
        String input = inputManager.myInput();
        if(!validManager.integrationCheck(input)){
            throw new NumberFormatException("유효하지 않은 값입니다.");
        }
        return input;
    }
}

