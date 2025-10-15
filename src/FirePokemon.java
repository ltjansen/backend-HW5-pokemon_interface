public class FirePokemon extends Pokemon {
    private final Pokemon name;
    private final Pokemon enemy;

//    constructor
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);

    }

//    methods

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy.getName() + " with inferno");
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire":
                System.out.println(enemy.getName() + " loses 1hp");
                int updatedHp = enemy.getHp() -1;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 10hp");
                updatedHp = enemy.getHp() -10;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 25hp");
                updatedHp = enemy.getHp() -25;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 5hp");
                updatedHp = enemy.getHp() -5;
                enemy.setHp(updatedHp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            default:
                System.out.println("This Pokemon type should not exist");
        }
    }

    void fireLash(Pokemon name, Pokemon enemy) {

    }

    void flameThrower(Pokemon name, Pokemon enemy) {

    }

    void pyroBall(Pokemon name, Pokemon enemy) {

    }

//    extra methode conform randvoorwaarden
    public Pokemon getFirePokemonName() {
        return name;
    }

}
