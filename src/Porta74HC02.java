public class Porta74HC02 {
    private int  entrada2, entrada3, entrada5, entrada6, entrada8, entrada9, entrada11, entrada12;
    private int saida1, saida4, saida10, saida13;
    private boolean led;

    public void setentrada2(int entrada2) {
        this.entrada2 = entrada2;
    }

    public void setentrada3(int entrada3) {
        this.entrada3 = entrada3;
    }
    public int getsaida1() {
        if (entrada2 == 0 && entrada3 == 0) {
            return saida1 = 1;
        } else {
            return saida1 = 0;
        }
    }
    public void setentrada5(int entrada5){
            this.entrada5 = entrada5;
    }
    public void setentrada6(int entrada6){
            this.entrada6 = entrada6;
    }
    public int getsaida4(){
        if (entrada5 == 0 && entrada6 == 0) {
            return saida4 = 1;
        }else{
            return saida4 = 0;
        }
    }
    public void setentrada8(int entrada8) {
        this.entrada8 = entrada8;
    }
    public void setentrada9(int entrada9) {
        this.entrada9 = entrada9;
    }
    public int getsaida10() {
        if (entrada5 == 0 && entrada6 == 0) {
            return saida10 = 1;
        } else {
            return saida10 = 0;
        }
    }
    public void setentrada11(int entrada11) {
        this.entrada11 = entrada11;
    }
    public void setentrada12(int entrada12) {
        this.entrada12 = entrada12;
    }
    public int getsaida13() {
        if (entrada5 == 0 && entrada6 == 0) {
            return saida13 = 1;
        }else {
            return saida13 = 0;
        }
    }

    public void led1(){
        if(saida1 != saida4){
            System.out.println("Led acendeu");
        }else{
            System.out.println("Led apagado");
        }
    }

    public void led2(){
        if(saida10 != saida13){
            System.out.println("Led acendeu");
        }else{
            System.out.println("Led apagado");
        }
    }


}
