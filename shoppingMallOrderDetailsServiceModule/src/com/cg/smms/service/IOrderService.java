package com.cg.smms.service;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.OrderDetails;


public interface IOrderService {
	
	// Abstract Methods
	
	public OrderDetails addOrder(OrderDetails order);          // Create............
	public OrderDetails updateOrder(OrderDetails order);       // Update............
	public boolean deleteOrder(int id);                        // Delete............
    public OrderDetails searchOrder(int id);                   // Read..............
	public boolean cancelMall(int id);
	
	
	
	public Item addItem(Item item);                           // Create.............
}
