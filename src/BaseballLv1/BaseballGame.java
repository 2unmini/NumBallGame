package BaseballLv1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class BaseballGame {
    private ArrayList<Integer> list;
    BaseballGame(){
        this.list = RandomNumber();
    }

    private ArrayList<Integer> RandomNumber() {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size() != 3) {
            set.add(random.nextInt(9) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        return list;
    }
}
