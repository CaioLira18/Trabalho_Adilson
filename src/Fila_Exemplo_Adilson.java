

import java.util.LinkedList;
import java.util.Queue;

public class Fila_Exemplo_Adilson {
    public static void main(String[] args) {
		System.out.println("-------------------Filas-------------------");


        //criando a fila, Queue é apenas uma interface,
        //então utilizaremos a implentação LinkedList
        Queue fila = new LinkedList();

        //inserindo elementos na fila
        fila.add("A");
        fila.add("B");
        fila.add("C");
        fila.add(12.6);


        //pegando o topo da fila
        System.out.println("Topo: " + fila.peek());
        //percorrendo a fila, este é outra forma de percorrer uma lista
        //o Object é o tipo do elemento, o obj é o elemento e a fila é nossa lista
        // o obj corresponderia ao get(i) da pilha
        for (Object obj : fila){
            System.out.println(obj);
        }

        
        //removendo um elemento, e por ser uma fila
        //ele removerá o elemento que foi inserido por primeiro
        fila.remove();
        System.out.println("Depois de remover um elemento:");
        //percorrendo a fila novamente
        for (Object obj : fila) {
            System.out.println(obj);
        }
	}
}
