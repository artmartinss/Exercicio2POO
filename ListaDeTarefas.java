import java.util.ArrayList;

public class ListaDeTarefas {

    public static void main(String[] args) {

        // Esta lista irá armazenar elementos do tipo String.
        ArrayList<String> listaDeTarefas = new ArrayList<>();
        System.out.println("ArrayList criado com sucesso!");

        System.out.println("\nAdicionando tarefas");
        listaDeTarefas.add("Estudar Java");
        listaDeTarefas.add("Fazer o trabalho de POO");
        listaDeTarefas.add("Estudar Banco de Dados");
        listaDeTarefas.add("Passear com o cachorro");

        System.out.println("\n--- Minha Lista de Tarefas ---");
        System.out.println(listaDeTarefas);
        System.out.println("Total de tarefas: " + listaDeTarefas.size());

        String segundaTarefa = listaDeTarefas.get(1);
        System.out.println("\nA segunda tarefa na lista é: '" + segundaTarefa + "'");

        System.out.println("\nRemovendo a tarefa 'Estudar Banco de Dados'...");
        listaDeTarefas.remove(2);

        System.out.println("\n--- Minha Lista de Tarefas Atualizada ---");
        System.out.println(listaDeTarefas);
        System.out.println("Total de tarefas agora: " + listaDeTarefas.size());
    }
}