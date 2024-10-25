package BaseballLv3.Validation;


import java.util.regex.Pattern;

public class NumberCheck implements Validator { // 정규표현식을 통한 숫자인지 검사 기능
    private final String REGEX_PATTERN_NUMBER = "^[\\d]*$";
    @Override
    public boolean validation(String num) {
        if(!Pattern.matches(REGEX_PATTERN_NUMBER,num)){
            System.out.println("올바른 입력값이 아닙니다.");
            return false;
        }
        return true;
    }
}
