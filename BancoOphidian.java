import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

// Representação do Banco Ophidian
class BancoOphidian {
    private Queue <Integer> fila = new LinkedList<>();//criando uma fila

    // Adiciona um cliente à fila
    public void addcliente() {
        fila.offer(1);
    }

    // Atende um cliente, com 25% de chance de papelada incorreta
    public void atendimento() {
        if (!fila.isEmpty()) {
            if (Math.random() < 0.25) {
                System.out.println("Papelada incorreta. Volte para o final da fila, por favor!\n");
                fila.offer(fila.poll());
            } else {
                System.out.println("Atendimento bem sucedido! Próximo cliente.\n");
                fila.poll();
            }
        }
    }

    // Mostra o saguão do Banco Ophidian
    public void mostrarSaguao() {
        System.out.println("Saguão do Banco Ophidian:");
        System.out.println(fila);
    }
}