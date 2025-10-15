import java.util.List;

public class PokemonTrainer {
    String name;
    List<Pokemon> pokemons;

//    constructor
    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }

//    getters
    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

//    setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

}
