package BaseballLv1;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Validator {
    public void duplicateCheck(int num){

        int nums[] = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        Set set = new HashSet<>(Arrays.asList(nums));
            if(set.size()<3){
                System.out.println("중복값이 입력되었습니다."); // 수정 요망
        }
    }
}
