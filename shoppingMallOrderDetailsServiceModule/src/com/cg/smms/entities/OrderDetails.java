package com.cg.smms.entities;



import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="orderdetails")

public class OrderDetails {
@Id
private int id;
private String dateOfPurchase;
private float total;
//private List<String>customers;
//private enum paymentMode{ CARD , CASH , UPI , ONLINEBANKING};



//private Customer customer;

//private Shop shop;

private String paymentMode;


// ................................$ Getter and Setter $........................................ 
public int getid() {
	return id;
}
public void setid(int id) {
	this.id = id;
}
public String getdateOfPurchase() {
	return dateOfPurchase;
}
public void setdateOfPurchase(String i) {
	this.dateOfPurchase = i;
}
public float gettotal() {
	return total;
}
public void settotal(float total) {
	this.total = total;
}
public String getPaymentMode() {
	return paymentMode;
}
public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}

/*
public List<String> getCustomers() {
	return customers;
}
public void setCustomers(List<String> customers) {
	this.customers = customers;
}



public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer string) {
	this.customer = string;
}


public Shop getShop() {
	return shop;
}
public void setShop(Shop shop) {
	this.shop = shop;
}


*/


}
