package BaseballLv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class NumberCreate {
    private ArrayList<Integer> randList;

    public ArrayList<Integer> getRandList() {
        return randList;
    }

    NumberCreate(){
        this.randList= RandomNumber();
    }
    private ArrayList<Integer> RandomNumber() {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size() != 3) {
            set.add(random.nextInt(9) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.shuffle(list);
        System.out.println(list);
        return list;
    }
}