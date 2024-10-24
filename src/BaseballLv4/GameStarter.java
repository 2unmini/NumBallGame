package BaseballLv4;

import BaseballLv4.BaseballGame.GameDisplay;
import BaseballLv4.BaseballGame.NumberCreater;

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


public class GameStarter {
    private ScannerManager scannerManager;
    private GameDisplay gameDisplay;
    private LevelManager levelManager;
    private NumberCreater numberCreater;
    private boolean running;// 오류를 체크할 변수

    GameStarter(){
        this.scannerManager=new ScannerManager();
        this.levelManager = new LevelManager();
        this.gameDisplay=new GameDisplay();
        this.running=true;
    }

    public void gameStart(){ // 게임 시작 메소드
        while (this.running) { // 오류가 발생할때 까지 로직 수행
            gameDisplay.startDisplay(); // 첫 시작 화면 출력
            scannerManager.scannerManage(); // 입력하는 기능
            String input = scannerManager.getNum();
            switch (input){
                case "0": // 자릿수를 구해주는 거 뭔가 boolean 값으로 주면 괜찮을듯  0일 입력했을때는 난이도를 설정하세요
                    gameDisplay.LevelDisplay(); // 자릿수를 출력하시오 문구 출력
                    scannerManager.scannerManage(); // 입력받는 기능
                    levelManager.selectLevel(scannerManager.getNum()); // 난이도 조절
                    break;
                case "1": // 게임 기능
                    numberCreater=new NumberCreater();
                    numberCreater.generate(levelManager.getLevel());

                    break;
                 case "2": // 게임 기록보기
                case "3":
                    gameOver();// 종료하기
                default: //  값이 올바르지 않다는 거를 출력하는 기능을 넣기
            }
        }
    }



    private void gameOver(){
        gameDisplay.endDisplay();
        this.running=false;
    }


}
