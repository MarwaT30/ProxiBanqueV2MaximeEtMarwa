package service;

import java.util.List;

import model.CarteCredit;
import model.Client;
import model.CompteCourant;
import model.CompteEpargne;

/**
 * Interface ClientService incluant les r�gles m�tiers : Les virements de compte
 * � compte, L'audit de l'agence, La gestion du patrimoine, La simulation de
 * cr�dit
 * 
 * @author Marwa et Maxime
 * 
 */
public interface ClientService {

	/**
	 * Lien avec la base de donn�es
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
	 * M�thode: Associer un compte epargne � un client.
	 * 
	 */
	public void ajouterCompteEpargne(CompteEpargne compteEpargne, Client client);

	/**
	 * M�thode: Associer un compte courant � un client.
	 * 
	 */
	public void ajouterCompteCourant(CompteCourant compteCourant, Client client);

	/**
	 * M�thode: Associer une carte bancaire � un client.
	 * 
	 */
	public void ajouterCarteBancaire(CarteCredit carte, Client client);

}
