import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BinaryCounter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();

        System.out.println("Digite um valor para n: ");
        int n = scan.nextInt();
        scan.close();

        fila.add("1");
        for (int i = 1; i <= n; i++){
            String Binary = fila.poll(); //removendo o próximo n binario da fila
            System.out.println(Binary);//o binario atual da fila
            String proxBinario1 = Binary + "0";
            String proxBinario2 = Binary + "1";
            fila.add(proxBinario1);
            fila.add(proxBinario2);
        }
    }
}
