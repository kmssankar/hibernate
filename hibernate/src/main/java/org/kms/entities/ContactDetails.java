package org.kms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ContactDetails {
	@Id
	int contactId;
	String contactNo;
	String contactType;
    @ManyToOne
    @JoinColumn(name="custId")
	private Customer customer;
	/**
	 * @return the contactId
	 */
    
    
    
    
	public int getContactId() {
		return contactId;
	}
	/**
	 * @param contactId
	 * @param contactNo
	 * @param contactType
	 * @param customer
	 */
	public ContactDetails(int contactId, String contactNo, String contactType, Customer customer) {
		super();
		this.contactId = contactId;
		this.contactNo = contactNo;
		this.contactType = contactType;
		this.customer = customer;
	}
	/**
	 * @param contactId the contactId to set
	 */
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	/**
	 * @return the contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}
	/**
	 * @param contactNo the contactNo to set
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	/**
	 * @return the contactType
	 */
	public String getContactType() {
		return contactType;
	}
	/**
	 * @param contactType the contactType to set
	 */
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
    
    
}
