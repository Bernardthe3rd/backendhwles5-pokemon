import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {
    private String userA;
    private List<Pokemon> pokemons = Arrays.asList();


    public PokemonTrainer(String userA, List<Pokemon> pokemons) {
        this.userA = userA;
        this.pokemons = pokemons;
    }

    public String getName() {
        return userA;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
