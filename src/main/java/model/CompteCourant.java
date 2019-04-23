package model;

/**
 * Classe CompteCourant héritant de la classe Compte désignant les comptes
 * bancaires courants des clients de l'agence
 * 
 * @author Marwa et Maxime
 *
 */
public class CompteCourant extends Compte {

	// Attributs de la classe CompteCourant

	private static final String TYPEC = "Courant";
	private static final int AUTORISATIONDECOUVERT = 1000;

	// Constructeurs de la classe CompteCourant

	public CompteCourant() {
		super();
	}

	public CompteCourant(long numeroCompte, String dateOuvertureCompte, double soldeCompte, Client clientAssocie) {
		super(numeroCompte, dateOuvertureCompte, soldeCompte, clientAssocie);
	}

	// Getteurs et Setteurs de la classe CompteCourant

	public static String getTypec() {
		return TYPEC;
	}

	public static int getAutorisationdecouvert() {
		return AUTORISATIONDECOUVERT;
	}

	@Override
	public String toString() {
		return "CompteCourant [getNumeroCompte()=" + getNumeroCompte() + ", getDateOuvertureCompte()="
				+ getDateOuvertureCompte() + ", getSoldeCompte()=" + getSoldeCompte() + ", getClientAssocie()="
				+ getClientAssocie() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
