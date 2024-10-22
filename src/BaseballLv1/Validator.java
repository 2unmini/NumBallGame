package BaseballLv1;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Validator {
    private int num;
    private final String REGEX_PATTERN_NUMBER = "^[\\d]*$";

    public int wholeCheck(String num){
        if(duplicateCheck(num)&& numberCheck(num)&&exceedsOne(num)){
            this.num=Integer.parseInt(num);
            return this.num;
        }
        return 0;
    }
    public boolean duplicateCheck(String num){

        int[] nums = Stream.of(num.split("")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
            if(set.size()!=3){
                System.out.println("중복값이 입력되었습니다.");
                return false;
        }
            return true;
    }

    public boolean numberCheck(String num){
        if(!Pattern.matches(REGEX_PATTERN_NUMBER,num)){
            System.out.println("올바른 입력값이 아닙니다.");
            return false;
        }
      return true;
    }

    public boolean exceedsOne(String num){
        int[] nums = Stream.of(num.split("")).mapToInt(Integer::parseInt).toArray();
        for(int e : nums){
            if(e==0){
                System.out.println("입력한 수 중 0포함 ");
                return false;
            }
        }
        return true;

    }
}
