import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_List_Exercicio1 {
    /**
     * @param strings
     * @throws Exception
     */
    public static void main(String[] strings) throws Exception {

        // Especifique o caminho para o arquivo de texto (.txt)
        String caminhoArquivo = "C:\\Users\\PC\\Downloads\\Trabalho_Adilson\\Trabalho_Adilson\\exercicio_1\\src\\arquivos\\Produto.txt";
        int codigo = 0;
        String nome;
        String valors;
        double valor = 0;
        int qtd = 0;
        int categoria = 0;
        double total=0;
        // int qtd1 = 0;
        try {
            // Crie um objeto File para representar o arquivo
            File arquivo = new File(caminhoArquivo);
            // Crie um objeto Scanner para ler o conteúdo do arquivo
            Scanner leitor = new Scanner(arquivo);
            Scanner leia = new Scanner(System.in);
            // Use um loop para ler e imprimir cada linha do arquivo
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                codigo = Integer.parseInt(linha.substring(0, 2));
                nome = linha.substring(3, 34);
                valors = linha.substring(36, 41);
                valor = Double.parseDouble(valors);
                valor = valor / 100;
                qtd = Integer.parseInt(linha.substring(43, 45));
                categoria = Integer.parseInt(linha.substring(46, 47));
               // System.out.println(codigo + " - " + nome + " - " + valor);

                
                // total= total + (valor * qtd);
            }
            // System.out.println("O total foi: " + total);
            // Feche o Scanner após a leitura do arquivo
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }




        //EXERCICIO PROPOSTO: Criar um programa que leia o arquivo produto.txt e alimente um arrraylist do objeto regpro. 
        
        //GRUPO: CAIO FERREIRA LIRA DE OLIVEIRA (01589870), JOÃO PEDRO SILVA DE ARAUJO (01606470), BRUNO LOURENÇO BEZERRA (01606518)
        //PROFESSOR: ADILSON
        //MATERIA: ESTRUTURA DE DADOS



        //CRIAR UMA ARRAYLIST COM OS DADOS DO ARQUIVO .TXT DISPONIBILIZADO

        List<String> linhas = lerArquivo(caminhoArquivo);

        if (linhas != null) {
            
           
            System.out.println("Conteúdo do ArrayList:");
            for (String linha : linhas) {
                valors = linha.substring(36, 41);
                valor = Double.parseDouble(valors);
                valor = valor / 100;
                 
                 
                System.out.println(linha + "                       Valor Real: " + valor);
            }
        } else {
            System.out.println("Falha ao ler o arquivo.");
        }
    }

    public static List<String> lerArquivo(String caminhoArquivo) {
        List<String> linhas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Retorna null em caso de falha na leitura do arquivo txt
        }

        return linhas;
    }

   
}
