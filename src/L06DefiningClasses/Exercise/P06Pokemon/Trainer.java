package L06DefiningClasses.Exercise.P06Pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {
    private String name;
    private int badges = 0;
    private List<Pokemon> pokemonList;

    public Trainer(String name) {
        this.name = name;
        this.pokemonList = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        pokemonList.add(pokemon);
    }

    public int getBadges() {
        return badges;
    }

    public void hasOneOrMorePokemon(String element) {
        if (!pokemonList.isEmpty()) {
            for (Pokemon pokemon : pokemonList) {
                if (pokemon.getElement().equals(element)) {
                    badges++;
                    return;
                }
            }
            takePokemonHealth();
        }
    }

    public void takePokemonHealth() {
        for (Pokemon pokemon : pokemonList) {
            pokemon.setHealth(pokemon.getHealth() - 10);
        }
        pokemonList = pokemonList.stream().filter(e -> e.getHealth() > 0).collect(Collectors.toList());

    }

    public String toString() {
        return String.format("%s %d %d", name, badges, pokemonList.size());
    }


}
