package BaseballLv4;

public class ValidInputManager {
    private InputManager inputManager;
    private ValidManager validManager;

    public ValidInputManager() {
        this.inputManager = new InputManager();
        this.validManager = new ValidManager();
    }

    public String isValidMenu() {
        String menuNum = inputManager.menuInput();
        if (!validManager.numberCheck(menuNum)) {
            return "error";
        }
        return menuNum;
    }

    public String isValidLevel() {
        String level = inputManager.getLevel();
        if (!validManager.levelCheck(level)) {
            return "error";
        }
        return level;
    }

    public String isValidInput() {
        String input = inputManager.myInput();
        if (!validManager.integrationCheck(input)) {
            return "error";
        }
        return input;
    }
}

