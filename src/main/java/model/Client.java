package model;

/**
 * Classe Client caractérisant tous les clients de la banque
 * 
 * @author Marwa et Maxime
 *
 */
public class Client {

	// Attributs de la classe Client

	private int idClient;
	private String adresse;
	private String codePostal;
	private String ville;
	private String numeroTel;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	private CarteCredit carteCredit;

	// Constructeurs de la classe Client

	public Client() {
		super();
	}

	public Client(int idClient, String adresse, String codePostal, String ville, String numeroTel,
			CompteCourant compteCourant, CompteEpargne compteEpargne, CarteCredit carteCredit) {
		super();
		this.idClient = idClient;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.numeroTel = numeroTel;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
		this.carteCredit = carteCredit;
	}

	public Client(int idClient, String adresse, String codePostal, String ville, String numeroTel) {
		super();
		this.idClient = idClient;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.numeroTel = numeroTel;
	}

	// Getteurs et Setteurs de la classe Client

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	public CarteCredit getCarteCredit() {
		return carteCredit;
	}

	public void setCarteCredit(CarteCredit carteCredit) {
		this.carteCredit = carteCredit;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", adresse=" + adresse + ", codePostal=" + codePostal + ", ville="
				+ ville + ", numeroTel=" + numeroTel + ", compteCourant=" + compteCourant + ", compteEpargne="
				+ compteEpargne + ", carteCredit=" + carteCredit + "]";
	}

}
