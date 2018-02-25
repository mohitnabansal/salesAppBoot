package com.sales.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.domain.CustomerInfo;
import com.sales.domain.Inventory;
import com.sales.repository.InventoryRepository;
import com.sales.repository.SalesRepository;

@Service
public class SalesService {

	private static final Logger LOGGER = LoggerFactory.getLogger(SalesService.class);
	@Autowired
	private SalesRepository salesRepo;
	
	@Autowired
	private InventoryRepository inventRepo;
	
	public CustomerInfo saveNewCustomer(CustomerInfo customerInfo) {
		// TODO Auto-generated method stub
		CustomerInfo cust = 	salesRepo.save(customerInfo);
		return cust;
	}
	
	public CustomerInfo findCustomerByPhone(String phoneStr) {
		try {
		Long phone = Long.parseLong(phoneStr);
		CustomerInfo cust = salesRepo.findByCustomerPhone(phone);
		return cust;
		}catch(Exception e) {
			LOGGER.error("Unable to Find Entity for Phone Number"+phoneStr);
			e.printStackTrace();
			return null;
			
		}
	}

	public Inventory findInventoryByBarcode(Long barCodetext) {
		Inventory fromDb = inventRepo.findByProdInfoBarCodeNumber(barCodetext);
		return fromDb;
	}
	
	public Inventory saveNewInventoryItem (Inventory invent) {
		Inventory toDb = inventRepo.save(invent);
		return toDb;
	}
	

}
