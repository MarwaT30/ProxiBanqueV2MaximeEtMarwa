package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe EmployeeConseiller héritant de la classe Employee, caractérisée par le
 * statut Conseiller de la banque
 * 
 * @author Marwa et Maxime
 *
 *
 */
public class EmployeeConseiller extends Employee {

	// Attributs de la classe EmployeeConseiller

	private static final String STATUTC = "Conseiller";
	private List<Client> listeClient = new ArrayList<Client>();

	// Constructeur de la classe EmployeeConseiller

	public EmployeeConseiller(String firstName, String lastName) {
		super(firstName, lastName);
	}

	// Getteurs et Setteurs de la classe EmployeeConseiller

	public List<Client> getListeClient() {
		return listeClient;
	}

	public void setListeClient(List<Client> listeClient) {
		this.listeClient = listeClient;
	}

	public static String getStatutc() {
		return STATUTC;
	}

	@Override
	public String toString() {
		return "EmployeeConseiller [listeClient=" + listeClient + "]";
	}

}
