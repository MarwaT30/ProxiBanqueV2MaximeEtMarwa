package model;

/**
 * Classe Manager héritant de la classe Employee, caractérisée par le statut
 * Manager de la banque
 * 
 * @author Marwa et Maxime
 */
public class EmployeeManager extends Employee {

	// Attributs de la classe EmployeeManager

	private static final String STATUTM = "Manager";

	// Constructeur de la classe EmployeeManager

	public EmployeeManager(String firstName, String lastName) {
		super(firstName, lastName);
	}

	// Getteurs et Setteurs de la classe EmployeeManager

	public static String getStatutm() {
		return STATUTM;
	}

	@Override
	public String toString() {
		return "EmplyeeManager [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getIdEmployee()=" + getIdEmployee() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
