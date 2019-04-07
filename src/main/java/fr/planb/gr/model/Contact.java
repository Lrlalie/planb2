package fr.planb.gr.model;
import javax.persistence.*;

/**
 * 
 * @author LALIE
 *
 */
@Entity (name="contact")
@Table (name="tcontact")
public class Contact extends Person {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idContact", length = 19, nullable= true, unique = true)
	private long idContact;
	
	@Basic(optional =  false)
	@Column(name = "email", length = 255, nullable= true, unique = true)
	private String eMail;	
	
	@Basic(optional =  false)
	@Column(name = "telmobile", length = 19, nullable= true, unique = true)
	private long mobile;	
	
	@Basic(optional =  false)
	@Column(name = "adresse", length = 255, nullable= true, unique = true)
	private String address;	
	
	@Basic(optional =  false)
	@Column(name = "codepostal", length = 19, nullable= true, unique = true)
	private long postalCode;
	
	@Basic(optional =  false)
	@Column(name = "ville", length = 255, nullable= true, unique = true)
	private String country;	
	
	@Basic(optional =  false)
	@Column(name = "teldomicile", length = 19, nullable= true, unique = true)
	private long homePhone;	
	
	@Basic(optional =  false)
	@Column(name = "telprofession", length = 19, nullable= true, unique = true)
	private long jobPhone;	
	
	//for qrCode : I use a length to 8000 (max of String) because a qrCode could have
	//7089 numbers, 4296 alphanumerics, 2953 binary, ...
	//total of needs is 1300 about. It is enough for this Entity
	@Basic(optional =  false)
	@Column(name = "qrcode", length = 8000, nullable= true, unique = true)
	private String qrCode;

	public Contact() {
		super();
		
	}

	public Contact(long idPersonne, String firstName, String lastName, long idContact, String eMail, long mobile, String address, long postalCode, String country,
			long homePhone, long jobPhone, String qrCode) {
		super(idPersonne, firstName, lastName);
		this.idContact = idContact;
		this.eMail = eMail;
		this.mobile = mobile;
		this.address = address;
		this.postalCode = postalCode;
		this.country = country;
		this.homePhone = homePhone;
		this.jobPhone = jobPhone;
		this.qrCode = qrCode;
	}

	/**
	 * 
	 * @return the idContact
	 */
	public long getIdContact() {
		return idContact;
	}

	/**
	 * @param idPersonne the idPersonne to set
	 */	
	public void setIdContact(long idContact) {
		this.idContact = idContact;
	}

	/**
	 * @return the eMail
	 */
	public String geteMail() {
		return eMail;
	}

	/**
	 * @param eMail the eMail to set
	 */
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	/**
	 * @return the mobile
	 */
	public long getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the postalCode
	 */
	public long getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(long postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the homePhone
	 */
	public long getHomePhone() {
		return homePhone;
	}

	/**
	 * @param homePhone the homePhone to set
	 */
	public void setHomePhone(long homePhone) {
		this.homePhone = homePhone;
	}

	/**
	 * @return the jobPhone
	 */
	public long getJobPhone() {
		return jobPhone;
	}

	/**
	 * @param jobPhone the jobPhone to set
	 */
	public void setJobPhone(long jobPhone) {
		this.jobPhone = jobPhone;
	}

	/**
	 * @return the qrCode
	 */
	public String getQrCode() {
		return qrCode;
	}

	/**
	 * @param qrCode the qrCode to set
	 */
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}	

}
