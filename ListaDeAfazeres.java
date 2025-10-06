// Importa a classe ArrayList do pacote java.util
import java.util.ArrayList;

/**
 * Um exemplo simples em uma única classe para demonstrar os conceitos básicos
 * do ArrayList: criar, adicionar, exibir e remover elementos.
 */
public class ExemploBasicoArrayList {

    public static void main(String[] args) {

        // 1. CRIAR um ArrayList
        // Esta lista irá armazenar elementos do tipo String.
        ArrayList<String> listaDeTarefas = new ArrayList<>();
        System.out.println("ArrayList criado com sucesso!");

        // 2. ADICIONAR elementos à lista
        System.out.println("\nAdicionando tarefas...");
        listaDeTarefas.add("Estudar Java");
        listaDeTarefas.add("Fazer o trabalho de POO");
        listaDeTarefas.add("Comprar pão");
        listaDeTarefas.add("Passear com o cachorro");

        // 3. EXIBIR a lista completa e seu tamanho
        System.out.println("\n--- Minha Lista de Tarefas ---");
        System.out.println(listaDeTarefas); // O ArrayList tem um formato de exibição padrão
        System.out.println("Total de tarefas: " + listaDeTarefas.size());

        // 4. ACESSAR um elemento específico (opcional, mas bom para demonstrar)
        // A contagem de posições (índice) começa em 0.
        String segundaTarefa = listaDeTarefas.get(1);
        System.out.println("\nA segunda tarefa na lista é: '" + segundaTarefa + "'");

        // 5. REMOVER um elemento da lista
        // Vamos remover a tarefa "Comprar pão", que está na posição 2 (índice 2).
        System.out.println("\nRemovendo a tarefa 'Comprar pão'...");
        listaDeTarefas.remove(2);

        // 6. EXIBIR a lista final
        System.out.println("\n--- Minha Lista de Tarefas Atualizada ---");
        System.out.println(listaDeTarefas);
        System.out.println("Total de tarefas agora: " + listaDeTarefas.size());
    }
}