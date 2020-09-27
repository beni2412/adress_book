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
		
		System.out.println("�pdate Contact:\nEnter name and all details:");
		System.out.println("Enter first name: ");
		String firstName1 = sc.nextLine();
		System.out.println("Enter last name: ");
		String lastName1 = sc.nextLine();
		System.out.println("Enter address: ");
		String address1 = sc.nextLine();
		System.out.println("Enter city: ");
		String city1 = sc.nextLine();
		System.out.println("Enter state: ");
		String state1 = sc.nextLine();
		System.out.println("Enter zip: ");
		long zip1 = sc.nextLong();
		System.out.println("Enter phone number: ");
		sc.nextLine();
		String phoneNumber1 = sc.nextLine();
		System.out.println("Enter email: ");
		String email1 = sc.nextLine();
		
		Contact update = new Contact(firstName1, lastName1, address1, city1, state1, zip1, phoneNumber1, email1);
		String s = ab.updateContact(update);
		System.out.println(s);
		
		List<Contact> cli = new ArrayList<Contact>();
		cli=ab.viewContacts();
		System.out.println("The new Contact in Address Book is: ");
		for(Contact z:cli) {
			System.out.println(z);
		}
		
		
	}

}
