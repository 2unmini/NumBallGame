package BaseballLv4;

public class SettingLevel {

    public String LevelCheck(String level){
        Difficulty[] difficulties = Difficulty.values();
        for (Difficulty difficulty :difficulties){
            if(difficulty.getType().equals(level)){
                System.out.println("자릿수는"+ difficulty.getType() );
                return difficulty.getType();
            }
        }
        return null;

    }
}
