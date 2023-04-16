public class ObjektiKalulator {

    public static void main(String[] args) {


        Kalkulator kalkulator = new Kalkulator();


        kalkulator.operand1 = 5.5;
        kalkulator.operand2 = 3.5;

        kalkulator.add();
        kalkulator.sub();
        kalkulator.mul();
        kalkulator.div();

    }

}
