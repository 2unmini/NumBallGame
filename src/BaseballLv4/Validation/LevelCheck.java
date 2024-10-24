package BaseballLv4.Validation;

public class LevelCheck implements Validator {
    @Override
    public boolean validation(String num) {
        if(Integer.parseInt(num)>5 ||Integer.parseInt(num)<3 ) {
            System.out.println("설정된 난이도 값이 올바르지 않습니다.");
            return false;
        }
        return true;
    }
}
