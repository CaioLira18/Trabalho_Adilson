import java.util.ArrayList;

public class Grav_Produto_Exemplo_Adilson {
    public static void main(String[] args) {
        // Crie um ArrayList para armazenar objetos Regpro
        ArrayList<Regpro> listaDeProdutos = new ArrayList<>();
        // Adicione objetos Regpro à lista
         listaDeProdutos.add(new Regpro(1, "Produto A", 15.99, 50));
        listaDeProdutos.add(new Regpro(2, "Produto B", 50.99, 90));
        listaDeProdutos.add(new Regpro(3, "Produto C", 74.49, 75));
        

        // Acesse os objetos na lista
        for (Regpro produto : listaDeProdutos) {
            
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQtd());
            System.out.println();
        }
    }
    }

