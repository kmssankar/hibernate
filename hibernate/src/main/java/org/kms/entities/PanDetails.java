package org.kms.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class PanDetails {
	
	@Id
	int panId;
	String panNo;
	String panType;
	String nationality;
	@OneToOne
	@JoinColumn(name="custId")
	private Customer customer;
	
	/**
	 * 
	 */
	public PanDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param panId
	 * @param panNo
	 * @param panType
	 * @param nationality
	 * @param customer
	 */
	public PanDetails(int panId, String panNo, String panType, String nationality) {
		super();
		this.panId = panId;
		this.panNo = panNo;
		this.panType = panType;
		this.nationality = nationality;
	}

	/**
	 * @return the panId
	 */
	public int getPanId() {
		return panId;
	}

	/**
	 * @param panId the panId to set
	 */
	public void setPanId(int panId) {
		this.panId = panId;
	}

	/**
	 * @return the panNo
	 */
	public String getPanNo() {
		return panNo;
	}

	/**
	 * @param panNo the panNo to set
	 */
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	/**
	 * @return the panType
	 */
	public String getPanType() {
		return panType;
	}

	/**
	 * @param panType the panType to set
	 */
	public void setPanType(String panType) {
		this.panType = panType;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
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
