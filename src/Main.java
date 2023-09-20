import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicializar dados do cliente
        //Menu de opções
        //Visualização do saldo
        //Enviar valor
        //Receber valor

        Scanner sc = new Scanner(System.in);

        String nomeDoCliente = "Lucas Rodrigues";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;

        //Extrato do cliente
        String inicio = """
                ************************************
                Dados iniciais do cliente:
                                
                Nome:           %s
                Tipo conta:     %s
                Saldo inicial:  R$ %.2f              
                ************************************
                """.formatted(nomeDoCliente, tipoDeConta, saldo);
        System.out.println(inicio);
        //Fim da aba início
        String operacoes = """
                
                Operações
                                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:""";
        //Loop
        int opcao = 0;
        while (opcao != 4) {
            System.out.println(operacoes);
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor do depósito: ");
                double valorDeposito = sc.nextDouble();
                saldo += valorDeposito;
                System.out.println("Saldo atualizado R$ " + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor da transferência: ");
                double valorTransferencia = sc.nextDouble();

                if (valorTransferencia > saldo) {
                    System.out.println("Não há saldo suficiente para esta transação!");
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("Saldo atualizado R$ " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Encerrando...");
            } else {
                System.out.println("Opção inválida! Digite novamente.");
            }
        }
    }
}