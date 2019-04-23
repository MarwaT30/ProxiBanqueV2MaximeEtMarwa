package presentation;

import java.util.Scanner;

import model.Client;
import model.ClientParticulier;
import model.Compte;
import model.CompteCourant;
import model.CompteEpargne;
import service.ServiceImplementationClient;
import service.ServiceImplementationMetiers;
import service.ClientService;
import service.MetiersSevice;

/**
 * Veuillez trouver au niveau de cette classe Main quelques exemples d'exécution
 * de votre application
 * 
 * @author Marwa et Lydiane
 *
 */
public class Main {

	public static void main(String[] args) {
//
//		Scanner input = new Scanner(System.in);

		Client c = new ClientParticulier("firstName", "lastName");
		Client c2 = new ClientParticulier("firstName", "lastName");

		System.out.println(c.getAdresse());
		CompteCourant a1 = new CompteCourant(111111111, "dateOuvertureCompte", -600000.0, c);
		CompteCourant a2 = new CompteCourant(111111111, "dateOuvertureCompte", 500.0, c2);

		c.setIdClient(1);
		c.setCompteCourant(a1);
		c2.setCompteCourant(a2);
		System.out.println(a1.getSoldeCompte());

		ClientService cs = new ServiceImplementationClient();
		cs.ajouterClient(c);
		cs.ajouterClient(c2);

		MetiersSevice cm = new ServiceImplementationMetiers();
		Boolean a = cm.audit(c);
		if (a == false) {
			System.out.println("merde");
		}

		Boolean a21 = cm.patrimony(c);
		if (a21 == true) {
			System.out.println("riche");
		}

//
		// Création de Comptes et de Clients

//		CompteCourant a2 = new CompteCourant("1233333", 6200.0, "03-20-2019");
//		CompteCourant a3 = new CompteCourant("1944422", 251000.0, "04-20-2019");
//		CompteCourant a4 = new CompteCourant("1944480", 2000.0, "10-20-2019");
//
//		CompteEpargne b1 = new CompteEpargne("1455555", 200.0, "09-20-2019");
//		CompteEpargne b2 = new CompteEpargne("1533333", 6800.0, "10-20-2019");
//		CompteEpargne b3 = new CompteEpargne("1466666", 250000.00, "05.03.2018");
//		CompteEpargne b4 = new CompteEpargne("1488886", -6000.00, "05.10.2018");
// 
//		Client p2 = new Client("Marwa", "Tifafi", 2, "25 rue Theodore", "91750", "paris", "0652511212", a2, b2);
//		Client p3 = new Client("John", "Smith", 3, "13 rue place", "78000", "Paris", "0618457518", a3, b3);
//		Client p4 = new Client("Margaret", "Tatcher", 4, "14 rue du maine", "95000", "Meaux", "0618487725", a4, b4);
//
//		ClientService cs = new ClientFileManagement();
//		cs.addClient(p1);
//		cs.addClient(p2);
//		cs.addClient(p3);
//		cs.addClient(p4);
//
//		System.out.println("Exemple Virement : ");
//		// Situation de virement de compte courant à Compte Courant (Particuliers)
//		System.out.println("Le solde du Compte Courant du client qui va etre débité est actuellement de "
//				+ p1.getCourantAccount().getSolde() + " euros");
//		System.out.println("Le solde du Compte Courant du client qui va etre crédité est actuellement de "
//				+ p2.getCourantAccount().getSolde() + " euros");
//		System.out.println("\n");
//
//		// Prise en compte de la somme du virement en entrée.
//		// Accepter le virement et l'exécuter, ou sinon le refuser.
//		System.out.println("De quelle somme voulez vous faire un virement?");
//		double amount = input.nextDouble();
//
//		boolean result = cs.transferCourantCourant(p1, p2, amount);
//		if (result == false) {
//			System.out.println("Transfert Interdit");
//		} else if (result == true) {
//
//			System.out.println("le transfert de " + amount + " euros a été effectué avec succès");
//			System.out.println("Le solde du Compte Courant du client qui a été débité est actuellement de "
//					+ p1.getCourantAccount().getSolde() + " euros");
//			System.out.println("Le solde du Compte Courant du client qui a été crédité est actuellement de "
//					+ p2.getCourantAccount().getSolde() + " euros");
//		}
//		System.out.println("\nExemple Audit Compte dans les Normes :");
//
//		// Audit : Situation d'un Compte dans les Normes
//		boolean resultAudit = cs.auditParticular(p3);
//		System.out.println("Voici la situation du client : " + p3);
//		if (resultAudit == false) {
//			System.out.println("Attention compte courant du client en dehors du débit autorisé (5000 euros)");
//		} else if (resultAudit == true) {
//			System.out.println("Le compte courant a été vérifié, aucune anomalie relevée");
//		}
//		System.out.println("\nExemple Audit Compte hors Débit : ");
//
//		// Audit : Situation d'un Compte Hors Débit
//		boolean resultAudit2 = cs.auditParticular(p4);
//		System.out.println("Voici la situation du client : " + p4);
//		if (resultAudit2 == false) {
//			System.out.println("Attention compte courant du client en dehors du débit autorisé (5000 euros)");
//		} else if (resultAudit2 == true) {
//			System.out.println("Le compte courant a été vérifié, aucune anomalie relevée");
//		}
//		System.out.println("\nExemple Patrimoine : ");
//
//		// Patrimoine : situation d'un Client fortuné
//		boolean resultPatrimony = cs.patrimony(p3);
//		if (resultPatrimony == true) {
//			System.out.println("Le client : " + p3);
//			System.out.println(
//					"On vous propose de nous contacter pour vous faire part de nos offres de gestion du patrimoine");
//		}
//		System.out.println("\nExemple Simulation Crédit Immobilier : ");
//
//		// Simulation Crédit Immobilier : Autorisé
//		boolean resultCredit = cs.realEstateCredit(p3);
//		if (resultCredit == true) {
//			System.out.println("Le client : " + p3 + " a le droit à un crédit immobilier");
//		}
//		System.out.println("\nExemple Simulation Crédit Consommation : ");
//
//		// Simulation Crédit Consommation : Refusé
//		boolean resultCredit2 = cs.consumerCredit(p4);
//		if (resultCredit2 == true) {
//			System.out.println("Le client : " + p4 + " a le droit à un crédit de Consommation");
//		} else {
//			System.out.println("Le client : " + p4 + " n'a pas le droit à un crédit de Consommation");
//		}
//
//		input.close();
//	}
	}
}
