package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Employee_DAO {
	
	public static void main(String[] args) {
		Employee_DAO.insert_data();
	}
	
	public static void insert_data() {
		try {
			SessionFactory sessionFactory=new Configuration().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			Employees obj= new Employees();
			
			obj.setEmployeename("employee_one");
			obj.setMobil_no("12334433");
			
			session.save(obj);
			
			session.close();
			sessionFactory.close();
			
		}
		catch(Exception e) {
			
		}
	}

}
