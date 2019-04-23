package model;

/**
 * Classe ClientEntreprise héritant de la classe Client et désignant les clients
 * entreprises de la banque
 * 
 * @author Marwa et Maxime
 *
 */
public class ClientEntreprise extends Client {

	// Attributs de la classe ClientEntreprise

	private String nomEntreprise;
	public final static String STATUTC = "Company";

	// Constructeurs de la classe ClientEntreprise

	public ClientEntreprise(int idClient, String adresse, String codePostal, String ville, String numeroTel,
			CompteCourant compteCourant, CompteEpargne compteEpargne, CarteCredit carteCredit, String nomEntreprise) {
		super(idClient, adresse, codePostal, ville, numeroTel, compteCourant, compteEpargne, carteCredit);
		this.nomEntreprise = nomEntreprise;
	}

	// Getteurs et Setteurs de la classe ClientEntreprise

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public static String getStatutc() {
		return STATUTC;
	}

}
