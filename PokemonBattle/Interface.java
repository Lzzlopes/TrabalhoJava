import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import Tipos.Pokemon;
import Tipos.Tipo;

public class Interface {

    public Scanner scanner;

    OperacoesArquivos opArq = new OperacoesArquivos();

    private static String batalha = "C:\\Users\\luizg\\Desktop\\java\\pj\\src\\PokemonBattle\\Arquivos";

    File arquivo = new File("batalha.txt");

    public Interface() throws IOException {
        scanner = new Scanner(System.in);
        iniciar();
    }

    public void iniciar() throws IOException {
        imprimirCabecalho();
        exibirMenuInicial();
    }

    public void imprimirCabecalho() {
        System.out.println("  ____        _        _ _             _____      _                              ");
        System.out.println(" |  _ \\      | |      | | |           |  __ \\    | |                             ");
        System.out.println(" | |_) | __ _| |_ __ _| | |__   __ _  | |__) |__ | | _____ _ __ ___   ___  _ __  ");
        System.out.println(" |  _ < / _` | __/ _` | | '_ \\ / _` | |  ___/ _ \\| |/ / _ \\ '_ ` _ \\ / _ \\| '_ \\ ");
        System.out.println(" | |_) | (_| | |_ (_| | | | | | (_| | | |  | (_) |   <  __/ | | | | | (_) | | | |");
        System.out.println(" |____/ \\__,_|\\__\\__,_|_|_| |_|\\__,_| |_|   \\___/|_|\\_\\___|_| |_| |_|\\___/|_| |_|");
        System.out.println("                                                                                 ");
        System.out.println("                                                                                 ");
    }

    public void exibirMenuInicial() throws IOException {

        opArq.preencherLista();

        System.out.println("01. Novo Jogo");
        System.out.println("02. Carregar Jogo");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                menuNovoJogo();
                if (arquivo.exists()) {
                    break;
                } else {
                    try {
                        arquivo.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                break;
            case 2:
                menuCarregarJogo();
                break;
            default:
                System.out.println("Opção inválida.");
                exibirMenuInicial();
                break;
        }
    }

    public void menuNovoJogo() {
        System.out.println("01. Escolha um Pokémon");
        System.out.println("02. Escolha Aleatoriamente");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                while (true) {
                    System.out.println("Escolha o tipo do seu pokemon:");
                    String tipo = scanner.nextLine();
                    try {
                        Tipo tipoEscolhido = Tipo.valueOf(tipo);
                        opArq.mostrarPokemonsPorTipo(tipoEscolhido);
                        System.out.println("Digite o codigo do Pokemon que deseja");
                        Pokemon p1 = opArq.escolherPokemon(scanner.nextLine());
                        break;

                    } catch (IllegalArgumentException e) {
                        System.out.println("Tipo de pokemon inválido.");
                    }
                }
                break;
            case 2:
                Pokemon p1 = opArq.sortearPokemon();
                break;
            default:
                System.out.println("Opção inválida.");
                menuNovoJogo();
                break;
        }

        exibirTelaPrincipal();
    }

    public void menuCarregarJogo() throws IOException {
        System.out.println("01. Exibir Jogos Salvos");
        System.out.println("02. Retornar");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Nenhum jogo salvo encontrado.");
                menuCarregarJogo();
                break;
            case 2:
                exibirMenuInicial();
                break;
            default:
                System.out.println("Opção inválida.");
                menuCarregarJogo();
                break;
        }
    }

    public void exibirTelaPrincipal() {
        System.out.println("01. Nova Batalha");
        System.out.println("02. Curar Pokémon");
        System.out.println("03. Sair");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                iniciarBatalha();
                break;
            case 2:
                curarPokemon();
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
                exibirTelaPrincipal();
                break;
        }
    }

    public void iniciarBatalha() {
        System.out.println("(Ataque 1) / (Ataque 2)");
        System.out.println("(Defesa 1) / (Ataque 3)");

        exibirTelaPrincipal();
    }

    public void curarPokemon() {
        System.out.println("quu..__");
        System.out.println(" $$$b  `---.__                                 ");
        System.out.println("  \"$b        `--.                          ___.---uuudP              ");
        System.out.println("   `$$b           `.__.------.__     __.---'      $$$$\"              .");
        System.out.println("     \"$b          -'            `-.-'            $$$\"              .'");
        System.out.println("       \".                                       d$\"             _.'  |");
        System.out.println("         `.   /                              ...\"             .'     |");
        System.out.println("           `./                           ..::-'            _.'       |");
        System.out.println("            /                         .:::-'            .-'         .'");
        System.out.println("           :                          ::''\\          _.'            | ");
        System.out.println("          .' .-.             .-.           `.      .'               | ");
        System.out.println("          : /'$$|           .@\"$\\           `.   .'              _.-' ");
        System.out.println("         .'|$u$$|          |$$,$$|           |  <            _.-'     ");
        System.out.println("         | `:$$:'          :$$$$$:           `.  `.       .-'         ");
        System.out.println("         :                  `\"--'             |    `-.     \\          ");
        System.out.println("        :##.       ==             .###.       `.      `.    `\\        ");
        System.out.println("        |##:                      :###:        |        >     >       ");
        System.out.println("        |#'     `..'`..'          `###'        x:      /     /        ");
        System.out.println("         \\                                   xXX|     /    ./         ");
        System.out.println("          \\                                xXXX'|    /   ./           ");
        System.out.println("          /`-.                                  `.  /   /             ");
        System.out.println("         :    `-  ...........,                   | /  .'              ");
        System.out.println("         |         ``:::::::'       .            |<    `.             ");
        System.out.println("         |             ```          |           x| \\ `.:``.           ");
        System.out.println("         |                         .'    /'   xXX|  `:`M`M':.         ");
        System.out.println("         |    |                    ;    /:' xXXX'|  -'MMMMM:'         ");
        System.out.println("         `.  .'                   :    /:'       |-'MMMM.-'           ");
        System.out.println("          |  |                   .'   /'        .'MMM.-'              ");
        System.out.println("          `'`'                   :  ,'          |MMM<                 ");
        System.out.println("            |                     `'            |tbap\\                ");
        System.out.println("             \\                                  :MM.-'                ");
        System.out.println("              \\                 |              .''                    ");
        System.out.println("               \\.               `.            /                       ");
        System.out.println("                /     .:::::::.. :           /                        ");
        System.out.println("               |     .:::::::::::`.         /                         ");
        System.out.println("               |   .:::------------\\       /                          ");
        System.out.println("              /   .''               >::'  /                           ");
        System.out.println("              `',:                 :    .'                            ");
        System.out.println("                                   `:.:' Tim Park                      ");
        System.out.println("");
        System.out.println("Parabéns! Seu Pokémon foi curado.");
        exibirTelaPrincipal();
    }

}
