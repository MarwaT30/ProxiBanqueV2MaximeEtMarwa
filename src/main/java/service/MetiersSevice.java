package service;

import model.Client;
import model.Compte;

public interface MetiersSevice {

	/**
	 * Méthode: Virement depuis le compte courant vers le compte épargne.
	 * 
	 * 
	 */
	public void virementCourantAEpargne(Client c, double montantVirement);

	/**
	 * Méthode: Virement depuis le compte épargne vers compte courant.
	 * 
	 * 
	 */
	public void virementEpargneACourant(Client c, double montantVirement);

	/**
	 * Méthode: Virement d'un compte courant vers un autre compte courant
	 * 
	 */
	public void virementClientAClient(Client c1, Client c2, double montantVirement);

	/**
	 * Méthode permettant de réaliser l'audit d'une agence
	 * 
	 * @param Agence agence
	 */

	public void passerVirement(double montant, Compte emetteur, Compte recepteur);

	/**
	 * Méthode permettant de réaliser l'audit d'une agence. La méthode retourne un
	 * booléen qui vaut true si l'audit s'est bien déroulé, sinon un booléen false.
	 * 
	 *
	 */
	boolean audit(Client client);

	/**
	 * Méthode permettant de réaliser de gerer le patrimoine des clients fortunes
	 * 
	 *
	 */
	public boolean patrimony(Client client);

}
