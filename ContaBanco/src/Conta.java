import java.util.Scanner;

public class Conta {
    /*Atributos */
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    /*Constructor */

    public Conta(int numConta, String tipo, String dono, int saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    /*Getters e Setters */
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    /*Métodos*/

    void abrirConta() {
        System.out.printf("Número da conta: " + this.numConta);
        System.out.println("");
        System.out.printf("Tipo da conta: " + this.tipo);
        System.out.println("");
        System.out.printf("Dono da conta: " + this.dono);
        System.out.println("");
        System.out.printf("Saldo da conta: " + this.saldo);
        System.out.println("");
        System.out.printf("Status da conta: " + this.status);
        System.out.println("");
    }

    void fecharConta() {
        if (this.saldo != 0) {
            System.out.println("Você deve sacar o dinheiro antes de fechar sua conta.");
        }else {
            this.numConta = 0;
            this.tipo = "";
            this.dono = "";
            this.saldo = 0;
            this.status = false;
            this.abrirConta();
        }
    }

    void depositar() {
        var scanner = new Scanner(System.in);

        System.out.println("Quanto você deseja depositar?");
        int valorDepositado = scanner.nextInt();

        setSaldo(this.saldo + valorDepositado);

        System.out.printf("Você agora tem um saldo de: " + this.saldo);

    }

    void sacar() {
        var scanner = new Scanner(System.in);

        System.out.println("Quanto você deseja sacar?");
        int valorSacado = scanner.nextInt();

        if (valorSacado <= this.saldo) {
            setSaldo(this.saldo - valorSacado);

            System.out.printf("Você agora tem um saldo de: " + this.saldo);
        }else {
            System.out.println("Saldo insuficiente.");
        }
        
    }

    void pagarMensal() {
        if (tipo.equalsIgnoreCase("corrente")) {
            int debito = 12;

            if (this.saldo >= 12) {
                setSaldo(this.saldo - debito);
                System.out.println("Debito pago.");
                System.out.printf("Você agora tem um saldo de: " + this.saldo);
            }else {
                System.out.println("Saldo insuficiente.");
            }
            
        } if (tipo.equalsIgnoreCase("poupança")) {
            int debito = 20;

            if (this.saldo >= 20) {
                setSaldo(this.saldo - debito);
                System.out.println("Debito pago.");
                System.out.printf("Você agora tem um saldo de: " + this.saldo);
            }else {
                System.out.println("Saldo insuficiente.");
            }
        }
    }


}
