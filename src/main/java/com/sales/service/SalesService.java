package com.sales.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.domain.CustomerInfo;
import com.sales.domain.ImageStore;
import com.sales.domain.Inventory;
import com.sales.domain.ProductInfo;
import com.sales.repository.ImageStoreRepository;
import com.sales.repository.InventoryRepository;
import com.sales.repository.ProductInfoRespository;
import com.sales.repository.SalesRepository;

/**
 *
 * @author mohit
 *
 */
@Service
public class SalesService {

	private static final Logger LOGGER = LoggerFactory.getLogger(SalesService.class);
	
	@Autowired
	private SalesRepository salesRepo;
	
	@Autowired
	private InventoryRepository inventRepo;
	
	@Autowired
	private ProductInfoRespository prodInfoRepo;
	
	@Autowired
	private ImageStoreRepository imageStoreRepo;
	
	public CustomerInfo saveNewCustomer(CustomerInfo customerInfo) {
		// TODO Auto-generated method stub
		CustomerInfo cust = null;
		try {
			ImageStore img = imageStoreRepo.save(customerInfo.getCustomerImg());
			customerInfo.setCustomerImg(img);
			cust = salesRepo.save(customerInfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		Inventory fromDb = null;
		try {
			fromDb = inventRepo.findByProdInfoBarCodeNumber(barCodetext);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fromDb;
	}
	
	public Inventory saveNewInventoryItem (Inventory invent) {
		Inventory toDb  = null;
		try {
		if(invent.getProdInfo() != null  && invent.getProdInfo().getBarCodeNumber() != null) {
			
			ImageStore image = imageStoreRepo.save(invent.getProdInfo().getProdImg());
			invent.getProdInfo().setProdImg(image);
			ProductInfo prodSaved = prodInfoRepo.save(invent.getProdInfo());
			invent.setProdInfo(prodSaved);
			 toDb = inventRepo.save(invent);
			return toDb;

		}
		}catch(Exception e) {
			e.printStackTrace();
			LOGGER.error("Entity could not be save due to "+e.getMessage());
			return toDb;
		}
		return toDb;
				
	}
	

}
