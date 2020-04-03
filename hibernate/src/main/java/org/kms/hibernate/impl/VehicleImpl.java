package org.kms.hibernate.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.query.Query;
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
		session.close();
		return vehList;
		
	}
	
	public void getallVehicleusingCriteria(int modelYear) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		//Create CriteriaBuilder instance
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		
		CriteriaQuery<Vehicle> vehicleCriteriaQuery = criteriaBuilder.createQuery(Vehicle.class);
		
		Root<Vehicle> vehicleroot = vehicleCriteriaQuery.from(Vehicle.class);
		vehicleCriteriaQuery.select(vehicleroot).where(criteriaBuilder.equal(vehicleroot.get("mdlyr"),modelYear));
		Query<Vehicle> vehicleQuery=session.createQuery(vehicleCriteriaQuery);
		System.out.println("Criteria Query");
		for(Vehicle vehicle : vehicleQuery.list()) {
			System.out.println(vehicle);
		}
		session.close();
	}

	public Vehicle getVehicle(String vin) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Vehicle vehicle =session.get(Vehicle.class, vin);
		session.close();
		return vehicle;
	}

}
