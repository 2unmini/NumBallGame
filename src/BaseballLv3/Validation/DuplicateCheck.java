package BaseballLv3.Validation;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class DuplicateCheck implements Validator { // 중복 여부 판별 기능
    @Override
    public boolean validation(String num) {
        int[] nums = Stream.of(num.split("")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if(set.size()<3){
            System.out.println("중복값이 입력되었습니다.");
            return false;
        }
        return true;
    }
}
