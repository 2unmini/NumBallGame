package BaseballLv4;




/*볼수, countBall();
 스크라이크 countStrike();
 볼수 스크라이크결과랑(출력) printResult();
 ========================================================
 [입력 기능이 쓰임]
 랜덤 수 출력해주는 기능
 유효성(자릿수, 중복 ,숫자인지,0이상인지)(출력) Validation
 3~5까지 (출력) LevelManager
 히스토리 기능 (출력) History (입력기능이 쓰임)
 사용자 입력(입력) ScannerManager
 콘솔 창 기능(출력) gameConsole

 ScannerManager 메소드              =>GameStarter
 display 콘솔에 이쁘게 출력하는 기능
*/

import java.util.ArrayList;

public class BaseballGame {
    private InputManager inputManager;
    private OutputManager outputManager;
    private ValidManager validManager;
    private LevelManager levelManager;
    private RandomNumGenerator randomNumGenerator;
    private Result result;

    private boolean running;
    String input;

    public BaseballGame(){
        this.inputManager = new InputManager();
        this.outputManager = new OutputManager();
        this.levelManager = new LevelManager();
        this.validManager = new ValidManager();
        this.randomNumGenerator = new RandomNumGenerator();
        this.result = new Result();
        this.running = true;

    }

    public void start(){
        while (this.running){
            outputManager.startMessage();
            String menuNum=inputManager.menuInput();
            switch (menuNum){
                case "0":
                    outputManager.levelSetMessage();
                    String levelNum = inputManager.getLevel();// 레벨 입력
                    if(!validManager.levelCheck(levelNum)){// 레벨 검사
                        outputManager.replayInputMessage();
                        levelNum=inputManager.replayInput();
                    }
                    levelNum= levelManager.setLevel(levelNum); // 설정한 레벨
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
    public void run(ArrayList<Integer> randomList){
        boolean check=true;
        while (check) {
            outputManager.runningMessage();
            String input = inputManager.myInput(); //나의 입력값
            if (!validManager.integrationCheck(input)){
                input=inputManager.replayInput();
            }
            if (!validManager.integrationCheck(input)) {
                outputManager.replayInputMessage();
            }
            check =result.printStrikeBall(randomList, input);
        }
       /* result=new Result(this.levelManager);
        while (true) {
            outputManager.runningMessage();
            inputManager=new InputManager();

            inputManager.scan();
            String scanNum=inputManager.getNum();
            if(
            !result.printStrikeBall(scanNum)){
                break;
            }


        }*/
    }
    public void end(){
        outputManager.endMessage();
        this.running=false;
    }
    public void history(){

        result.printHistory();


    }
}
