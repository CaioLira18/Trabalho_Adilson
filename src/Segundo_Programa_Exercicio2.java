import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Segundo_Programa_Exercicio2 {
    // GRUPO: CAIO FERREIRA LIRA DE OLIVEIRA(01589870), BRUNO LOURENÇO
    // BEZERRA(01606518), JOAO PEDRO DA SILVA ARAUJO(01606470)
    // PROFESSOR: ADILSON
    // SEGUNDA PARTE DO PROJETO (SEGUNDO PROGRAMA):
    // Leia o arquivo produto.txt e insira em uma pilha do objeto Regpro,
    // assim como você fez para o Arraylist e a Fila.

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
                listaDeProdutos.add(new Regpro(1, "Produto A", 5.99, 50));
                listaDeProdutos.add(new Regpro(2, "Produto B", 5.99, 50));
                listaDeProdutos.add(new Regpro(3, "Produto C", 50.99, 50));
                
            }

            // Fechando o Scanner após a leitura do arquivo
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }


        System.out.println("-------------------Pilhas-------------------");
        // criando a pilha
        Stack pilha = new Stack();
        // inserindo valores na pilha
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.push("D");
        pilha.push("E");
      
        // pegando o topo da pilha
        System.out.println("Topo: " + pilha.peek());
        // percorrendo a pilha
        for (int i = 0; i < pilha.size(); i++) {
            System.out.println(pilha.get(i));
        }

        // removendo um elemento, e por ser uma pilha
        // ele removerá o elemento que foi inserido por ultimo
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        System.out.println("Depois de remover um elemento:");

        // Percorrendo a Pilha Novamente
        for (int i = 0; i < pilha.size(); i++) {
            System.out.println(pilha.get(i));
        }
    }
}
