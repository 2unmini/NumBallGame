package BaseballLv4.BaseballGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class NumberCreate {
    private ArrayList<Integer> randList;

    public ArrayList<Integer> getRandList() {
        return randList;
    }
    private int size;

    public NumberCreate(String size){
        this.randList= RandomNumber(size);
    }
    private ArrayList<Integer> RandomNumber(String size) {
        this.size=Integer.parseInt(size);
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size() != this.size) {
            set.add(random.nextInt(9) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.shuffle(list);
        System.out.println(list);
        return list;
    }
}