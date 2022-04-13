package com.cg.smms.repository;

import com.cg.smms.entities.Item;

import com.cg.smms.entities.OrderDetails;

public interface IOrderRepository {
	
	// Abstract Methods
	
	public OrderDetails addOrder(OrderDetails order);     // Create............... 
	public OrderDetails updateOrder(OrderDetails order);  // Update...............
	public OrderDetails searchOrder(int id);              // Read.................
	public boolean deleteOrder(int id);                   // Delete...............
	public boolean cancelMall(int id); 
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
	 public Item addItem(Item item);
	
	

	
}
