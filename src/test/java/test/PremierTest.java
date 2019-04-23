package test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import model.Client;
import model.ClientParticulier;
import persistance.ClientDAO;
import persistance.MemoryClientDAO;

public class PremierTest {

	
	/**
	 * Méthode de test qui permet de vérifier que la méthode lire un client dans
	 * la DB renvoie bien un objet de type client non null.
	 */
	@Test
	public void testLireUnClient1() {
		Client c = new ClientParticulier("firstName", "lastName");
		c.setIdClient(1);
		ClientDAO  cc = new MemoryClientDAO();
		cc.enregistrerClient(c);
		int idClient = 1;
		System.out.println(cc.identifierClientParID(idClient));
		assertNotNull(cc.identifierClientParID(idClient));
	}



}
