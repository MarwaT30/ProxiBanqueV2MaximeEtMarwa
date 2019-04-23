package persistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Client;

/**
 * Classe ClientMemoireDAO qui impl�mente l'interface ClientDAO. Cette classe
 * permet de sauvegarder, modifier, lire, supprimer les informations des clients
 * dans la base de donn�es clients. Notre base de donn�es clients est assimil�e
 * � une HashMap.
 * 
 * @author Marwa & Maxime
 *
 */
public class MemoryClientDAO implements ClientDAO {

	// Attributs

	private static final Map<Integer, Client> BDDCLIENT = new HashMap<Integer, Client>();
	private static Integer pk = 0;

	// M�thodes : Cr�ation, r�cup�ration et suppression d'un client

	public void enregistrerClient(Client client) {
		client.setIdClient(pk);
		BDDCLIENT.put(client.getIdClient(), client);
		pk++;
	}

	public Client identifierClientParID(int idClient) {
		return BDDCLIENT.get(idClient);
	}

	public List<Client> trouverTousLesClients() {
		return new ArrayList<Client>(BDDCLIENT.values());
	}

	public void supprimerClient(int idClient) {
		BDDCLIENT.remove(idClient);

	}

	// M�thodes : modification des informations d'un client

	public void modifierAdresseClient(Client client, String nouvelleAdresse) {
		client.setAdresse(nouvelleAdresse);
	}

	public void modifierCodePostalClient(Client client, String codePostalClient) {
		client.setCodePostal(codePostalClient);

	}

	public void modifierVilleClient(Client client, String villeClient) {
		client.setVille(villeClient);

	}

	public void modifierTelClient(Client client, String telClient) {
		client.setNumeroTel(telClient);

	}

}
