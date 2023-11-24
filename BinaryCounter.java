import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BinaryCounter {
    private Queue <String> queue = new LinkedList<>();
    
    public void gerarBinarios(int n) {
        for (int i = 1; i <= n; i++) {
            queue.offer(Integer.toBinaryString(i));
        }
    }
    
    public void mostrarBinarios() {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
