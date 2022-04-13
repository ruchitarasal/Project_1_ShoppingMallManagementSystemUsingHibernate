package com.cg.smms.client;



import com.cg.smms.entities.Item;
import com.cg.smms.entities.OrderDetails;
import com.cg.smms.service.IOrderService;
import com.cg.smms.service.OrderServiceImpl;

public class client {

	public static void main(String[] args) {
		
		
	//CRUD operation calling activity
		OrderDetails order= new OrderDetails();
		IOrderService service= new OrderServiceImpl();
		 Item item=new Item();
    	
	//CRUD operations
       
     // Adding new order into the table
		order.setid(105);
		order.setdateOfPurchase("27-06-2020");
		order.settotal(4);
		order.setPaymentMode("Card");
		service.addOrder(order);
		System.out.println("Order added successfully");
	
/*		
	//Updating the order present in the table
		
		order  =service.searchOrder(100);
		order.setPaymentMode("ONLINEBANKING");
		service.updateOrder(order);
		System.out.println("Order updated successfully");
	*/
	/*	
	//searching the order present in the table
				
		order=service.searchOrder(102);
		System.out.println("ID is: "+order.getid());
		System.out.println("Date of purchase is: "+order.getdateOfPurchase());
		System.out.println("Payment mode is: "+order.getPaymentMode());
	*/	
    
	/*	// Delete Operation
		
		
		service.deleteOrder(104);
		System.out.println("Order deleted successfully");
		*/		
		
		
		/*	
			//CRUD
	       
	
			//adding new item
			item.setId(11);
			item.setItemName("Biscuit");
			item.setPrice(100);
			item.setManufacturingDate("13-12-2021");
			item.setExpiry("01-06-2022");
			item.setCategory("Food");
			service.addItem(item);
			System.out.println("Item added");
			
		*/	

		
	}

}


