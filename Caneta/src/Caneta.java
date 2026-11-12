public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga = 100;
    private boolean tampado = true;

    /*Getters e Setters */
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public boolean isTampado() {
        return tampado;
    }

    /*Métodos */

    void tampar() {
        if (tampado == true){
            System.out.println("A caneta ja está tampada.");
        }
        else {
            tampado = true;

            System.out.println("A caneta foi tampada.");
        }
    }

    void destampar() {
        if (tampado == false) {
            System.out.println("A caneta ja está destampada.");
        }
        else {
            tampado = false;

            System.out.println("A caneta foi destampada.");
        }
    }

    void usar() {
        if (carga != 0) {
            carga -= 1;

            System.out.println("Você usou a caneta.");
        }
        if (carga <= 0) {
            System.out.println("Você está sem carga.");
        }
    }
    
}
