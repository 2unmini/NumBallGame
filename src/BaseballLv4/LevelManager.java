package BaseballLv4;


public class LevelManager {
    ValidManager validManager;
    static final String DEFAULT_LEVEL = "3";
    String level;

    LevelManager() {
        this.level = DEFAULT_LEVEL;
    }

    public String setLevel(String level) {
        this.level = level;
        return level;

    }

}
