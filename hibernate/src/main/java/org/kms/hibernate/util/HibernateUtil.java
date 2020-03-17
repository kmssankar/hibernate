package org.kms.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class HibernateUtil {
	
	static StandardServiceRegistry registry =null;
	static SessionFactory sessionfactory=null;
	
	private static void buildSessionFactory(){
        try{
        	registry = new  StandardServiceRegistryBuilder()
                    .configure()
                    .build();
        	MetadataSources sources = new MetadataSources(registry);
        	// Create Metadata
            Metadata metadata = sources.getMetadataBuilder().build();
            // Create SessionFactory
            sessionfactory = metadata.getSessionFactoryBuilder().build();
        }catch (Throwable ex) {
            System.err.println("Session Factory could not be created." + ex);
            throw new ExceptionInInitializerError(ex);
        } 
    }	
	public static SessionFactory getSessionFactory() {
		if (sessionfactory==null) buildSessionFactory();
		return sessionfactory;
	}
	
	public static void shutdown() {
		if (registry != null) {
		      StandardServiceRegistryBuilder.destroy(registry);
		    }
	}

}
