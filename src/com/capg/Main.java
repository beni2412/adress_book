package com.capg;
import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBook ab = new AddressBook();
		
		System.out.println("Welcome to Address Book");
		System.out.println("Enter first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter last name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter address: ");
		String address = sc.nextLine();
		System.out.println("Enter city: ");
		String city = sc.nextLine();
		System.out.println("Enter state: ");
		String state = sc.nextLine();
		System.out.println("Enter zip: ");
		long zip = sc.nextLong();
		System.out.println("Enter phone number: ");
		sc.nextLine();
		String phoneNumber = sc.nextLine();
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		
		Contact x = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
		ab.addContact(x);
		
		List<Contact> cl = new ArrayList<Contact>();
		cl=ab.viewContacts();
		System.out.println("The Contact in Address Book is: ");
		for(Contact z:cl) {
			System.out.println(z);
		}
	}

}
