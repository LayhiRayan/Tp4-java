package ex1;

public class Devloppeur extends Personne {
	private String specialite;

    public Devloppeur(String nom, String prenom, String mail, String telephone, double salaire, String specialite) {
        super(nom, prenom, mail, telephone, salaire);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        return this.salaire * 1.2; 
    }

    @Override
    public String toString() {
        return "Devloppeur [id=" + id + ", nom=" + nom.toUpperCase() + ", prenom=" +
                prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase() +
                ", mail=" + mail + ", telephone=" + telephone + ", salaire=" + calculerSalaire() +
                ", specialite=" + specialite + "]";
    }



}
