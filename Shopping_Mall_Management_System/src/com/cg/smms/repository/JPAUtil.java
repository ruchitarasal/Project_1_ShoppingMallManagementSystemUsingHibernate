package com.cg.smms.repository;

import javax.persistence.*;

public class JPAUtil {

	//.....$ Creating Object of Entity Manager Factory $..................................
	public static EntityManagerFactory factory;
	
	//.....$ Creating Object of Entity Manager $..........................................
	public static EntityManager entityManager;
	
	static {
		factory = Persistence.createEntityManagerFactory("JPA-SMMS");
	}
	
	public static EntityManager getEntityManager() {
		
		if(entityManager == null || !entityManager.isOpen())
		{
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
}
