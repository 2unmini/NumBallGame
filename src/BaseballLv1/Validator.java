package BaseballLv1;

import java.util.regex.Pattern;

public class Validator {
    private String num;
    private  final String REGEXP_PATTERN_NUMBER = "^[\\d]*$";
    public void numberChecking(int num){
        this.num=String.valueOf(num);
        if(!Pattern.matches(REGEXP_PATTERN_NUMBER,this.num)){
            throw new NumberFormatException("숫자만 입력하세요.");
        } else if (!duplicateCheck(this.num)) {
            System.out.println("중복값이 입력되었습니다.");
        }

    }
    public boolean duplicateCheck(String num){
        char[] nums=num.toCharArray();
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
