package BaseballLv4;

import java.util.ArrayList;

public class BaseballGame {
    private OutputManager outputManager; // 출력 클래스
    private LevelManager levelManager; // 레벨 관리 클래스
    private RandomNumGenerator randomNumGenerator; // 랜덤 수 생성 클래스
    private boolean running; // 게임 실행 상태
    private Result result; // 게임 결과 클래스
    private ValidInputManager validInputManager; // 올바른 입력값 관리 클래스

    public BaseballGame() {
        this.outputManager = new OutputManager();
        this.levelManager = new LevelManager();
        this.randomNumGenerator = new RandomNumGenerator();
        this.result = new Result();
        this.validInputManager = new ValidInputManager();
        this.running = true; //
    }

    public void start() {
        while (this.running) {  // 게임 실행 상태가 false가 될때 까지 수행
            outputManager.startMessage();
            String menuNum = validInputManager.isValidMenu(); // 메뉴 선택 입력기능()
            switch (menuNum) {
                case "0":
                    outputManager.levelSetMessage();
                    String levelNum = validInputManager.isValidLevel();//  레벨 입력
                    if (isVaildLevel(levelNum))
                        continue;
                    levelNum = levelManager.controlLevel(levelNum); // 설정한 레벨
                    outputManager.changeLevelMessage(levelNum);
                    break;
                case "1":
                    randomNumGenerator = new RandomNumGenerator();
                    ArrayList<Integer> randomList = randomNumGenerator.generate(levelManager);// 생성한 랜덤 수로 만든 ArrayList
                    run(randomList); // 게임 시작
                    break;
                case "2":
                    history(); // 게임 진행 횟수 목록
                    break;
                case "3":
                    end(); // 종료
                    break;
                default:
                    outputManager.errMessage("올바른 값이 아닙니다."); //1,2,3이 아니면 errMessage 출력
            }
        }
    }

    private static boolean isVaildLevel(String levelNum) {
        if (levelNum.equals("error")) {
            return true;
        }
        return false;
    }

    public void run(ArrayList<Integer> randomList) {
        boolean check = true;
        while (check) {
            outputManager.runningMessage();
            String input = validInputManager.isValidInput();//나의 입력값
            if (input.equals("error")) {
                continue;
            }
            check = result.printStrikeBall(randomList, input);
        }
    }

    public void end() {
        outputManager.endMessage();
        this.running = false;
    }

    public void history() {
        outputManager.historyMessage(result.sendHistoryList());
    }

}
