

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
		System.out.println("-------------------Pilhas-------------------");
        //criando a pilha
        Stack pilha = new Stack();
        //inserindo valores na pilha
        pilha.push("Produto A");
        pilha.push("Produto B");
        pilha.push("Produto C");
        pilha.push(12.6);
        
        //pegando o topo da pilha
        System.out.println("Topo: " + pilha.peek());
        //percorrendo a pilha
        for (int i = 0; i < pilha.size(); i++){
            System.out.println(pilha.get(i));
        }

        //removendo um elemento, e por ser uma pilha
        //ele removerá o elemento que foi inserido por ultimo
        pilha.pop();

        System.out.println("Depois de remover um elemento:");
        //percorrendo a pilha novamente
        for (int i = 0; i < pilha.size(); i++){
            System.out.println(pilha.get(i));
        }
	}
}
