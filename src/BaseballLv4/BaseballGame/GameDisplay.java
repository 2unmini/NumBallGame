package BaseballLv4.BaseballGame;

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

//

import BaseballLv4.LevelManager;

// 이쁘게 출력하기
public class GameDisplay {



    public void startDisplay(){// 게임 시작 화면
        System.out.println("환영 합니다. 원하시는 번호를 입력해주세요.");
        System.out.println("0. 자릿수 설정 1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기");
    }
    public void LevelDisplay(){// 게임 진행 중 화면 or 볼수 스트라이크 결과를 여기다 출력?
        System.out.println("설정하고자 하는 자릿수를 입력해주세요");

    }

    public void endDisplay(){ // 게임 종료 화면
        System.out.println("< 숫자 야구 게임을 종료합니다. >");
    }

    /*public void gameStart() {
        boolean check = true;
        History history = new History();
        Scanner sc = new Scanner(System.in);
        String num;
        SettingLevel settingLevel = new SettingLevel();
        String level = settingLevel.LevelCheck("3");
        String difficult ;
        Ball ball = null;
        while (check) {
            System.out.println("환영합니다! 원하시는 번호를 입력해주세요.");
            System.out.println("0. 자릿수 설정 1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기");
            int startExit = sc.nextInt();
            sc.nextLine();
            int answer=0;
            while (answer==0) {

                switch (startExit) {
                    case 0:
                        System.out.println("설정하고자 하는 자리수를 입력하세요");
                        difficult= sc.nextLine();
                        if(Integer.parseInt(difficult)>5 || Integer.parseInt(difficult)<3){
                            System.out.println("설정하실 난이도가 올바르지 않습니다.");
                            answer=-1;
                            break;
                        }
                        level = settingLevel.LevelCheck(difficult);
                        answer=-1;
                        break;

                    case 1:
                        //기능
                        ball = new Ball(level);
                        System.out.println("숫자를 입력해주세요");
                        num = sc.nextLine();
                        Validator[] validators = {new NumberCheck(), new DuplicateCheck(level), new DigitsCheck(level), new ExceedOneCheck()};
                        for (Validator validator : validators) {
                            if (!validator.validation(num)) {
                                answer = -1;
                                break;
                            }
                        }

                        if (answer == 0) {
                            if(ball.printStrikeBall(ball.countStrike(Integer.parseInt(num)), ball.countBall(Integer.parseInt(num)))){
                                history.count++;
                            }else {
                                history.historyList.add(history.count);
                                history.count=1;
                                answer=-1;
                                break;
                            }
                        }
                        break;


                    case 2:
                        history.printHistory();
                        answer=-1;
                        break;

                    case 3:
                        System.out.println("< 숫자 야구 게임을 종료합니다. >");
                        answer=-1;
                        check=false;
                        break;
                    default:
                        System.out.println("값이 올바르지 않습니다");
                        answer= -1;
                }
            }
        }
    }*/
}
