package BaseballLv4.Validation;



import java.util.stream.Stream;

public class DigitsCheck implements Validator {
    private int size;
    public DigitsCheck(String size){
        this.size=Integer.parseInt(size);
    }
    @Override
    public boolean validation(String num) {
        int[] nums= Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        if(nums.length!=size){
            System.out.println("자릿수가 맞지 않습니다.");
            return false;
        }
        return true;
    }
}
