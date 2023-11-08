package L06DefiningClasses.Exercise.P06Pokemon;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String,Trainer> trainersMap  = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("Tournament")){
            String[] data = command.split(" ");

            String trainerName = data[0];
            String pokemonName = data[1];
            String pokemonElement = data[2];
            int pokemonHealth = Integer.parseInt(data[3]);

            Trainer currentTrainer = new Trainer(trainerName);

            trainersMap.putIfAbsent(trainerName, currentTrainer);
            trainersMap.get(trainerName).addPokemon(new Pokemon(pokemonName, pokemonElement, pokemonHealth));

            command = scanner.nextLine();
        }

        command = scanner.nextLine();
        while (!command.equals("End")){
            for (Trainer trainer : trainersMap.values()) {
                trainer.hasOneOrMorePokemon(command);
            }

            command = scanner.nextLine();
        }

        trainersMap.values().stream().sorted(Comparator.comparing(Trainer::getBadges).reversed()).forEach(System.out::println);
    }
}
