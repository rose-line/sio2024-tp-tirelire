package fr.pgah.tp;

import java.util.Scanner;

public class AppTirelire {

  // Méthode main initiale
  // Vous ne devez pas modifier cette méthode
  public static void main(String[] args) {

    Tirelire monCochon = new Tirelire();

    monCochon.vider();
    monCochon.secouer();
    System.out.println(monCochon.getCaractéristiques());
    monCochon.sortir(50.0);
    monCochon.secouer();
    System.out.println(monCochon.getCaractéristiques());
    monCochon.ajouter(500.0);
    monCochon.secouer();
    System.out.println(monCochon.getCaractéristiques());
    monCochon.sortir(40.0);
    monCochon.sortir(15.0);
    System.out.println(monCochon.getCaractéristiques());

    double budgetVacances;
    Scanner clavier = new Scanner(System.in);

    System.out.print("Indiquez le budget de vos vacances : ");
    budgetVacances = clavier.nextDouble();

    double soldeAprèsVacances = monCochon.soldeSiOnSort(budgetVacances);

    if (soldeAprèsVacances >= 0) {
      System.out.println("Vous êtes assez riche pour partir en vacances !");
      System.out.println("Il vous restera " + soldeAprèsVacances + " euros à la rentrée.");
      monCochon.sortir(budgetVacances);
    } else {
      double manque = -soldeAprèsVacances;
      System.out.println("Il vous manque " + manque + " euros pour partir en vacances...");
    }
    clavier.close();
  }
}
