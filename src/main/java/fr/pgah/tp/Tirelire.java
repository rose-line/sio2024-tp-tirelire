package fr.pgah.tp;

public class Tirelire {

  double montant;

  public Tirelire() {
    montant = 0;
  }

  public Tirelire(double montantInitial) {
    montant = montantInitial;
  }

  public void vider() {
    montant = 0;
  }


  public void secouer() {
    if (montant > 0)
      System.out.println("Gling gling !");
  }

  public void ajouter(double montantAjouté) {
    montant += montantAjouté;
  }

  public void sortir(double montantASortir) {
    if (montant < 0)
      return;

    montant -= montantASortir;

    if (montant < 0)
      montant = 0;
  }

  public double soldeSiOnSort(double montantASortir) {
    if (montantASortir < 0)
      return montant;
    return montant - montantASortir;
  }

  public String getCaractéristiques() {
    if (montant == 0)
      return "Vous êtes sans le sou...";
    else {
      // Utilisation de String.format pour les arrondis
      // https://www.geeksforgeeks.org/java-string-format-method-with-examples/
      return String.format("Vous avez %.2f euros dans la tirelire.", montant);
    }
  }
}
