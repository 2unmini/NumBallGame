package BaseballLv2.Validation;

import java.util.stream.Stream;

public class DigitsCheck implements Validator{
    @Override
    public boolean validation(int num) {
        int[] nums= Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        if(nums.length!=3){
            System.out.println("자릿수가 맞지 않습니다.");
            return false;
        }
        return true;
    }
}
