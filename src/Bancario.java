import java.util.Scanner;

public class Bancario {
    public static void main(String[] args) {
        int qtdAsteristico = 35;
        for (int i = 0; i < qtdAsteristico; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("Dados Iniciais do Cliente:\n\n" +
                "Nome:             Vitor Zanela\n" +
                "Tipo de conta:    Corrente\n" +
                "Saldo Inicial:    R$ 2500,00");
        for (int i = 0; i < qtdAsteristico; i++) {
            System.out.print("*");
        }

        double saldoat = 2500.00;
        while (true) {
            System.out.println("\n");
            System.out.println("Operações\n");
            Scanner entrada = new Scanner(System.in);
            System.out.println("1 - Consulta Saldo\n" +
                    "2 - Receber Valor\n" +
                    "3 - Transferir Valor\n" +
                    "4 - Sair\n");
            System.out.print("Digite a Opção Desejada: ");
            int opc = entrada.nextInt();
            if (opc == 1) {
                System.out.println("O saldo atual é de R$" + saldoat);

            } else if (opc == 2) {
                System.out.print("Digite valor a receber: R$");
                double dep = entrada.nextDouble();
                saldoat += dep;
                System.out.println("Novo saldo atualizado é de R$" + saldoat);
            } else if (opc == 3) {
                System.out.println("Digite o valor a transferir: ");
                double saq = entrada.nextDouble();
                if (saq > saldoat) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldoat -= saq;
                    System.out.println("Novo saldo atualizado é de R$" + saldoat);
                }
            } else if (opc == 4) {
                System.out.println("Sistema encerrado. Até logo!");
                break;
            } else{
                System.out.println("Opção Invalida");
            }
        }
    }
}
