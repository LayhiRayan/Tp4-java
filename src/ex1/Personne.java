package ex1;

public abstract class Personne {
	public static int compt;
	protected int id;
	protected String nom;
	protected String prenom;
	protected String mail; 
	protected String telephone;
	protected double salaire; 
	
	protected abstract double calculerSalaire();

	public Personne(String nom, String prenom, String mail, String telephone, double salaire) {
		super();
		this.id = ++compt;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.telephone = telephone;
		this.salaire = salaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", telephone="
				+ telephone + ", salaire=" + salaire + "]";
	}}


