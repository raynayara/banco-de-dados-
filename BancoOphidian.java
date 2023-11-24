import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;


class BancoOphidian {
    private Queue <Integer> fila = new LinkedList<>();

    
    public void addcliente() {
        fila.offer(1);
    }

    
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

    
    public void mostrarSaguao() {
        System.out.println("Saguão do Banco Ophidian:");
        System.out.println(fila);
    }
}