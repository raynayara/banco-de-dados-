import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BinaryCounter {
    private Queue <String> queue = new LinkedList<>();
    // Gera números binários de 1 a n e os armazena na fila
    public void gerarBinarios(int n) {
        for (int i = 1; i <= n; i++) {
            queue.offer(Integer.toBinaryString(i));
        }
    }
    // Mostra os números binários armazenados na fila
    public void mostrarBinarios() {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
