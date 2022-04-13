package com.cg.smms.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	//.....$ Creating Object of Entity Manager Factory $..................................
	private static EntityManagerFactory factory;
	
	//.....$ Creating Object of Entity Manager $..........................................
    private static EntityManager entityManager;
	
	static
	{
		factory = Persistence.createEntityManagerFactory("JPA-PU");
		
	}
	
	public static EntityManager getEntityManager()
	{
		if(entityManager==null || !entityManager.isOpen())
		{
			entityManager = factory.createEntityManager();
		}
		
		return entityManager;
		
	}
	
	

}
