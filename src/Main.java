import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Porta74HC02 porta = new Porta74HC02();

        //LED 1
        porta.setentrada2(0);

        porta.setentrada3(0);

        porta.setentrada5(1);

        porta.setentrada6(0);

        //LED 2
        porta.setentrada8(1);

        porta.setentrada9(1);

        porta.setentrada11(0);

        porta.setentrada12(0);

        //RESPOSTA DO LED
        porta.led1();
        porta.led2();
    }
}
