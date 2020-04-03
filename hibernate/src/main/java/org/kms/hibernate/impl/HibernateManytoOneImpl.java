package org.kms.hibernate.impl;

import java.util.Set;

import org.hibernate.Session;
import org.kms.entities.ContactDetails;
import org.kms.entities.Customer;
import org.kms.entities.PanDetails;
import org.kms.hibernate.util.HibernateUtil;

public class HibernateManytoOneImpl {
	
	public void persistManytoOne(Customer customer,Set<ContactDetails> contactDetails , PanDetails pandetail) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		customer.setPanDetails(pandetail);
		customer.setContactdetails(contactDetails);
		session.save(customer);
		session.getTransaction().commit();
		session.close();
	}

}
