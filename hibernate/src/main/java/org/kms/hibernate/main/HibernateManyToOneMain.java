package org.kms.hibernate.main;

import java.util.HashSet;
import java.util.Set;

import org.kms.entities.ContactDetails;
import org.kms.entities.Customer;
import org.kms.entities.PanDetails;
import org.kms.hibernate.impl.HibernateManytoOneImpl;
import org.kms.hibernate.util.HibernateUtil;

public class HibernateManyToOneMain {

	public static void main(String[] args) {
	   
		HibernateManytoOneImpl hibernateManytoOneImpl = new HibernateManytoOneImpl();
		Customer customer =new Customer(12,"Testid","Salary");
		PanDetails panDetails=new PanDetails(1,"PAN001A3","Indivdual","India");
		panDetails.setCustomer(customer);
		Set<ContactDetails> contactSet = new HashSet<ContactDetails>();
		contactSet.add(new ContactDetails(1, "988777", "Mobile", customer));
		contactSet.add(new ContactDetails(2, "01123", "Office", customer));
		hibernateManytoOneImpl.persistManytoOne(customer, contactSet, panDetails);
		HibernateUtil.shutdown();
	}

}

/*
 Apr 03, 2020 7:37:22 AM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate Core {5.4.1.Final}
Apr 03, 2020 7:37:23 AM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
Apr 03, 2020 7:37:23 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
Apr 03, 2020 7:37:23 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/learnhibernate]
Apr 03, 2020 7:37:23 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {user=root, password=****}
Apr 03, 2020 7:37:23 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
Apr 03, 2020 7:37:23 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
Fri Apr 03 07:37:23 IST 2020 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
Apr 03, 2020 7:37:24 AM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL5InnoDBDialect
Apr 03, 2020 7:37:24 AM org.hibernate.tuple.PojoInstantiator <init>
INFO: HHH000182: No default (no-argument) constructor for class: org.kms.entities.ContactDetails (class must be instantiated by Interceptor)
Hibernate: alter table ContactDetails drop foreign key FK27utde570ys7lh0g75197k80v
Apr 03, 2020 7:37:24 AM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@62e6a3ec] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Hibernate: alter table PanDetails drop foreign key FK7117beiyhw2xuojany56ev3q1
Hibernate: drop table if exists ContactDetails
Hibernate: drop table if exists Customer
Hibernate: drop table if exists PanDetails
Hibernate: drop table if exists Vehicle
Hibernate: create table ContactDetails (contactId integer not null, contactNo varchar(255), contactType varchar(255), custId integer, primary key (contactId)) engine=InnoDB
Apr 03, 2020 7:37:27 AM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@3be4f71] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Hibernate: create table Customer (custId integer not null, name varchar(255), type varchar(255), primary key (custId)) engine=InnoDB
Hibernate: create table PanDetails (panId integer not null, nationality varchar(255), panNo varchar(255), panType varchar(255), custId integer, primary key (panId)) engine=InnoDB
Hibernate: create table Vehicle (vin varchar(255) not null, mdlcd integer, mdldesc varchar(255), mdlyr integer, primary key (vin)) engine=InnoDB
Hibernate: alter table ContactDetails add constraint FK27utde570ys7lh0g75197k80v foreign key (custId) references Customer (custId)
Hibernate: alter table PanDetails add constraint FK7117beiyhw2xuojany56ev3q1 foreign key (custId) references Customer (custId)
Apr 03, 2020 7:37:33 AM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
Hibernate: select contactdet_.contactId, contactdet_.contactNo as contactN2_0_, contactdet_.contactType as contactT3_0_, contactdet_.custId as custId4_0_ from ContactDetails contactdet_ where contactdet_.contactId=?
Hibernate: select contactdet_.contactId, contactdet_.contactNo as contactN2_0_, contactdet_.contactType as contactT3_0_, contactdet_.custId as custId4_0_ from ContactDetails contactdet_ where contactdet_.contactId=?
Hibernate: select pandetails_.panId, pandetails_.custId as custId5_2_, pandetails_.nationality as national2_2_, pandetails_.panNo as panNo3_2_, pandetails_.panType as panType4_2_ from PanDetails pandetails_ where pandetails_.panId=?
Hibernate: insert into Customer (name, type, custId) values (?, ?, ?)
Hibernate: insert into ContactDetails (contactNo, contactType, custId, contactId) values (?, ?, ?, ?)
Hibernate: insert into ContactDetails (contactNo, contactType, custId, contactId) values (?, ?, ?, ?)
Hibernate: insert into PanDetails (custId, nationality, panNo, panType, panId) values (?, ?, ?, ?, ?)
Apr 03, 2020 7:37:34 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PoolState stop
INFO: HHH10001008: Cleaning up connection pool [jdbc:mysql://localhost:3306/learnhibernate]

 */
