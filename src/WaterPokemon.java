import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("surf", "hydrocanon", "hydropump", "raindance");
    private final String type = "water";


//    constructor
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    //    getters
    public List<String> getAttacks() {
        return attacks;
    }

    @Override
    public String getType() {
        return type;
    }

//    methods
    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(0));
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire":
                System.out.println(enemy.getName() + " loses 25hp");
                int updatedHp = enemy.getHp() -25;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 1hp");
                updatedHp = enemy.getHp() -1;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 5hp");
                updatedHp = enemy.getHp() -5;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 10hp");
                updatedHp = enemy.getHp() -10;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            default:
                System.err.println("This Pokemon type should not exist");
        }
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(1));
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire":
                System.out.println(enemy.getName() + " loses 25hp");
                int updatedHp = enemy.getHp() -25;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 1hp");
                updatedHp = enemy.getHp() -1;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 5hp");
                updatedHp = enemy.getHp() -5;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 10hp");
                updatedHp = enemy.getHp() -10;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            default:
                System.err.println("This Pokemon type should not exist");
        }
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(2));
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire":
                System.out.println(enemy.getName() + " loses 25hp");
                int updatedHp = enemy.getHp() -25;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 1hp");
                updatedHp = enemy.getHp() -1;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 5hp");
                updatedHp = enemy.getHp() -5;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 10hp");
                updatedHp = enemy.getHp() -10;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            default:
                System.err.println("This Pokemon type should not exist");
        }
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(3));
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire":
                System.out.println(enemy.getName() + " loses 25hp");
                int updatedHp = enemy.getHp() -25;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 1hp");
                updatedHp = enemy.getHp() -1;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "grass":
                System.out.println(enemy.getName() + " is boosted by 5hp");
                updatedHp = enemy.getHp() +5;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "electric":
                System.out.println("has no effect on " + enemy.getName());
                break;
            default:
                System.err.println("This Pokemon type should not exist");
        }
    }

}
