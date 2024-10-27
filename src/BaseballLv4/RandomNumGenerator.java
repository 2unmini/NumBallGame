package BaseballLv4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class RandomNumGenerator {
    private ArrayList<Integer> randlist;
    private int level;

    public ArrayList<Integer> generate(LevelManager levelManager) {
        this.level = Integer.parseInt(levelManager.level);
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size() != this.level) {
            set.add(random.nextInt(9) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.shuffle(list);
        System.out.println(list); // 컴파일용
        this.randlist = list;
        return list;
    }
}
