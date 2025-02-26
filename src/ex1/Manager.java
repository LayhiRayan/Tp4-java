package ex1;

public class Manager extends Personne {
    protected String service;

    public Manager(String nom, String prenom, String mail, String telephone, double salaire, String service) {
        super(nom, prenom, mail, telephone, salaire);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public double calculerSalaire() {
        return salaire * 1.35; 
    }

    @Override
    public String toString() {
        return "Manager [id=" + id + ", nom=" + nom.toUpperCase() + 
               ", prenom=" + prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase() +
               ", mail=" + mail + ", telephone=" + telephone + 
               ", salaire=" + calculerSalaire() + " dh, service=" + service + "]";
    }

    public String afficher() {
        return "Le salaire du manager " + prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase() +
               " " + nom.toUpperCase() + " est : " + calculerSalaire() + " dh, son service : " + service;
    }
}

