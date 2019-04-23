package service;

import model.Client;
import model.ClientEntreprise;
import model.ClientParticulier;
import model.Compte;

public class ServiceImplementationMetiers implements MetiersSevice {

	@Override
	public void virementCourantAEpargne(Client c, double montantVirement) {
		// TODO Auto-generated method stub

	}

	@Override
	public void virementEpargneACourant(Client c, double montantVirement) {
		// TODO Auto-generated method stub

	}

	@Override
	public void virementClientAClient(Client c1, Client c2, double montantVirement) {
		// TODO Auto-generated method stub

	}

	@Override
	public void passerVirement(double montant, Compte emetteur, Compte recepteur) {

		double nouveauMontantEmetteur = emetteur.getSoldeCompte() - montant;
		emetteur.setSoldeCompte(nouveauMontantEmetteur);

		double nouveauMontantRecepteur = recepteur.getSoldeCompte() + montant;
		recepteur.setSoldeCompte(nouveauMontantRecepteur);

	}

	@Override
	public boolean audit(Client client) {
		boolean okAudit = true;

		if (client instanceof ClientParticulier) {
			if (client.getCompteEpargne() != null) {
				if (client.getCompteCourant().getSoldeCompte() + client.getCompteEpargne().getSoldeCompte() < -5000) {
					okAudit = false;
				}
			} else {
				if (client.getCompteCourant().getSoldeCompte() < -5000) {
					okAudit = false;
				}
			}
		}

		if (client instanceof ClientEntreprise) {
			if (client.getCompteEpargne() != null) {
				if (client.getCompteCourant().getSoldeCompte() + client.getCompteEpargne().getSoldeCompte() < -50000) {
					okAudit = false;
				}
			} else {
				if (client.getCompteCourant().getSoldeCompte() < -50000) {
					okAudit = false;
				}
			}

		}
		return okAudit;
	}

	@Override
	public boolean patrimony(Client client) {

		double a = 0;
		double b = 0;

		a = client.getCompteCourant().getSoldeCompte();

		if (client.getCompteEpargne() != null) {
			b = client.getCompteEpargne().getSoldeCompte();
		}

		double total = a + b;

		if (total > 500000.0) {
			return true;
		} else {
			return false;
		}

	}

}
