import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 150000;

        System.out.println("Você deseja fazer um saque ou um deposito?");
        String escolha = scanner.nextLine().toLowerCase();




        if (escolha.equals("saque")) {
            System.out.println("Digite o Valor que Deseja Sacar: ");
            double valorSaque = scanner.nextDouble();

            double novoSaldo = saldo - valorSaque;
            System.out.println("Saldo atual: " + novoSaldo);

        }else if (escolha.equals("deposito")) {
            System.out.println("Digite o Valor que deseja depositar: ");
            double valorDeposito = scanner.nextDouble();

            double novoSaldo = saldo + valorDeposito;
            System.out.println("Saldo atual: " + novoSaldo);
        }else {
            System.out.println("Não foi possivel efetuar a transação ");
        }

    }
}
