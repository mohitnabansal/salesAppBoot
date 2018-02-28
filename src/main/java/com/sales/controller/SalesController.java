package com.sales.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sales.domain.CustomerInfo;
import com.sales.domain.Inventory;
import com.sales.service.SalesService;

//@CrossOrigin(origins = "http://192.168.1.4:1801")
//@CrossOrigin(origins = "http://localhost:8100")
@CrossOrigin(origins = "file://")
@RestController
@RequestMapping("/salesApi")
public class SalesController {	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SalesController.class);
@Autowired
private SalesService salesService;

@RequestMapping(value="/saveCustomer",method=RequestMethod.POST)
public CustomerInfo saveCustomerInfo(@RequestBody CustomerInfo customerInfo) {
	
	CustomerInfo cust = salesService.saveNewCustomer(customerInfo);
	return cust;
	
}


/*@RequestMapping(value="/getTestRequest",method=RequestMethod.GET)
public String getRequestm() {
	
	//CustomerInfo cust = salesService.saveNewCustomer(customerInfo);
	return "Hello World";
	
}*/

@RequestMapping(value="/checkIfCustomerExistByPhone",method=RequestMethod.GET)
public CustomerInfo getCustomerByPhone(@RequestParam(value="phoneNo",required=true) String phoneNo) {
	CustomerInfo cust = salesService.findCustomerByPhone(phoneNo);	
	if(cust == null) {
	cust = new CustomerInfo();
	}
	return cust;
}

@RequestMapping(value="/getProductInfoByBarCode",method=RequestMethod.GET)
public Inventory getProductByBarCode(@RequestParam(value="barCode",required=true) String barcodeNumber) {
	Inventory inv = salesService.findInventoryByBarcode(Long.parseLong(barcodeNumber));
	if(inv==null) {
		inv = new Inventory();
	}
	return inv;
}

@RequestMapping(value="/saveInventory",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
public Inventory saveInventory(@RequestBody Inventory inventory) {
	Inventory inv = salesService.saveNewInventoryItem(inventory);
	return inv;
}

}
