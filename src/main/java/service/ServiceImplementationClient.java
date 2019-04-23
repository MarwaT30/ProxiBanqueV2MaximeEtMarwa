package service;

import java.util.List;

import model.CarteCredit;
import model.Client;
import model.CompteCourant;
import model.CompteEpargne;
import persistance.ClientDAO;
import persistance.MemoryClientDAO;

public class ServiceImplementationClient implements ClientService {

	// Attributs

	private ClientDAO daoClient = new MemoryClientDAO();

	// Méthodes relatives au Client

	public void ajouterClient(Client client) {
		if (client != null) {
			daoClient.enregistrerClient(client);
		}

	}

	public Client trouverClientParID(int idClient) {
		return daoClient.identifierClientParID(idClient);
	}

	public void modifierAdresse(int idClient, String adresse) {
		Client client = trouverClientParID(idClient);
		daoClient.modifierAdresseClient(client, adresse);

	}

	public void modifierCodePostalClient(int idClient, String codePostalClient) {
		Client client = trouverClientParID(idClient);
		daoClient.modifierCodePostalClient(client, codePostalClient);
	}

	public void modifierVilleClient(int idClient, String villeClient) {
		Client client = trouverClientParID(idClient);
		daoClient.modifierVilleClient(client, villeClient);
	}

	public void modifierTelClient(int idClient, String telClient) {
		Client client = trouverClientParID(idClient);
		daoClient.modifierTelClient(client, telClient);
	}

	public List<Client> listerLesClients() {
		return daoClient.trouverTousLesClients();
	}

	public void supprimerClient(Client client) {
		daoClient.supprimerClient(client.getIdClient());

	}

	public void ajouterCompteEpargne(CompteEpargne compteEpargne, Client client) {
		if (client.getCompteEpargne() != null) {
			client.getCompteEpargne().setNumeroCompte(numeroCom());
		}
	}

	public void ajouterCompteCourant(CompteCourant compteCourant, Client client) {
		if (client.getCompteCourant() != null) {
			client.getCompteCourant().setNumeroCompte(numeroCom());
		}
	}

	public void ajouterCarteBancaire(CarteCredit carte, Client client) {
		if (client.getCarteCredit() != null) {
			client.getCarteCredit().setNumeroCarte(numeroCar());
		}
	}

	/**
	 * Méthode générant un numéro de compte
	 * 
	 */
	private long numeroCom() {
		return (long) ((1 + Math.random()) * 10000000000L);
	}

	/**
	 * Méthode générant un numéro de carte
	 * 
	 */
	private long numeroCar() {
		return (long) ((1 + Math.random()) * 1000000000000000L);
	}

}
