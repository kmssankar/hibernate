package org.kms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@Column(name="vin")
	String vin;
	@Column(name="mdlcd")
	int mdlcd;
	@Column(name="mdlyr")
	int mdlyr;
	@Column(name="mdldesc")
	String mdldesc;
	
	/**
	 * 
	 */
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param vin
	 * @param mdlcd
	 * @param mdlyr
	 * @param mdldesc
	 */
	public Vehicle(String vin, int mdlcd, int mdlyr, String mdldesc) {
		super();
		this.vin = vin;
		this.mdlcd = mdlcd;
		this.mdlyr = mdlyr;
		this.mdldesc = mdldesc;
	}
	/**
	 * @return the vin
	 */
	public String getVin() {
		return vin;
	}
	/**
	 * @param vin the vin to set
	 */
	public void setVin(String vin) {
		this.vin = vin;
	}
	/**
	 * @return the mdlcd
	 */
	public int getMdlcd() {
		return mdlcd;
	}
	/**
	 * @param mdlcd the mdlcd to set
	 */
	public void setMdlcd(int mdlcd) {
		this.mdlcd = mdlcd;
	}
	/**
	 * @return the mdlyr
	 */
	public int getMdlyr() {
		return mdlyr;
	}
	/**
	 * @param mdlyr the mdlyr to set
	 */
	public void setMdlyr(int mdlyr) {
		this.mdlyr = mdlyr;
	}
	/**
	 * @return the mdldesc
	 */
	public String getMdldesc() {
		return mdldesc;
	}
	/**
	 * @param mdldesc the mdldesc to set
	 */
	public void setMdldesc(String mdldesc) {
		this.mdldesc = mdldesc;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [vin=" + vin + ", mdlcd=" + mdlcd + ", mdlyr=" + mdlyr + ", mdldesc=" + mdldesc + "]";
	}
}
