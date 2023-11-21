import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class BancoOphidian {
    public static void main(String[] args){
        Queue <String> fila = new LinkedList<>(); //criando a fila
        Random random = new Random(); //criando o objeto para simulação aleatoria

        //colocando clientes na fila
        for ( int i = 1; i <= 10; i++){
            fila.add("Cliente " + i);
        }

        //enquanto a fila não estiver vazia 
        while (!fila.isEmpty()){
            String clienteAtual = fila.poll();
            System.out.println("Próximo cliente: " + clienteAtual);

            //25% a papelada está errada
            if (random.nextDouble() <= 0.25){
                System.out.println("Papelada incorreta, do cliente:  " + clienteAtual + "Volte para o final da fila.");
                fila.add(clienteAtual);//colocando o cliente atual para o fim da fila
            }
        }
    }
}