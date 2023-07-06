package DefiningClasses.PokemonTrainer;

import java.util.List;

public class Trainer {
    private String name;

    private int numberOfBadges = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    private List<Pokemon> pokemons;

    public Trainer(String name, int numberOfBadges, List<Pokemon> pokemons) {
        this.name = name;
        this.numberOfBadges = 0;
        this.pokemons = pokemons;
    }
}
