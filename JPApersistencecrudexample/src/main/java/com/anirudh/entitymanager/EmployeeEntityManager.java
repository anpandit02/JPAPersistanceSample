package com.anirudh.entitymanager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeEntityManager {
	
	private static EmployeeEntityManager employeeEntityManager = new EmployeeEntityManager();
	 
	   private EntityManagerFactory factory;
	   private EntityManager entityManager;
	 
	   private EmployeeEntityManager(){
	      factory =   Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
	      entityManager = factory.createEntityManager();
	   }
	 
	   public EntityManager getEntityManager(){
	      return employeeEntityManager.entityManager;
	   }
	 
	   public void close(){
	      employeeEntityManager.entityManager.close();
	      employeeEntityManager.factory.close();
	   }

}
