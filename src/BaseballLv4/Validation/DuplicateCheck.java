package BaseballLv4.Validation;



import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class DuplicateCheck implements Validator {
    private int size;
    public DuplicateCheck(String size){
        this.size=Integer.parseInt(size);
    }
    @Override
    public boolean validation(String num) {
        int[] nums = Stream.of(num.split("")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if(set.size()<this.size){
            System.out.println("중복값이 입력되었습니다.");
            return false;
        }
        return true;
    }
}