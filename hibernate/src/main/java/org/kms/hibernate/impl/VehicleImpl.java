package org.kms.hibernate.impl;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.kms.entities.Vehicle;
import org.kms.hibernate.util.HibernateUtil;

public class VehicleImpl {

	public void addNewVehicle(Vehicle vehicle) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		Vehicle vehicle_persist = session.get(Vehicle.class, vehicle.getVin()) == null ? vehicle
				: session.get(Vehicle.class, vehicle.getVin());
		if (vehicle_persist != vehicle){
				vehicle_persist.setMdlcd(vehicle.getMdlcd());
				vehicle_persist.setMdlyr(vehicle.getMdlyr());
				vehicle_persist.setMdldesc(vehicle.getMdldesc());
			}
		session.persist(vehicle_persist);
		session.getTransaction().commit();
		session.close();
	}

	public List<Vehicle> getallVehicle() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Vehicle> vehList = session.createQuery("FROM Vehicle s").list();
		return vehList;
		
	}

	public Vehicle getVehicle(String vin) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return session.get(Vehicle.class, vin);
	}

}
