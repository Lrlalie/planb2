package fr.planb.gr.model;
import javax.persistence.*;

/**
 * 
 * @author Laurence REYNIER
 * I do not know yet on which JVM we will run this application,
 * that's why I use the interface SERIALIZABLE which allows the 
 * use to exchange objects on different JVM,
 * to facilitate the persistence of the data and to save a configuration, ... 
 * @Entity : mandatory annotation in JPA (Java Persistance Api : java specifications to 
 * persist data, hibernate (for example) is an JPA implementation
 *
 */

/** 
 * @author Laurence REYNIER
 * My Entities will be database and Tables will be table : their names 
 * will be prefixed with a "t".
 * This Entity Person, is the customers' database
 * I use french name for columns' name because this application is made for a french society
 * names in Entity are in English
 * after the wireframes, I decided to separate the person and the coordinates, i create a new class Contact
 */
@Entity (name = "personne")
@Table(name="tpersonne")
public class Person {
	
	//autoincremental id, in Talend : default length for integer is 19, I kept
	//this convention
	//strategy : is an attribute to define generator type to use, AUTO is a default value
	//but I wanted to use it for memory
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idPersonne", length = 19, nullable= true, unique = true)
	private long idPersonne;
	
	//Firstname
	@Basic(optional =  false)
	@Column(name = "nom", length = 255, nullable= true, unique = true)
	private String firstName;
	
	//lastname
	@Basic(optional =  false)
	@Column(name = "prenom", length = 255, nullable= true, unique = true)
	private String lastName;	
	
	
	/**
	 * Constructors generated with : Source tag
	 * empty and overrided Constructors
	 */
	public Person() {
		super();
	}

	/**
	 * @param idPersonne
	 * @param firstName
	 * @param lastName
	 * @param eMail
	 * @param mobile
	 * @param address
	 * @param postalCode
	 * @param country
	 * @param homePhone
	 * @param jobPhone
	 * @param qrCode
	 */
	public Person(long idPersonne, String firstName, String lastName) {
		super();
		this.idPersonne = idPersonne;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	// Getters or accessors, and setters or mutators are generated by source tag
	/**
	 * @return the idPersonne
	 */
	public long getIdPersonne() {
		return idPersonne;
	}

	/**
	 * @param idPersonne the idPersonne to set
	 */
	public void setIdPersonne(long idPersonne) {
		this.idPersonne = idPersonne;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	 
}

