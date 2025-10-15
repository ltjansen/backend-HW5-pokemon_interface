import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("inferno", "firelash", "flamethrower", "pyroball");
    private final String type = "fire";


    //    constructor
    public FirePokemon(String name, int level, int hp, String food, String sound) {
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
    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(0));
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire":
                System.out.println(enemy.getName() + " loses 1hp");
                int updatedHp = enemy.getHp() - 1;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 10hp");
                updatedHp = enemy.getHp() - 10;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 25hp");
                updatedHp = enemy.getHp() - 25;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 5hp");
                updatedHp = enemy.getHp() - 5;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            default:
                System.err.println("This Pokemon type should not exist");
        }
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(1));
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire":
                System.out.println(enemy.getName() + " loses 1hp");
                int updatedHp = enemy.getHp() - 1;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 10hp");
                updatedHp = enemy.getHp() - 10;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 25hp");
                updatedHp = enemy.getHp() - 25;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 5hp");
                updatedHp = enemy.getHp() - 5;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            default:
                System.err.println("This Pokemon type should not exist");
        }
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(2));
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire":
                System.out.println(enemy.getName() + " loses 1hp");
                int updatedHp = enemy.getHp() - 1;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 10hp");
                updatedHp = enemy.getHp() - 10;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 25hp");
                updatedHp = enemy.getHp() - 25;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 5hp");
                updatedHp = enemy.getHp() - 5;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            default:
                System.err.println("This Pokemon type should not exist");
        }
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(3));
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire":
                System.out.println(enemy.getName() + " loses 1hp");
                int updatedHp = enemy.getHp() - 1;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 10hp");
                updatedHp = enemy.getHp() - 10;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 25hp");
                updatedHp = enemy.getHp() - 25;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 5hp");
                updatedHp = enemy.getHp() - 5;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            default:
                System.err.println("This Pokemon type should not exist");
        }
    }

}
