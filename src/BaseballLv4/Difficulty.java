package BaseballLv4;

public enum Difficulty {
    THREE("3"),FOUR("4"),FIVE("5");
    private String  type;
    Difficulty(String type) {
        this.type=type;

    }


    public String getType() {
        return type;
    }

}
