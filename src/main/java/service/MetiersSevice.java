package service;

import model.Client;
import model.Compte;

public interface MetiersSevice {

	/**
	 * M�thode: Virement depuis le compte courant vers le compte �pargne.
	 * 
	 * 
	 */
	public void virementCourantAEpargne(Client c, double montantVirement);

	/**
	 * M�thode: Virement depuis le compte �pargne vers compte courant.
	 * 
	 * 
	 */
	public void virementEpargneACourant(Client c, double montantVirement);

	/**
	 * M�thode: Virement d'un compte courant vers un autre compte courant
	 * 
	 */
	public void virementClientAClient(Client c1, Client c2, double montantVirement);

	/**
	 * M�thode permettant de r�aliser l'audit d'une agence
	 * 
	 * @param Agence agence
	 */

	public void passerVirement(double montant, Compte emetteur, Compte recepteur);

	/**
	 * M�thode permettant de r�aliser l'audit d'une agence. La m�thode retourne un
	 * bool�en qui vaut true si l'audit s'est bien d�roul�, sinon un bool�en false.
	 * 
	 *
	 */
	boolean audit(Client client);

	/**
	 * M�thode permettant de r�aliser de gerer le patrimoine des clients fortunes
	 * 
	 *
	 */
	public boolean patrimony(Client client);

}
