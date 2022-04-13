package com.cg.smms.repository;

import com.cg.smms.entities.Item;

public interface IItemRepository {
	public Item addItem(Item item);        // Create............... 
	public Item updateItem(Item item);     // Update...............
	public Item searchItem(int id);        // Read.................
	public Item deleteItem(int id);         // Delete...............
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
	
}
