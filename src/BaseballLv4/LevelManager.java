package BaseballLv4;

import BaseballLv4.Validation.LevelCheck;
import BaseballLv4.Validation.NumberCheck;
import BaseballLv4.Validation.Validator;

import java.util.Scanner;

public class LevelManager{
    private String level="3"; // 기본 레벨
    private LevelCheck levelCheck;

    LevelManager(){
    }



    public void selectLevel(String input){
        levelCheck=new LevelCheck();
        if(levelCheck.validation(input)){
            this.level =input;
            System.out.println(input + " 자릿수 난이도로 설정되었습니다");
        }
    }

    public String getLevel() {
        return level;
    }
}
