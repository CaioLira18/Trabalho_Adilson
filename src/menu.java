import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class menu {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("### MENU ###");
            System.out.println("1. Chamar Classe 1");
            System.out.println("2. Chamar Classe 2");
            System.out.println("3. Chamar Classe 3");
            System.out.println("0. Sair do programa");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Chamando Classe 1...");
                    System.out.println("### Lista ###");
                    Array_List_Exercicio1.main(new String[]{"Fila"});
                    System.out.println();
                    
                    break;
                case 2:
                    System.out.println("Chamando Classe 2...");
                    System.out.println("\n### Fila ###");
                    Primeiro_Programa_Exercicio2.main(new String[]{"Fila"});
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Chamando Classe 3...");
                    System.out.println("\n### Pilha ###");
                    Segundo_Programa_Exercicio2.main(new String[]{"Pilha"});
                    System.out.println();
            
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

}
