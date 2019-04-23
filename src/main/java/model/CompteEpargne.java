package model;

/**
 * Clases CompteEpargne héritant de la classe Compte désignant les comptes
 * d'épargne des clients de l'agence
 * 
 * @author Marwa et Maxime
 *
 */
public class CompteEpargne extends Compte {

	// Attributs de la classe CompteEpargne

	private static final String TYPEE = "Epargne";
	private static final double TAUXREMUNERATIONDEFAUT = 0.03;

	// Constructeurs de la classe CompteEpargne

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(long numeroCompte, String dateOuvertureCompte, double soldeCompte, Client clientAssocie) {
		super(numeroCompte, dateOuvertureCompte, soldeCompte, clientAssocie);
	}

	// Getteurs et setteurs de la classe CompteEpargne

	public static String getTypee() {
		return TYPEE;
	}

	public static double getTauxremunerationdefaut() {
		return TAUXREMUNERATIONDEFAUT;
	}

	@Override
	public String toString() {
		return "CompteEpargne [getNumeroCompte()=" + getNumeroCompte() + ", getDateOuvertureCompte()="
				+ getDateOuvertureCompte() + ", getSoldeCompte()=" + getSoldeCompte() + ", getClientAssocie()="
				+ getClientAssocie() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
