import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("solarbeam", "leafstorm", "leaveblade", "leechseed");
    private final String type = "grass";


//    constructor
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    //    getters
    public List<String> getAttacks() {
        return attacks;
    }

//    methods
    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(0));
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire":
                System.out.println(enemy.getName() + " loses 10p");
                int updatedHp = enemy.getHp() -10;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 5hp");
                updatedHp = enemy.getHp() -5;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 1hp");
                updatedHp = enemy.getHp() -1;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 25hp");
                updatedHp = enemy.getHp() -25;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            default:
                System.err.println("This Pokemon type should not exist");
        }
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(1));
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire":
                System.out.println(enemy.getName() + " loses 10hp");
                int updatedHp = enemy.getHp() -10;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 5hp");
                updatedHp = enemy.getHp() -5;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 1hp");
                updatedHp = enemy.getHp() -1;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 25hp");
                updatedHp = enemy.getHp() -25;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            default:
                System.err.println("This Pokemon type should not exist");
        }
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(2));
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire":
                System.out.println(enemy.getName() + " loses 10hp");
                int updatedHp = enemy.getHp() -10;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 5hp");
                updatedHp = enemy.getHp() -5;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 1hp");
                updatedHp = enemy.getHp() -1;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 25hp");
                updatedHp = enemy.getHp() -25;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            default:
                System.err.println("This Pokemon type should not exist");
        }
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attacks.get(3));
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire":
                System.out.println(enemy.getName() + " loses 10hp");
                int updatedHp = enemy.getHp() -10;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                int updatedHp2 = name.getHp() + 10;
                name.setHp(updatedHp2);
                System.out.println(name.getName() + " is boosted by the damage done to " + enemy.getName() + " and now has " + name.getHp() + "hp left");
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 5hp");
                updatedHp = enemy.getHp() -5;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                updatedHp2 = name.getHp() + 5;
                name.setHp(updatedHp2);
                System.out.println(name.getName() + " is boosted by the damage done to " + enemy.getName() + " and now has " + name.getHp() + "hp left");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 1hp");
                updatedHp = enemy.getHp() -1;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                updatedHp2 = name.getHp() + 1;
                name.setHp(updatedHp2);
                System.out.println(name.getName() + " is boosted by the damage done to " + enemy.getName() + " and now has " + name.getHp() + "hp left");
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 25hp");
                updatedHp = enemy.getHp() -25;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                updatedHp2 = name.getHp() + 25;
                name.setHp(updatedHp2);
                System.out.println(name.getName() + " is boosted by the damage done to " + enemy.getName() + " and now has " + name.getHp() + "hp left");
                break;
            default:
                System.err.println("This Pokemon type should not exist");
        }
    }

}
