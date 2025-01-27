import java.util.ArrayList;
import java.util.List;



public class Operation {
    public double nombre1;
    public double nombre2;
    private List<String> historique;

    public Operation(double nombre2, double nombre1) {
        this.nombre1 = nombre2;
        this.nombre2 = nombre1;
        this.historique = new ArrayList<>();
    }

    public double getNombre1() {
        return nombre1;
    }

    public double getNombre2() {
        return nombre2;
    }

    public double addition() {
        double resultat = nombre1 + nombre2;
        historique.add(nombre1+" + "+nombre2+" = "+resultat);
        return resultat;
    }

    public double soustraction() {
        double resultat = nombre1 - nombre2;
        historique.add(nombre1+" - "+nombre2+" = "+resultat);
        return resultat;
    }

    public double division() {
        double resultat = nombre1 / nombre2;
        historique.add(nombre1+" / "+nombre2+" = "+resultat);
        return resultat;
    }

    public double multiplication() {
        double resultat = nombre1 * nombre2;
        historique.add(nombre1+" * "+nombre2+" = "+resultat);
        return resultat;
    }

  public void afficherHistorique() {

            System.out.println("historique");
            for (String histo : historique) {
                System.out.println(histo);
            }



        }
  }





