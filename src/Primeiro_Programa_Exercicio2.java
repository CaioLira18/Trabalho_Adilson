import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Primeiro_Programa_Exercicio2 {

    // GRUPO: CAIO FERREIRA LIRA DE OLIVEIRA(01589870), BRUNO LOURENÇO
    // BEZERRA(01606518), JOAO PEDRO DA SILVA ARAUJO(01606470)
    // PROFESSOR: ADILSON
    // SEGUNDA PARTE DO PROJETO (PRIMEIRO PROGRAMA):
    // Leia o arquivo produto.txt, já com o campo categoria, e insira em uma fila
    // (Queu) do objeto Regpro,
    // assim como você fez para Arraylist, na atividade anterior

    public static void main(String[] args) {

        String caminhoArquivo = "C:\\Users\\PC\\OneDrive\\Documentos\\Área de Trabalho\\Pastas\\Trabalho_Adilson\\Trabalho_Adilson\\Trabalho_Adilson\\exercicio_1\\src\\arquivos\\Produto.txt";
        int codigo = 0;
        String nome;
        String valors;
        double valor = 0;
        int qtd = 0;
        int categoria = 0;

        ArrayList<Regpro> listaDeProdutos = new ArrayList<>();

        try {
            // Criando um objeto File para representar o arquivo
            File arquivo = new File(caminhoArquivo);
            // Criando um objeto Scanner para ler o conteúdo do arquivo
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                codigo = Integer.parseInt(linha.substring(0, 2));
                nome = linha.substring(3, 34);
                valors = linha.substring(36, 41);
                valor = Double.parseDouble(valors);
                valor = valor / 100;
                qtd = Integer.parseInt(linha.substring(43, 45));
                categoria = Integer.parseInt(linha.substring(43, 45));
                categoria = Integer.parseInt(linha.substring(46, 47));

                // Adicionando objetos Regpro à lista
                listaDeProdutos.add(new Regpro(1, "Produto A", 10.99, 100));
                listaDeProdutos.add(new Regpro(2, "Produto B", 20.59, 500));
                listaDeProdutos.add(new Regpro(3, "Produto C", 109.99, 300));
              
            }

            // Fechando o Scanner após a leitura do arquivo
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }

       

        System.out.println("-------------------Filas-------------------");
        // Criando a fila, Que é apenas uma interface,
        // então utilizaremos a implentação LinkedList
        Queue fila = new LinkedList();

        // EXERCICIO: Em ambos os programas você deverá retirar 5 elementos e imprimir
        // novamente a fila e a pilha.

        // inserindo elementos na fila
        fila.add("Produto A");
        fila.add("Produto B");
        fila.add("Produto C");
        fila.add("Produto D");
        fila.add("Produto E");
        fila.add(12.6);

        // pegando o topo da fila
        System.out.println("Topo: " + fila.peek());

        // percorrendo a fila, este é outra forma de percorrer uma lista
        // o Object é o tipo do elemento, o obj é o elemento e a fila é nossa lista
        // o obj corresponderia ao get(i) da pilha

        for (Object obj : fila) {
            System.out.println(obj);
        }

        // Removendo um elemento, e por ser uma fila
        // Ele removerá o elemento que foi inserido por primeiro
        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();
        System.out.println("Depois de remover um elemento:");

        // Percorrendo a fila novamente
        for (Object obj : fila) {
            System.out.println(obj);
        }
    }
}
