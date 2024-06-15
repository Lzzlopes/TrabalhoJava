import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Pokemon> pokemons = new ArrayList<>();

        String caminho = "C:\\Users\\luizg\\Desktop\\Trabalho\\src\\pokemons.txt";


        // Leitura do arquivo txt jogando os pokemons num arraylist
        try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] infoPokemon = line.split(", ");
                String nome = infoPokemon[0];
                int saude = Integer.parseInt(infoPokemon[1]);
                Tipo tipo = Tipo.valueOf(infoPokemon[2]);
                pokemons.add(new Pokemon(nome, saude, tipo));
            }
        } catch (IOException e){
            e.printStackTrace();
        }


        // Sorteio do pokemon para lutar contra o jogador

        Random rand = new Random();

        Pokemon randPokemon = pokemons.get(rand.nextInt(pokemons.size()));
        System.out.println("Pokemon sorteado");
        System.out.println("Nome: " + randPokemon.getNome());
        System.out.println("Vida: " + randPokemon.getSaude());
        System.out.println("Tipo: " + randPokemon.getTipo());

        for(Pokemon pokemon : pokemons){
            System.out.println("--------------------------------------");
            System.out.println("nome: " + pokemon.getNome());
            System.out.println("Saude: " + pokemon.getSaude());
            System.out.println("tipo: " + pokemon.getTipo());
            System.out.println("--------------------------------------");
        }



    }
}