import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Lula Molusco";
        String tipoConta = "Corrente";
        double saldo = 799.00;

        System.out.println("""
                
                ________BEM VINDO AO...
                ________$$___SIRIGUEIJO_BANK___ $$
                ______$$$__$__________________$__$$$
                _____$$$___$$________________$$___$$$
                _____$$$$$$$$________________$$$$$$$$
                ______$$$$$$__________________$$$$$$
                _______$$$$____$$0$$$$$0$$$____$$$$
                _________$$__$$$$$$$$$$$$$$$$__$$
                _____$$___$$$$$$$$$$$$$$$$$$$$$$___$$
                ___$$__$$__$$$$$$$$$$$$$$$$$$$$__$$__$$
                __$______$$$$$$$$$$$$$$$$$$$$$$$$______$
                __$__$$$____$$$$$$$$$$$$$$$$$$____$$$__$
                ____$___$$$$_$$$$$$$$$$$$$$$$_$$$$___$
                ___$_________$_$$$$$$$$$$$$_$_________$
                ___$______$$$________________$$$______$
                _________$______________________$
                ________$________________________$
                ________$_________________________$         
                """);

        System.out.println("****************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n****************************");

        String menu = """
                ~~ Escolha uma opção ~~
                
                1 - consulta saldo
                2 - Sacar
                3 - Depositar
                4 - sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é R$ " + saldo + "\n");
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja sacar?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para saque.");
                } else {
                    saldo -= valor;
                    System.out.println("O saldo atualizado é R$ " + saldo + "\n");
                }
            } else if (opcao == 3) {
                System.out.println("Valor do depósito R$ ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("O saldo atualizado é R$ " + saldo + "\n");

            } else if (opcao != 4) {
                System.out.println("Opção inválida\n");

            } else if (opcao == 4) {
                System.out.println("""
                ________$$__SIRIGUEIJO_BANK____ $$
                ______$$$__$___AGRADECE_A_____$__$$$
                _____$$$___$$____PREFERÊNCIA_$$___$$$
                _____$$$$$$$$________________$$$$$$$$
                ______$$$$$$__________________$$$$$$
                _______$$$$____$$0$$$$$0$$$____$$$$
                _________$$__$$$$$$$$$$$$$$$$__$$
                _____$$___$$$$$$$$$$$$$$$$$$$$$$___$$
                ___$$__$$__$$$$$$$$$$$$$$$$$$$$__$$__$$
                __$______$$$$$$$$$$$$$$$$$$$$$$$$______$
                __$__$$$____$$$$$$$$$$$$$$$$$$____$$$__$
                ____$___$$$$_$$$$$$$$$$$$$$$$_$$$$___$
                ___$_________$_$$$$$$$$$$$$_$_________$
                ___$______$$$________________$$$______$
                _________$______________________$
                ________$________________________$
                ________$_________________________$         
                """);

            }

        }

    }
}