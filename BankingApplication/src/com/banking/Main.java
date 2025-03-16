package com.banking;

import java.io.IOException;

import com.bank.Bank;
import com.banking.customer.CustomerFileHandeling;

public class Main {

	public static void main(String[] args) {

		CustomerFileHandeling handeler = new CustomerFileHandeling();
		
		try {
			handeler.initilize();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(Bank.customer[0].name);
	}

}
