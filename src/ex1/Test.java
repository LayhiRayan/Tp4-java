package ex1;

public class Test {

	public static void main(String[] args) {

        Manager manager = new Manager("Lachgar", "Mohamed", "mohamed.lachgar@gmail.com", "06 11 22 33 44", 30000, "Informatique");


        Devloppeur dev = new Devloppeur("Salim", "Karim", "karim.salim@gmail.com", "06 55 66 77 88", 10000, "PHP");


        System.out.println("Le salaire du manager " + manager.getNom().toUpperCase() + " " +
                           manager.getPrenom().substring(0, 1).toUpperCase() + manager.getPrenom().substring(1).toLowerCase() +
                           " est : " + manager.calculerSalaire() + " dh, son service : " + manager.getService());

        System.out.println("Le salaire du développeur " + dev.getNom().substring(0, 1).toUpperCase() + dev.getNom().substring(1).toLowerCase() + 
                           " " + dev.getPrenom().toLowerCase() + 
                           " est : " + dev.calculerSalaire() + " dh, sa spécialité : " + dev.getSpecialite());
    }

}
