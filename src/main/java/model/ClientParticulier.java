package model;

/**
 * Classe ClientParticulier héritant de la classe Client et désignant les
 * clients particuliers de la banque
 * 
 * @author Marwa et Maxime
 *
 */
public class ClientParticulier extends Client {

	// Attributs de la classe ClientParticulier

	private String firstName;
	private String lastName;
	public final static String STATUTP = "Particular";

	// Constructeurs de la classe ClientParticulier

	public ClientParticulier() {
		super();
	}

	public ClientParticulier(int idClient, String adresse, String codePostal, String ville, String numeroTel,
			CompteCourant compteCourant, CompteEpargne compteEpargne, CarteCredit carteCredit, String firstName,
			String lastName) {
		super(idClient, adresse, codePostal, ville, numeroTel, compteCourant, compteEpargne, carteCredit);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public ClientParticulier(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Getteurs et Setteurs de la classe ClientParticulier

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static String getStatutp() {
		return STATUTP;
	}

	@Override
	public String toString() {
		return "ClientParticulier [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
