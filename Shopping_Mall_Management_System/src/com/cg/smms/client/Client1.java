package com.cg.smms.client;

import java.time.LocalDate;

import com.cg.smms.entities.Customer;
import com.cg.smms.entities.Employee;
import com.cg.smms.entities.Item;
import com.cg.smms.entities.Mall;
import com.cg.smms.entities.MallAdmin;
import com.cg.smms.entities.OrderDetails;
import com.cg.smms.entities.Shop;
import com.cg.smms.entities.ShopOwner;
import com.cg.smms.entities.User;
import com.cg.smms.repository.CustomerRepositoryImpl;
import com.cg.smms.repository.ItemRepositoryImpl;
import com.cg.smms.repository.MallAdminRepositoryImpl;
import com.cg.smms.repository.MallRepositoryImpl;
import com.cg.smms.repository.OrderRepositoryImpl;
import com.cg.smms.repository.ShopOwnerRepositoryImpl;
import com.cg.smms.repository.ShopRepositoryImpl;
import com.cg.smms.repository.UserRepositoryImpl;
import com.cg.smms.service.CustomerServiceImpl;
import com.cg.smms.service.EmployeeServiceImpl;
import com.cg.smms.service.OrderServiceImpl;
import com.cg.smms.service.ShopServiceImpl;
import com.cg.smms.service.UserServiceImpl;

public class Client1 {

	public static void main(String[] args) {
		
		
//..........................................$ Customer CRUD operation $..............................................................
		
		CustomerRepositoryImpl cri = new CustomerRepositoryImpl();
		Customer cu=new Customer();
	
		cri.beginTransaction();
		cri.searchCustomer(2);
		//cri.deleteCustomer(6);
		
		cri.commitTransaction();
		
//	...................................$ Employee CRUD operation $............................................................
		
/*		EmployeeServiceImpl esi = new EmployeeServiceImpl();
	    esi.searchEmployee(1);
		esi.deleteEmployee(1);
	*/
		
//	...................................$ Item CRUD operation $...................................................................
		
/*		OrderServiceImpl osi = new OrderServiceImpl();
		ItemRepositoryImpl iri = new ItemRepositoryImpl();
		iri.beginTransaction();
		iri.searchItem(1);
		iri.deleteItem(2);
		iri.commitTransaction();
*/	
//	...................................$ Mall CRUD operations $...................................................................
		
/*		MallRepositoryImpl mri = new MallRepositoryImpl();
		mri.beginTransaction();
		mri.searchMall(1);
		mri.commitTransaction();
*/
		
//	..................................$ MallAdmin CRUD operation $...................................................................
		
/*		MallAdminRepositoryImpl mar = new MallAdminRepositoryImpl();
       MallAdmin ma =new MallAdmin();
        ma.setId(1);
        ma.setName("Ramesh");
        ma.setPassword("Praju123");
        ma.setPhone("9876546543");
       
		mar.beginTransaction();
		mar.updateMallAdmin(ma);
		mar.searchMallAdmin(1);
		mar.deleteMallAdmin(4);
		mar.commitTransaction();
		System.out.println("Deleted");	
*/
		
//	.....................................$ OrderDetails CRUD operation $...............................................................
		
/*		OrderRepositoryImpl ori = new OrderRepositoryImpl();
        ori.beginTransaction();
		ori.searchOrderDetails(1);
		ori.deleteOrderDetails(1);
		ori.commitTransaction();
*/		
//	....................................$ Shop CRUD operations $.......................................................................
		
/*		ShopRepositoryImpl sri = new ShopRepositoryImpl();
        sri.beginTransaction();
		sri.SearchShopById(1);
		sri.deleteShop(1);
		sri.commitTransaction();
	*/	
// .....................................$ ShopOwner CRUD operation $................................................................
		
/*		ShopOwnerRepositoryImpl sori = new ShopOwnerRepositoryImpl();
        sori.beginTransaction();
	    sori.searchShopOwner(1);
	    sori.deleteShopOwner(1);
		sori.commitTransaction();
*/		
//	............................................   User CRUD operation ............................
		
/*	UserRepositoryImpl uri = new UserRepositoryImpl();
		
		uri.beginTransaction();
		uri.deleteNewUser(1);
		uri.commitTransaction();
		
	*/	
		
		
//		--------------------------------- SHOPPING MALL MANAGEMENT SYSTEM  ------------------------------------------------	
		
//   	....................  Association ..................................................
		
//		AdminServiceImpl asi = new AdminServiceImpl();
		CustomerServiceImpl csi = new CustomerServiceImpl();
		EmployeeServiceImpl esi = new EmployeeServiceImpl();
//		OrderServiceImpl osi = new OrderServiceImpl();
//		ShopServiceImpl ssi = new ShopServiceImpl();
		UserServiceImpl usi = new UserServiceImpl();
		
		
		
		
		
//		----------------------------------------   CREATION OF A MALL   ---------------------------------------------

/*	MallRepositoryImpl mallrepo = new MallRepositoryImpl();
//		
		mallrepo.beginTransaction();
//		
		User user = new User();
		MallAdmin ma = new MallAdmin();
		Mall mall = new Mall();
		
////        Adding user details
		user.setName("Jay");
		user.setPassword("jay101");
		user.setType("Mall Admin");
//	
////    Adding MallAdmin details
		ma.setName(user.getName());
		ma.setPassword(user.getPassword());
		ma.setPhone("8956321475");
		ma.setUser(user);
//		
////    Adding Mall details
		mall.setMallName("Rcity2");
		mall.setCategories("Food");
     	mall.setLocation("Mumbai");
		mall.setMallAdmin(ma);
//
//		----------------------------------------   CREATION OF A MALL ADMIN   ---------------------------------------------
		
		mallrepo.addMall(mall);                                  
		System.out.println("New Mall is Added !!");		
		mallrepo.commitTransaction();
	*/	
//		-------------------------------------------  CREATION OF SHOPS AND SHOP OWNERS ------------------------------------------------
		

		
/*		User user = new User();
		ShopOwner so = new ShopOwner();
		Shop shop = new Shop();
		ShopServiceImpl ssi = new ShopServiceImpl();
		ShopOwnerRepositoryImpl soi = new ShopOwnerRepositoryImpl();
		MallRepositoryImpl mri = new MallRepositoryImpl();
		LocalDate date = LocalDate.of(2000, 10, 1);
////		
		soi.beginTransaction();
////		
////		Adding user details
		user.setName("Pratik");
		user.setPassword("Pratik11");
		user.setType("Shop Owner");
//		
////		Adding mall details
		Mall mall = mri.searchMall(2);                          //  getting the mall information with (id)
		shop.setShopName("shoppersstop");
		shop.setShopCategory("cloths");
		shop.setShopStatus("Open");
		shop.setLeaseStatus("Paid");
		shop.setMall(mall);
//		
////		Adding Shop Owner details
		so.setName("Pratik");
		so.setDob(date);
		so.setAddress("Mumbai");
		so.setUser(user);
		so.setShop(shop);
	
		soi.addShopOwner(so);                                   //  Adding Shop with Shop Owner details
		System.out.println("New shop is Added !!");		
		soi.commitTransaction();
*/		
//		***  Search Shop ***
		
//		ssi.searchShopById(5);                                   //  Searching Shop with Id
//		System.out.println("done !!");
				
		
//		----------------------------------------------  ADDING EMPLOYEES  -----------------------------------------------------------
		//EmployeeServiceImpl esi = new EmployeeServiceImpl();
/*		ShopServiceImpl ssi = new ShopServiceImpl();
		LocalDate date = LocalDate.now();
//		
////		employee details (1)
		Employee emp1 = new Employee();
		emp1.setName("Suresh1");
		emp1.setDate(date);
		emp1.setAddress("Mumbai");
		emp1.setDesignation("Manager");
		emp1.setSalary(10000);
		
//		employee details (2)
		Employee emp2 = new Employee();
		emp2.setName("Rahul1");
		emp2.setDate(date);
		emp2.setAddress("Mumbai");
		emp2.setDesignation("Salesman");
		emp2.setSalary(4000);
		
		Shop shop = ssi.searchShopById(1);                   //   adding employees
		shop.addEmployee(emp1);
		shop.addEmployee(emp2);
		
		ssi.updateShop(shop);								 //  Updating shop
		System.out.println("Employees added Successfully");
*/		
//		----------------------------------------------  ADDING ITEMS  -----------------------------------------------------------
		
/*		ShopServiceImpl ssi = new ShopServiceImpl();
		ItemRepositoryImpl iri = new ItemRepositoryImpl();
		
	//	Item details (1)
		Item item = new Item();
		item.setCategory("New");
		item.setManufacturing(LocalDate.of(2022, 01, 01));
		item.setExpiry(LocalDate.of(2032, 01, 01));
		item.setName("Washing Machine");
		item.setPrice(20000);
		
	//	Item details (2)
		Item item1 = new Item();
		item1.setCategory("New");
		item1.setManufacturing(LocalDate.of(2022, 01, 01));
		item1.setExpiry(LocalDate.of(2032, 01, 01));
		item1.setName("Television");
		item1.setPrice(30000);
		
		Shop shop = ssi.searchShopById(1);                            //  adding items
		shop.addItems(item);
		shop.addItems(item1);
		
		ssi.addShop(shop);
		
//		Item item = iri.searchItem(4);	                              //  Update item
//		item.setCategory("New");
//		item.setShop(shop);
//		iri.beginTransaction();
//		iri.updateItem(item);
//		iri.commitTransaction();
		
//		ssi.updateShop(shop);                                          //  Updating shop
		System.out.println("Items added Successfully");
*/
//		-----------------------------------------------  ADDING CUSTOMER DETAILS  ---------------------------------------------------------
		
//		CustomerRepositoryImpl cri = new CustomerRepositoryImpl();
		
//		ShopServiceImpl ssi = new ShopServiceImpl();
 //   	Shop shop = ssi.searchShopById(1);                            
//		
////		Adding user details
/*		User user = new User();
		user.setName("Ram");
		user.setPassword("Ram1");
		user.setType("Customer");
		
////		Adding customer details
		Customer cust = new Customer();
		cust.setName("Ram");
		cust.setEmail("Ram@gmail.com");
		cust.setPhone("8843543219");
		cust.setUser(user);
		cust.setShop(shop);
		
		cri.beginTransaction();
		cri.addCustomer(cust);                                        //  Creating customer
		cri.commitTransaction();
		System.out.println("Customer added Successfully");	
		
*/
		

	
		

	

//		---------------------------------------------- CUSTOMER SERVICES   -----------------------------------------------------
		
	//	CustomerServiceImpl csi = new CustomerServiceImpl();
//	CustomerRepositoryImpl cri = new CustomerRepositoryImpl();	
//		ItemRepositoryImpl iri = new ItemRepositoryImpl();
	//	LocalDate date = LocalDate.now();
	//	OrderServiceImpl osi = new OrderServiceImpl();
		
//		iri.searchItemslist("W");                              

////		Customer Login
		
/*		User user = new User();
		user.setId(1);
		user.setPassword("Ruchita");
		user=csi.login(user);
		Customer customer = user.getCustomer();
//		
//		if(customer==null)
//		{
//			System.out.println("Try Again !!!");
//		}else 
//		{
			Item item = iri.searchItem(1);	                    
			System.out.println("done !!");
			
			item.getName();
			float t =item.getPrice();
			Shop shop = item.getShop();
//			
			OrderDetails od = new OrderDetails();
			od.setDateOfPurchase(date);
			od.setTotal(t);
			od.setPaymentMode("Cash on Delivery");
			od.setShop(shop);
			od.setCustomer(customer);
			osi.addOrder(od);                                       // adding Order
			System.out.println("\nOrder Placed.....");
	*/	
		
//		Cancel Order ----------------------------------------
		
//      osi.cancelOrder(1);                                         
		
//		Update Order ----------------------------------------
		
//		OrderDetails od = osi.searchOrder(2);
//		od.setPaymentMode("UPI Transaction");
//		osi.updateOrder(od);
		

		
System.out.println("Done");	
	
}
}

	


