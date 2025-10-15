import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {
    private String town;

//    constructor
    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        super(name, pokemons);
//        ik weet niet hoe deze constructor alleen de super kan aanroepen, als in PokemonGymImpl.java regel 15
//        een instantie van PokemonGymOwner wordt aangemaakt inclusief 'town' (en die lijkt me exclusief
//        voor een PokemonGymOwner te zijn, en niet voor elke PokemonTrainer?)
        this.town = town;
    }

//    getters
    public String getTown() {
        return town;
    }

//    setters
    public void setTown(String town) {
        this.town = town;
    }

}
