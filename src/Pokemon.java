import java.util.List;

public abstract class Pokemon {
    private final String type;

    private final String name;
    private final int level;
    private int hp;
    private final String food;
    private final String sound;

    private List<String> attacks;


//    constructor
    public Pokemon(String name, int level, int hp, String food, String sound) {

    }


//    methods
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public List<String> getAttacks() {
        return attacks;
    }



}
