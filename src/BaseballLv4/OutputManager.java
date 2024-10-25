package BaseballLv4;

import java.util.ArrayList;

public class OutputManager {

    public void startMessage() {
        System.out.println("환영 합니다. 원하시는 번호를 입력해주세요.");
        System.out.println("0. 자릿수 설정 1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기");
    }

    public void levelSetMessage() {
        System.out.println("설정하고자 하는 자릿수를 입력해주세요");
    }

    public void runningMessage() {
        System.out.println("숫자를 입력해주세요");
    }

    public void endMessage() {
        System.out.println("< 숫자 야구 게임을 종료합니다. >");
    }

    public void changeLevelMessage(String level) {
        System.out.println(level + " 자릿수 난이도로 설정되었습니다");
    }

    public void replayInputMessage() {
        System.out.println("다시 입력해주세요 오류 시 첫화면으로 돌아갑니다. ");
    }
    public void historyMessage(ArrayList<Integer> historyList){
        for (int i = 0; i < historyList.size(); i++) {
            System.out.println((i + 1) + "번째 게임 : 시도 횟수 - " + historyList.get(i));

        }
    }

    public void errMessage(String massage) {
        System.out.println(massage);
    }
}
