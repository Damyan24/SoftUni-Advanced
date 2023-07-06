package DefiningClasses.PokemonTrainer;



import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        HashMap<String,Trainer> trainers = new LinkedHashMap<>();

        String line = scan.nextLine();

        while (!line.equals("Tournament")){
            String [] info = line.split("\\s+");

            String personName = info[0];
            String pokemonName = info[1];
            String element = info[2];
            int pokemonHealth = Integer.parseInt(info[3]);



            Pokemon pokemon = new Pokemon(pokemonName,element,pokemonHealth);

            if(!trainers.containsKey(personName)){
                List<Pokemon>newPokemon = new ArrayList<>();
                newPokemon.add(pokemon);
                Trainer trainer = new Trainer(personName,0,newPokemon);
                trainers.put(personName,trainer);
            }else {
                Trainer currentTrainer = trainers.get(personName);
                List<Pokemon>currentPokemonList = trainers.get(personName).getPokemons();
                currentPokemonList.add(pokemon);
                currentTrainer.setPokemons(currentPokemonList);
                trainers.put(personName,currentTrainer);

            }







            line = scan.nextLine();

        }

        String power = scan.nextLine();

        while (!power.equals("End")){

            for(Map.Entry<String,Trainer>entry:trainers.entrySet()){
                List<Pokemon> pokemon = entry.getValue().getPokemons();
                boolean containsPower = false;
                for(Pokemon pok : pokemon){
                    if(pok.getElement().equals(power)){
                        containsPower = true;
                        break;
                    }
                }

                List<Integer> indexes = new ArrayList<>();
                if(containsPower){
                    entry.getValue().setNumberOfBadges(entry.getValue().getNumberOfBadges() + 1);
                }else {
                    for(Pokemon pok : pokemon){
                        if(pok.getHealth() > 10) {
                            pok.setHealth(pok.getHealth() - 10);
                        }else {
                            indexes.add(pokemon.indexOf(pok));
                        }
                    }
                }

                for(int i : indexes){
                    pokemon.remove(i);
                }

                entry.getValue().setPokemons(pokemon);
                trainers.put(entry.getKey(),entry.getValue());

            }
            power = scan.nextLine();
        }
        List<Trainer> sortedTrainers = new ArrayList<>();
        for(Map.Entry<String,Trainer>entry:trainers.entrySet()){
            sortedTrainers.add(entry.getValue());
        }





        sortedTrainers.stream().sorted(Comparator.comparingInt(Trainer::getNumberOfBadges).reversed()).forEach(p -> System.out.println(p.getName() + " " + p.getNumberOfBadges() + " " + p.getPokemons().size()));
    }
}
