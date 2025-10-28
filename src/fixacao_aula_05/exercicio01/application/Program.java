package fixacao_aula_05.exercicio01.application;

import fixacao_aula_05.exercicio01.entities.Tarefa;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Tarefa> tarefas = new ArrayList<>();

        tarefas.add(new Tarefa("Arrumar o quarto", 3, "Não concluida"));
        tarefas.add(new Tarefa("Lavar banheiro", 2, "Não concluida"));
        tarefas.add(new Tarefa("Dobrar roupa", 1, "Não concluida"));

        tarefas.set(1, new Tarefa("Lavar banheiro", 2, "Concluída"));

        for(Tarefa tarefa : tarefas){
            System.out.println(tarefa);
        }

        System.out.println("Tarefas cadastradas: " + tarefas.size());
        tarefas.remove(0);
        System.out.println("Tarefas cadastradas: " + tarefas.size());

        scanner.close();
    }
}
