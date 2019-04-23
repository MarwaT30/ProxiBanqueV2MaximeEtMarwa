package model;

import java.util.List;

/**
 * Classe Agence désignant le fonctionnement type d'une agence du réseau, avec un
 * manager unique référant et plusieurs conseillers
 * 
 * @author Marwa et Maxime
 */
public class Agence {

	// Attributs de la classe Agence

	private int id;
	private String Datecreation;
	private EmployeeManager gerant;
	private List<EmployeeConseiller> listeConseiller;

	// Constructeur de la classe Agence

	public Agence() {
		super();
	}

	public Agence(int id, String datecreation, EmployeeManager gerant, List<EmployeeConseiller> listeConseiller) {
		super();
		this.id = id;
		Datecreation = datecreation;
		this.gerant = gerant;
		this.listeConseiller = listeConseiller;
	}

	// Getteurs et Setteurs de la classe Agence

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDatecreation() {
		return Datecreation;
	}

	public void setDatecreation(String datecreation) {
		Datecreation = datecreation;
	}

	public EmployeeManager getGerant() {
		return gerant;
	}

	public void setGerant(EmployeeManager gerant) {
		this.gerant = gerant;
	}

	public List<EmployeeConseiller> getListeConseiller() {
		return listeConseiller;
	}

	public void setListeConseiller(List<EmployeeConseiller> listeConseiller) {
		this.listeConseiller = listeConseiller;
	}

	@Override
	public String toString() {
		return "Agence [id=" + id + ", Datecreation=" + Datecreation + ", gerant=" + gerant + ", listeConseiller="
				+ listeConseiller + "]";
	}

}
