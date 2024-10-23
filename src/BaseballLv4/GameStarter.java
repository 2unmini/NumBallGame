package BaseballLv4;

import BaseballLv4.BaseballGame.GameDisplay;

/*볼수,
 스크라이크
 볼수 스크라이크결과랑(출력)
 랜덤 수 출력해주는 기능
 유효성(자릿수, 중복 ,숫자인지,0이상인지)(출력)
 3~5까지 (출력)
 히스토리 기능 (출력)
 사용자 입력(입력)
 콘솔 창 기능(출력)

 ScannerManager 메소드
 display 콘솔에 이쁘게 출력하는 기능
*/


public class GameStarter {
    private ScannerManager scannerManager;
    private GameDisplay gameDisplay;
    private boolean running;// 오류를 체크할 변수

    GameStarter(){
        this.scannerManager=new ScannerManager();
        this.gameDisplay=new GameDisplay();
        this.running=true;
    }

    public void gameStart(){ // 게임 시작 메소드
        while (this.running) { // 오류가 발생할때 까지 로직 수행
            gameDisplay.startDisplay(); // 첫 시작 화면 출력
            scannerManager.scannerManage(); // 입력하는 기능
            String input = scannerManager.getNum();
            switch (input){
                case "0": // 자릿수를 구해주는 거 뭔가 boolean 값으로 주면 괜찮을듯
                case "1": // 게임 기능
                case "2": // 게임 기록보기
                case "3":
                    gameOver();// 종료하기
                default: //  값이 올바르지 않다는 거를 출력하는 기능을 넣기
            }
        }
    }



    public void gameOver(){
        gameDisplay.endDisplay();
        this.running=false;
    }


}
