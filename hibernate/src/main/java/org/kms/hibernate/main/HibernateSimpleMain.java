package org.kms.hibernate.main;

import java.util.List;

import org.kms.entities.Vehicle;
import org.kms.hibernate.impl.VehicleImpl;

public class HibernateSimpleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleImpl vehicleImpl  = new VehicleImpl();
		//Addnew Vehicle
		vehicleImpl.addNewVehicle(new Vehicle("5TI7T4M5E56711", 2234, 2020, "VW Vento"));
		vehicleImpl.addNewVehicle(new Vehicle("52I6T445E56711", 2334, 2014, "WV Jetta"));
		vehicleImpl.addNewVehicle(new Vehicle("5TK7K445E56711", 2374, 2017, "WV Passat"));
		List<Vehicle> allVeh = vehicleImpl.getallVehicle();
		for(Vehicle veh:allVeh) {
			System.out.println(veh);
		}
		System.out.println("Vehicle from DB !! "+vehicleImpl.getVehicle("5TK7T445E56711"));
		
		vehicleImpl.getallVehicleusingCriteria(2014);
	}
}

/*OUTPUT:
Mar 18, 2020 1:20:42 AM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate Core {5.4.1.Final}
Mar 18, 2020 1:20:43 AM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
Mar 18, 2020 1:20:43 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
Mar 18, 2020 1:20:43 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/learnhibernate]
Mar 18, 2020 1:20:43 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {user=root, password=****}
Mar 18, 2020 1:20:43 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
Mar 18, 2020 1:20:43 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
Wed Mar 18 01:20:43 IST 2020 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
Mar 18, 2020 1:20:44 AM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL5InnoDBDialect
Mar 18, 2020 1:20:45 AM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@349d0836] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Mar 18, 2020 1:20:45 AM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
Hibernate: select vehicle0_.vin as vin1_0_0_, vehicle0_.mdlcd as mdlcd2_0_0_, vehicle0_.mdldesc as mdldesc3_0_0_, vehicle0_.mdlyr as mdlyr4_0_0_ from Vehicle vehicle0_ where vehicle0_.vin=?
Hibernate: select vehicle0_.vin as vin1_0_0_, vehicle0_.mdlcd as mdlcd2_0_0_, vehicle0_.mdldesc as mdldesc3_0_0_, vehicle0_.mdlyr as mdlyr4_0_0_ from Vehicle vehicle0_ where vehicle0_.vin=?
Hibernate: select vehicle0_.vin as vin1_0_0_, vehicle0_.mdlcd as mdlcd2_0_0_, vehicle0_.mdldesc as mdldesc3_0_0_, vehicle0_.mdlyr as mdlyr4_0_0_ from Vehicle vehicle0_ where vehicle0_.vin=?
Hibernate: select vehicle0_.vin as vin1_0_, vehicle0_.mdlcd as mdlcd2_0_, vehicle0_.mdldesc as mdldesc3_0_, vehicle0_.mdlyr as mdlyr4_0_ from Vehicle vehicle0_
Vehicle [vin=52I6T445E56711, mdlcd=2334, mdlyr=2014, mdldesc=WV Jetta]
Vehicle [vin=52I7T445E56711, mdlcd=2334, mdlyr=2014, mdldesc=WV Jetta]
Vehicle [vin=53I7T445E56711, mdlcd=2334, mdlyr=2014, mdldesc=SKODA Rapid]
Vehicle [vin=5TI7T445E56711, mdlcd=2234, mdlyr=2020, mdldesc=VW Vento]
Vehicle [vin=5TI7T4M5E56711, mdlcd=2234, mdlyr=2020, mdldesc=VW Vento]
Vehicle [vin=5TK7K445E56711, mdlcd=2374, mdlyr=2017, mdldesc=WV Passat]
Vehicle [vin=5TK7T445E56711, mdlcd=2374, mdlyr=2017, mdldesc=WV Passat]
Hibernate: select vehicle0_.vin as vin1_0_0_, vehicle0_.mdlcd as mdlcd2_0_0_, vehicle0_.mdldesc as mdldesc3_0_0_, vehicle0_.mdlyr as mdlyr4_0_0_ from Vehicle vehicle0_ where vehicle0_.vin=?
Vehicle from DB !! Vehicle [vin=5TK7T445E56711, mdlcd=2374, mdlyr=2017, mdldesc=WV Passat]
Criteria Query
Hibernate: select vehicle0_.vin as vin1_0_, vehicle0_.mdlcd as mdlcd2_0_, vehicle0_.mdldesc as mdldesc3_0_, vehicle0_.mdlyr as mdlyr4_0_ from Vehicle vehicle0_ where vehicle0_.mdlyr=2014
Vehicle [vin=52I6T445E56711, mdlcd=2334, mdlyr=2014, mdldesc=WV Jetta]
Vehicle [vin=52I7T445E56711, mdlcd=2334, mdlyr=2014, mdldesc=WV Jetta]
Vehicle [vin=53I7T445E56711, mdlcd=2334, mdlyr=2014, mdldesc=SKODA Rapid]*/