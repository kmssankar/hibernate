package org.kms.hibernate.main;

import java.util.List;

import org.kms.entities.Vehicle;
import org.kms.hibernate.impl.VehicleImpl;

public class HibernateSimpleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleImpl vehicleImpl  = new VehicleImpl();
		List<Vehicle> allVeh = vehicleImpl.getallVehicle();
		for(Vehicle veh:allVeh) {
			System.out.println(veh);
		}
	}
}

/*OUTPUT:
Oct 15, 2019 8:16:06 AM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate Core {5.4.1.Final}
Oct 15, 2019 8:16:07 AM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
Oct 15, 2019 8:16:07 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
Oct 15, 2019 8:16:07 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: using driver [com.mysql.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/learnhibernate]
Oct 15, 2019 8:16:07 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {user=root, password=****}
Oct 15, 2019 8:16:07 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
Oct 15, 2019 8:16:07 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
Oct 15, 2019 8:16:08 AM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQLDialect
Oct 15, 2019 8:16:09 AM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
Hibernate: select vehicle0_.vin as vin1_0_, vehicle0_.mdlcd as mdlcd2_0_, vehicle0_.mdldesc as mdldesc3_0_, vehicle0_.mdlyr as mdlyr4_0_ from Vehicle vehicle0_
Vehicle [vin=2TRESED445676, mdlcd=7756, mdlyr=2018, mdldesc=PASSAT HIGHLINE TDI]
Vehicle [vin=5YTERRZS334345, mdlcd=1453, mdlyr=2019, mdldesc=GOLF GT TDI]
 * */