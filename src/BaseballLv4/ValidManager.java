package BaseballLv4;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ValidManager {
    private final String REGEX_PATTERN_NUMBER = "^[\\d]*$";
    private OutputManager outputManager;
    private LevelManager levelManager;
    String Message;

    public String getInput() {
        return input;
    }

    private String input;
    private int level;

    public ValidManager() {

    }

    public ValidManager(LevelManager levelManager) {
        this.levelManager=levelManager;
        this.level=Integer.parseInt(levelManager.level);
    }

   /* public ValidManager(InputManager inputManager,LevelManager levelManager) {
        this.input = inputManager.getNum();
        this.level= Integer.parseInt(levelManager.level);
    }*/

    public boolean levelCheck(String num) {
        if (numberCheck(num) && rangeCheck35(num)) {
            return true;
        }
        return false;
    }
    public boolean integrationCheck(String num){
        if(numberCheck(num)&&digitsCheck(num)&& exceedOneCheck(num) && duplicateCheck(num)){
            this.input=num;
            return true;
        }
        return false;
    }


    public boolean digitsCheck(String num) {
        int[] nums = Stream.of(num.split("")).mapToInt(Integer::parseInt).toArray();
        if (nums.length != this.level) {
            /*
            todo
            예외 던지기
             */
        }
        return true;
    }

    public boolean duplicateCheck(String num) {
        int[] nums = Stream.of(num.split("")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (set.size() < this.level) {
            System.out.println("중복값이 입력되었습니다.");
            return false;
        }
        return true;
    }


    public boolean exceedOneCheck(String num) {
        int[] nums = Stream.of(num.split("")).mapToInt(Integer::parseInt).toArray();
        for (int e : nums) {
            if (e == 0) {
                System.out.println("입력한 수 중 0포함 ");
                return false;
            }
        }
        return true;

    }


    public boolean numberCheck(String num) {
        if (!Pattern.matches(REGEX_PATTERN_NUMBER, num)) {
            System.out.println("올바른 입력값이 아닙니다.");
            return false;
        }
        return true;
    }

    public boolean rangeCheck35(String num) {
        Integer.parseInt(num);
        if (Integer.parseInt(num) > 5 || Integer.parseInt(num) < 2) {
            outputManager = new OutputManager();
            outputManager.errMessage("설정하신 난이도가 올바르지 않습니다");
            return false;
        }
        return true;
    }
}

