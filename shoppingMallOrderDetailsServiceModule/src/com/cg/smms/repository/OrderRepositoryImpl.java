package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.OrderDetails;


public class OrderRepositoryImpl implements IOrderRepository 
{
	
//...............$ Step1: Start JPA LifeCycle $..................................................
	
//...............$ Creating Object Of Entity Manager $..........................................
    private EntityManager entityManager;
    
	
	public OrderRepositoryImpl()
	{
		
		entityManager = JPAUtil.getEntityManager();
	}

//................$ Create operation- Repository $..........................................
	@Override
	public OrderDetails addOrder(OrderDetails order) {
		entityManager.persist(order);
		return order;
	}

//.................$ Update Operation $.......................................................
	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		entityManager.merge(order);
		return order;
	}

//.................$ searching or finding operation $.........................................
	@Override
	public OrderDetails searchOrder(int id) {
		OrderDetails order= entityManager.find(OrderDetails.class, id);
		return order;
	}

//................ .$ Delete operation $.......................................................
	
	@Override
	public boolean deleteOrder(int id) {
		OrderDetails order= entityManager.find(OrderDetails.class, id);
		entityManager.remove(order);
		return false;
		
	}

//................ .$ Commit Transaction $.......................................................

	@Override
	public void commitTransaction()
	{
		entityManager.getTransaction().commit();
	}
	
//................ .$ Begin Transaction $.......................................................

	@Override
	public void beginTransaction()
	{
		entityManager.getTransaction().begin();
	}


	@Override
	public boolean cancelMall(int id) {
		OrderDetails orderdetail= entityManager.find(OrderDetails.class, id);
		entityManager.remove(id);
		return false;
	}

	//................$ Create operation- Repository $..........................................

	@Override
	public Item addItem(Item item) {
		entityManager.persist(item);
		return null;
	}
	
	


}
