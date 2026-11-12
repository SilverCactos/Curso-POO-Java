import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        Conta fulano = new Conta(123, "corrente", "Fulano", 100, true);

        int resposta = 1;
        System.out.println("--- Bem-vindo a sua conta no banco ---");

        while (resposta != 0) {

            System.out.println("--Pressione o respectivo número para ir a sua respectiva função.--");
            System.out.println("(1) Abrir sua conta.");
            System.out.println("(2) Fechar sua conta.");
            System.out.println("(3) Realizar um depósito.");
            System.out.println("(4) Realizar um saque.");
            System.out.println("(5) Pagar mensalidade.");
            System.out.println("(0) Sair");

            resposta = scanner.nextInt();

            if (resposta == 1) {
                fulano.abrirConta();
            }
            if (resposta == 2) {
                fulano.fecharConta();
            }
            if (resposta == 3) {
                fulano.depositar();
            }
            if (resposta == 4) {
                fulano.sacar();
            }
            if (resposta == 5) {
                fulano.pagarMensal();
            }

        }
        

    }
}
