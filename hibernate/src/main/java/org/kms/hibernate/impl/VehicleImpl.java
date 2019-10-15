package org.kms.hibernate.impl;

import java.util.List;

import org.hibernate.Session;
import org.kms.entities.Vehicle;
import org.kms.hibernate.util.HibernateUtil;
public class VehicleImpl {

	public List<Vehicle> getallVehicle() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Vehicle> vehList =session.createQuery("FROM Vehicle s").list();
		return vehList;
	}

}
