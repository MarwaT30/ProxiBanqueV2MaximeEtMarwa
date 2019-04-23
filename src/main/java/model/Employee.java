package model;

/**
 * Classe Employee spécifique aux employés de la banque
 * 
 * @author Marwa et Maxime
 *
 */
public class Employee {

	// Attributs de la classe Employee

	private String firstName;
	private String lastName;
	private int idEmployee;

	// Constructeur de la classe Employee

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Getteurs et Setteurs de la classe Employee

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", idEmployee=" + idEmployee + "]";
	}

}
