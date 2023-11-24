import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-=".repeat(20));
        System.out.println("Iniciando o Banco Ophidian...");
        System.out.println("-=".repeat(20));
        Scanner scan = new Scanner(System.in);

        BancoOphidian bancoOphi = new BancoOphidian();
        //adiciona 5 clientes a fila
        for (int i = 0; i < 5; i++ ){
            bancoOphi.addcliente();
        }
        bancoOphi.mostrarSaguao();
        for (int i = 0; i < 5; i++ ){
            bancoOphi.atendimento();
            bancoOphi.mostrarSaguao();
        } 


        System.out.println("-=".repeat(20));
        System.out.println("Iniciando o contador binário ...");
        System.out.println("-=".repeat(20));
        BinaryCounter binario = new BinaryCounter();
        System.out.println("Digite o valor de N: ");
        int n = scan.nextInt();
        binario.gerarBinarios(n);
        binario.mostrarBinarios();
    }
}