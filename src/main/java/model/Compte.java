package model;

/**
 * Classe Compte désignant les comptes bancaires des clients de l'agence
 * 
 * @author Marwa et Maxime
 *
 */
public class Compte {

	// Attributs de la classe Compte

	private long numeroCompte;
	private String dateOuvertureCompte;
	private double soldeCompte;
	private Client clientAssocie;

	// Constructeur de la classe Compte

	public Compte() {
		super();
	}

	public Compte(long numeroCompte, String dateOuvertureCompte, double soldeCompte, Client clientAssocie) {
		super();
		this.numeroCompte = numeroCompte;
		this.dateOuvertureCompte = dateOuvertureCompte;
		this.soldeCompte = soldeCompte;
		this.clientAssocie = clientAssocie;
	}

	// Getteurs et Setteurs de la classe Compte

	public long getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getDateOuvertureCompte() {
		return dateOuvertureCompte;
	}

	public void setDateOuvertureCompte(String dateOuvertureCompte) {
		this.dateOuvertureCompte = dateOuvertureCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public Client getClientAssocie() {
		return clientAssocie;
	}

	public void setClientAssocie(Client clientAssocie) {
		this.clientAssocie = clientAssocie;
	}

	@Override
	public String toString() {
		return "Compte [numeroCompte=" + numeroCompte + ", dateOuvertureCompte=" + dateOuvertureCompte
				+ ", soldeCompte=" + soldeCompte + ", clientAssocie=" + clientAssocie + "]";
	}

}
