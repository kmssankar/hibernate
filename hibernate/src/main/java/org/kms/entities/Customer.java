package org.kms.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	int custId;
	String name;
	String type;
	@OneToOne(mappedBy="customer",cascade=CascadeType.ALL)
	private PanDetails panDetails;
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
	private Set<ContactDetails> contactdetails;
	
	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param custId
	 * @param name
	 * @param type
	 * @param panDetails
	 * @param contactdetails
	 */
	public Customer(int custId, String name, String type) {
		super();
		this.custId = custId;
		this.name = name;
		this.type = type;
	}
	/**
	 * @return the custId
	 */
	public int getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(int custId) {
		this.custId = custId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the panDetails
	 */
	public PanDetails getPanDetails() {
		return panDetails;
	}
	/**
	 * @param panDetails the panDetails to set
	 */
	public void setPanDetails(PanDetails panDetails) {
		this.panDetails = panDetails;
	}
	/**
	 * @return the contactdetails
	 */
	public Set<ContactDetails> getContactdetails() {
		return contactdetails;
	}
	/**
	 * @param contactdetails the contactdetails to set
	 */
	public void setContactdetails(Set<ContactDetails> contactdetails) {
		this.contactdetails = contactdetails;
	}
	
	
}
