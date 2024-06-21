public class ContaTerminal {
    // Variáveis de Instância
    private int numero;
    private String agencia;
    private String nome;
    private double saldo;

    // Construtor
    public ContaTerminal(int numero, String agencia, String nome, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    // Método para exibir as informações do cliente
    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
    }
}
