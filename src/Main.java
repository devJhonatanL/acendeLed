import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Porta74HC02 porta = new Porta74HC02();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a entrada 2 utilizando 1 ou 0");
        porta.setentrada2(input.nextInt());

        System.out.println("Digite a entrada 3 utilizando 1 ou 0 ");
        porta.setentrada3(input.nextInt());

        System.out.println("Digite a entrada 5 utilizando 1 ou 0 ");
        porta.setentrada5(input.nextInt());

        System.out.println("Digite a entrada 6 utilizando 1 ou 0 ");
        porta.setentrada6(input.nextInt());

        System.out.println("Digite a entrada 8 utilizando 1 ou 0 ");
        porta.setentrada8(input.nextInt());


        porta.led1();
    }
}
