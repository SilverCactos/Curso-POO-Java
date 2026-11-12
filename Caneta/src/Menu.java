import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);  /*Permite ler os inputs do usuário */

        System.out.println("Criar uma nova caneta?");
        String criar = scanner.nextLine();

        if (criar.equalsIgnoreCase("sim")) {
            /*Cria a caneta */
            Caneta caneta1 = new Caneta();

            /*Definindo modelo */
            System.out.println("Digite o modelo da sua caneta:");
            String modeloEscolhido = scanner.nextLine();

            caneta1.setModelo(modeloEscolhido);

            /*Definindo cor */
            System.out.println("Digite a cor da sua caneta:");
            String corDigitada = scanner.nextLine();

            caneta1.setCor(corDigitada);

            /*Definindo ponta */
            System.out.println("Digite o tamanho da ponta da sua caneta:");
            float pontaDigitada = scanner.nextFloat();

            caneta1.setPonta(pontaDigitada);

            /*Enquanto tiver carga o terminal repete as informações */

            String resposta2 = "";

            while (caneta1.getCarga() > 0 || !(resposta2.equalsIgnoreCase("sim"))) {
                System.out.println("Você tem uma caneta com as seguintes caracteristicas:");
                System.out.printf("Modelo: " + caneta1.getModelo());
                System.out.println("");
                System.out.printf("Cor: " + caneta1.getCor());
                System.out.println("");
                System.out.printf("Ponta: " + caneta1.getPonta());
                System.out.println("");
                System.out.printf("Carga: " + caneta1.getCarga());
                System.out.println("");

                if (caneta1.isTampado() == true) {
                    System.out.println("Sua caneta está tampada, destampar e começar a escrever?");
                    resposta2 = scanner.next();

                    if (resposta2.equalsIgnoreCase("sim")) {
                        caneta1.destampar();

                        while (caneta1.isTampado() != true) {
                            /*enquanto o usuario nao digitar tampar perguntar se quer usar ou tampar */
                            System.out.println("Continuar escrevendo ou tampar a caneta?");
                            String resposta3 = scanner.next();

                            while (resposta3.equalsIgnoreCase("escrever")) {
                                caneta1.usar();
                                System.out.println("Continuar escrevendo ou tampar a caneta?");
                                resposta3 = scanner.next();
                            }

                            caneta1.tampar();

                        }
                    } 
                    
                }
            }
            

        }
    }
}
