package model;

/**
 * Classe CarteCredit désignant les cartes de crédit proposées par la banque aux
 * clients
 * 
 * @author Marwa et Maxime
 *
 */
public class CarteCredit {

	// Attributs de la classe CarteCredit

	private long numeroCarte;
	private String typeCarte;
	private Client clientAssocie;

	// Constructeur de la classe CarteCredit

	public CarteCredit(long numeroCarte, String typeCarte, Client clientAssocie) {
		super();
		this.numeroCarte = numeroCarte;
		this.typeCarte = typeCarte;
		this.clientAssocie = clientAssocie;
	}

	// Getteurs et Setteurs de la classe CarteCredit

	public long getNumeroCarte() {
		return numeroCarte;
	}

	public void setNumeroCarte(long numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	public String getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	public Client getClientAssocie() {
		return clientAssocie;
	}

	public void setClientAssocie(Client clientAssocie) {
		this.clientAssocie = clientAssocie;
	}

	@Override
	public String toString() {
		return "CreditCard [numeroCarte=" + numeroCarte + ", typeCarte=" + typeCarte + "]";
	}

}
