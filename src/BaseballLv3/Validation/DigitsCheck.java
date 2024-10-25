package BaseballLv3.Validation;


import java.util.stream.Stream;

public class DigitsCheck implements Validator { // 3자리수가 맞는 지 확인하는 기능
    @Override
    public boolean validation(String num) {
        int[] nums= Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        if(nums.length!=3){
            System.out.println("자릿수가 맞지 않습니다.");
            return false;
        }
        return true;
    }
}
