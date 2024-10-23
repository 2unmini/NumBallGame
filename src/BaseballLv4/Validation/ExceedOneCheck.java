package BaseballLv4.Validation;



import java.util.stream.Stream;

public class ExceedOneCheck implements Validator {
    @Override
    public boolean validation(String num) {
        int[] nums = Stream.of(num.split("")).mapToInt(Integer::parseInt).toArray();
        for (int e : nums) {
            if (e == 0) {
                System.out.println("입력한 수 중 0포함 ");
                return false;
            }
        }
        return true;

    }
}
