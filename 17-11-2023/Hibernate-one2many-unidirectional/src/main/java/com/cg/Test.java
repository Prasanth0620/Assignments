package com.cg;

import java.util.HashSet;
import java.util.Set;

import com.cg.entity.Cart;

import com.cg.entity.Item;
import com.cg.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Test {

	public static void main(String[] args) {
		
		EntityManager entitymanager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		entitytransaction.begin();
		
			
		Item items1=new Item("Shirt",5);
		Item items2=new Item("Pant",6);
		
		Set<Item> items=new HashSet<Item>();
		items.add(items1);
		items.add(items2);

		
		Cart cart=new Cart();
		cart.setName("My_cart");
		cart.setItems(items);
		
		
		entitymanager.persist(cart);
		entitytransaction.commit();
		entitymanager.close();
	
		
		
		
		
		
		
	}

}
