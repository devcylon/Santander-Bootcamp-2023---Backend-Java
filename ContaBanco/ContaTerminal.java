import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da agência!");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta!");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo");
        Double saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo R$ "+String.format("%.2f", saldo)+" já está disponível para saque.");
    }
    
}