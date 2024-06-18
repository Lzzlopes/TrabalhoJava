import Tipos.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Interface menu = new Interface();

        List<Pokemon> pokedex = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String informacoesPokemons = "C:\\Users\\luizg\\Desktop\\Trabalho\\src\\pokemons.txt";
        String batalha = "C:\\Users\\luizg\\Desktop\\Trabalho\\src\\batalha.txt";

        // Leitura do arquivo txt jogando os pokemons num arraylist
        try (BufferedReader br = new BufferedReader(new FileReader(informacoesPokemons))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] infoPokemon = line.split(", ");
                String nome = infoPokemon[0];
                int saude = Integer.parseInt(infoPokemon[1]);
                Tipo tipo = Tipo.valueOf(infoPokemon[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro na leitura do arquivo!");
        }

        // Sorteio do pokemon para lutar contra o jogador
        for (Pokemon pokemon : pokedex) {
            System.out.println("--------------------------------------");
            System.out.println("nome: " + pokemon.getNome());
            System.out.println("Saude: " + pokemon.getSaude());
            System.out.println("tipo: " + pokemon.getTipo());
            System.out.println("--------------------------------------");
        }

        // fazer um do while que só para a execução quando a pessoa esolher um pokemon
        // válido

        System.out.println("Digite o código do pokemon que deseja escolher: ");
        String pokemonEscolhido = scanner.nextLine();

        try (
                BufferedReader leitor = new BufferedReader(new FileReader(informacoesPokemons))) {
            pokemonEscolhido = leitor.readLine();

            // fazer a leitura do arquivo até encontrar o código digitado pelo usuário e
            // salvar o pokemon escolhido

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro na leitura do arquivo!");
        }

        if (pokemonEscolhido != null) {
            try (BufferedReader leitor = new BufferedReader(new FileReader(informacoesPokemons));
                    BufferedWriter escritor = new BufferedWriter(new FileWriter(batalha))) {
                String line;
                while ((line = leitor.readLine()) != null) {
                    if (line.contains(pokemonEscolhido)) {
                        escritor.write(line);
                        escritor.newLine();
                        break;
                    }
                }

            } catch (IOException e) {
                System.out.println("Ocorreu um erro. ");
                e.printStackTrace();
            }
        } else {
            System.out.println("Não foi possivel ler o arquivo de referencia.");
        }

        // Randomização do pokemon do computador

        Random rand = new Random();

        Pokemon randPokemon = pokedex.get(rand.nextInt(pokedex.size()));
        System.out.println("Pokemon sorteado");
        System.out.println("Nome: " + randPokemon.getNome());
        System.out.println("Vida: " + randPokemon.getSaude());
        System.out.println("Tipo: " + randPokemon.getTipo());

    }
}