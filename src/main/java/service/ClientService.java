package service;

import java.util.List;

import model.CarteCredit;
import model.Client;
import model.CompteCourant;
import model.CompteEpargne;

/**
 * Interface ClientService incluant les règles métiers : Les virements de compte
 * à compte, L'audit de l'agence, La gestion du patrimoine, La simulation de
 * crédit
 * 
 * @author Marwa et Maxime
 * 
 */
public interface ClientService {

	/**
	 * Lien avec la base de données
	 * 
	 */

	public void ajouterClient(Client client);

	public Client trouverClientParID(int idClient);

	public void modifierAdresse(int idClient, String adresse);

	public void modifierCodePostalClient(int idClient, String codePostalClient);

	public void modifierVilleClient(int idClient, String villeClient);

	public void modifierTelClient(int idClient, String telClient);

	public List<Client> listerLesClients();

	public void supprimerClient(Client client);

	/**
	 * Méthode: Associer un compte epargne à un client.
	 * 
	 */
	public void ajouterCompteEpargne(CompteEpargne compteEpargne, Client client);

	/**
	 * Méthode: Associer un compte courant à un client.
	 * 
	 */
	public void ajouterCompteCourant(CompteCourant compteCourant, Client client);

	/**
	 * Méthode: Associer une carte bancaire à un client.
	 * 
	 */
	public void ajouterCarteBancaire(CarteCredit carte, Client client);

}
