/*
* Trabalho feito de forma básica e simples para mostrar o funcionamento de um ArrayList.
* Trabalho feito sem métodos.
**/


import java.util.ArrayList;

public class ListaDeTarefas {

    public static void main(String[] args) {

        ArrayList<String> listaDeTarefas = new ArrayList<>(); //cria o arraylist
        
        //adiciona itens ao arraylist
        listaDeTarefas.add("Estudar Java");
        listaDeTarefas.add("Fazer o trabalho de POO");
        listaDeTarefas.add("Estudar Banco de Dados");
        listaDeTarefas.add("Passear com o cachorro");

        //print o que tem dentro do arraylist  
        System.out.println("\n--- Minha Lista de Tarefas ---");
        System.out.println(listaDeTarefas);
        System.out.println("Total de tarefas: " + listaDeTarefas.size()); //mostra o tamanho do arraylist   

        //mostra o que tem no indice 1 do arraylist
        String segundaTarefa = listaDeTarefas.get(1);
        System.out.println("\nA segunda tarefa na lista é: '" + segundaTarefa + "'");

        //remove algo do arraylist
        System.out.println("\nRemovendo a tarefa 'Estudar Banco de Dados'...");
        listaDeTarefas.remove(2);

        //print a lista atualizada
        System.out.println("\n--- Minha Lista de Tarefas Atualizada ---");
        System.out.println(listaDeTarefas);
        System.out.println("Total de tarefas agora: " + listaDeTarefas.size());
    }
}