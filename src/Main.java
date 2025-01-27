public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Operation calcul = new Operation(20,10);

        System.out.println(calcul.addition());
        System.out.println(calcul.multiplication());
        System.out.println(calcul.division());
        System.out.println(calcul.soustraction());
        calcul.afficherHistorique();

        Operation calcul2 = new Operation(16.5,3.6);
        System.out.println(calcul2.addition());
        System.out.println(calcul2.multiplication());
        System.out.println(calcul2.division());
        System.out.println(calcul2.soustraction());
        calcul2.afficherHistorique();

    }

    }
