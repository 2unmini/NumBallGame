package BaseballLv4;

import java.util.ArrayList;

public class BaseballGame {
    private InputManager inputManager; // 입력 클래스
    private OutputManager outputManager; // 출력 클래스
    private ValidManager validManager; // 유효성 검사 클래스
    private LevelManager levelManager; // 레벨 관리 클래스
    private RandomNumGenerator randomNumGenerator; // 랜덤 수 생성 클래스
    private boolean running; // 게임 실행 상태
    private Result result; // 게임 결과 클래스

    public BaseballGame() {
        this.inputManager = new InputManager();
        this.outputManager = new OutputManager();
        this.levelManager = new LevelManager();
        this.validManager = new ValidManager();
        this.randomNumGenerator = new RandomNumGenerator();
        this.result = new Result();
        this.running = true;
    }

    public void start() {
        while (this.running) {
            outputManager.startMessage();
            String menuNum = inputManager.menuInput();
            switch (menuNum) {
                case "0":
                    outputManager.levelSetMessage();
                    String levelNum = inputManager.getLevel();// 레벨 입력
                    if (!validManager.levelCheck(levelNum)) {// 레벨 검사
                        outputManager.replayInputMessage();
                        levelNum = inputManager.replayInput();
                    }
                    levelNum = levelManager.setLevel(levelNum); // 설정한 레벨
                    outputManager.changeLevelMessage(levelNum);
                    break;
                case "1":
                    randomNumGenerator = new RandomNumGenerator();
                    ArrayList<Integer> randomList = randomNumGenerator.generate(levelManager);
                    run(randomList);
                    break;
                case "2":
                    history();
                case "3":
                    end();
                default:
                    outputManager.errMessage("올바른 값이 아닙니다.");
            }
        }
    }

    public void run(ArrayList<Integer> randomList) {
        boolean check = true;
        while (check) {
            outputManager.runningMessage();
            String input = inputManager.myInput(); //나의 입력값
            if (!validManager.integrationCheck(input)) {
                input = inputManager.replayInput();
            }
            if (!validManager.integrationCheck(input)) {
                outputManager.replayInputMessage();
            }
            check = result.printStrikeBall(randomList, input);
        }
    }

    public void end() {
        outputManager.endMessage();
        this.running = false;
    }

    public void history() {
        /*
        todo
         */
        result.printHistory();


    }
}
