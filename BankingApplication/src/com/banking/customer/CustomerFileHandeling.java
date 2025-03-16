package com.banking.customer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.bank.Bank;

public class CustomerFileHandeling {
	
	private static final String filename = "bank_db.txt";
	
	public void initilize() throws IOException {

		Customer[] customer = new Customer[10];
		
		File file = new File(filename);
		
		try (BufferedReader reader = new BufferedReader( new FileReader(file) )) {
			String customerInfo = reader.readLine();
			int pos = 0;
			do {
				
				customer[pos] = castStringToCustomer(customerInfo);
				pos++;
				customerInfo = reader.readLine();
			} while (customerInfo != null);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		Bank.customer = customer;
	}
	
	private Customer castStringToCustomer(String customerInfo) {
		
		String[] splitInfo = customerInfo.split(" ");
		
		Customer customer = new Customer(Integer.parseInt(splitInfo[0]), splitInfo[2], 
				Double.parseDouble(splitInfo[3]), splitInfo[4], Long.parseLong(splitInfo[1]));
		
		return customer;
	}
	
	
	
	
}
