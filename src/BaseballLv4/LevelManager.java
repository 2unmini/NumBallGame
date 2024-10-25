package BaseballLv4;


public class LevelManager {
    static final String DEFAULT_LEVEL = "3";
    String level;

    LevelManager() {
        this.level = DEFAULT_LEVEL;
    }

    public String controlLevel(String level) {
        this.level = level;
        return level;

    }

}
