import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar saldo atual da conta bancária
        System.out.println("Informe o saldo atual da conta bancária:");
        double saldo = scanner.nextDouble();

        // Solicitar valor do saque desejado
        System.out.println("Informe o valor do saque que deseja realizar:");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
        } else if (saque <= saldo + limiteChequeEspecial) {
            // Se o saque não ultrapassar o saldo, mas ultrapassar o limite do cheque especial
            // Utiliza o cheque especial
            System.out.println("Transação realizada com sucesso.");
        } else {
            // Caso contrário, o saque ultrapassou o limite do cheque especial
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
