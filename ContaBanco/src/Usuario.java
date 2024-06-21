import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitando informações do usuário
            System.out.print("Digite o número da conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            System.out.print("Digite a agência: ");
            String agencia = scanner.nextLine();

            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o saldo: ");
            double saldo = scanner.nextDouble();

            // Instanciando um objeto da classe ContaTerminal
            ContaTerminal conta = new ContaTerminal(numero, agencia, nome, saldo);

            // Exibindo as informações do cliente
            conta.exibirInformacoes();

        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao processar as informações.");
            e.printStackTrace();
        } finally {
            // Fechando o scanner
            scanner.close();
        }
    }
}
