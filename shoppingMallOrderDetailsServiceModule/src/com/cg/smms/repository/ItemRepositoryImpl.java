package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.OrderDetails;

public class ItemRepositoryImpl implements IItemRepository
{

//...............$ Step1: Start JPA LifeCycle $..................................................
	
//...............$ Creating Object Of Entity Manager $..........................................
private EntityManager entityManager;


public ItemRepositoryImpl()
{
	entityManager = JPAUtil.getEntityManager();
}

//................$ Create operation- Repository $..........................................


@Override
public Item addItem(Item item) {
	entityManager.persist(item);
	return item;
}

//.................$ Update Operation $.......................................................


@Override
public Item updateItem(Item item) {
	entityManager.merge(item);
	return item;
}


//.................$ searching or finding operation $.........................................

@Override
public Item searchItem(int id) {
	Item item= entityManager.find(Item.class, id);
	return item;
}


//................ .$ Delete operation $.......................................................

@Override
public Item deleteItem(int id) {
	Item item= entityManager.find(Item.class, id);
	entityManager.remove(item);
	return item;

	
}


//................ .$ Begin Transaction $.......................................................

@Override
public void beginTransaction() {
	
	entityManager.getTransaction().begin();
}


//................ .$ Commit Transaction $.......................................................

@Override
public void commitTransaction() {
	entityManager.getTransaction().commit();
	
}
}
