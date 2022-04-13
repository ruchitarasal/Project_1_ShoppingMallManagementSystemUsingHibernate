package com.cg.smms.service;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.OrderDetails;
import com.cg.smms.repository.OrderRepositoryImpl;
import com.cg.smms.repository.IOrderRepository;


public class OrderServiceImpl implements IOrderService
{
	
//Step 1:Establishing connection between Service and Repository.........
	
	private IOrderRepository dao;
	public OrderServiceImpl() 
	{
		dao=new OrderRepositoryImpl();
	}

//Step 2: Service calls to perform CRUD Operation........................
	
	//......................$ Adding new order $.......................................
	@Override
	public OrderDetails addOrder(OrderDetails order) {
		dao.beginTransaction();
		dao.addOrder(order);
		dao.commitTransaction();
		return order;
		}

	
	//.......................$ Updating the Order $.......................................
	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		dao.beginTransaction();
		dao.updateOrder(order);
		dao.commitTransaction();
		return order;
	   }

	
	// ......................$ Searching the Order $.........................................
	@Override
	public OrderDetails searchOrder(int id) {
		OrderDetails orderdetail=dao.searchOrder(id);
		return orderdetail;
	    }

	
   //.........................$ Deleting the Order $..........................................
	@Override
	public boolean deleteOrder(int id) {
		dao.beginTransaction();
		dao.deleteOrder(id);
		dao.commitTransaction();
		return false;
    	}

	// .......................$ Adding new item $............................................
	@Override
	public Item addItem(Item item) {
		dao.beginTransaction();
		dao.addItem(item);
		dao.commitTransaction();
		return item;
		}


/*	@Override
	public boolean cancelMall(int id) {
		OrderDetails orderdetail=dao.searchOrder(id);
		dao.cancelMall(id);
		return false;
	}
*/
	@Override
	public boolean cancelMall(int id) {
		// TODO Auto-generated method stub
		return false;
	   }


	

}
