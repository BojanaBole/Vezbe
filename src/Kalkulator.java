public class Kalkulator {

    double operand1;
    double operand2;

    public Kalkulator() {
    }

    public void add() {
        double sabiranje = (operand1 + operand2);
        System.out.println(sabiranje);
    }

    public void sub() {
        double oduzimanje = (operand1 - operand2);
        System.out.println(oduzimanje);
    }

    public void mul() {
        double mnozenje = (operand1 * operand2);
        System.out.println(mnozenje);
    }

    public void div() {
        double deljenje = (operand1 / operand2);
        System.out.println(deljenje);
    }
}

