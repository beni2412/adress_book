package com.capg;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBook ab = new AddressBook();
		int c=5;
		int count =0;
		System.out.println("Welcome to the Address Book");
		do {
			
			System.out.println("Menu \n1.Add a contact \n2.Edit a Contact \n3.Remove a contact \n4.View all contact \n5.Exit");
			c=sc.nextInt();
			switch(c) {
			case 1:
				if(count<1) {
				System.out.println("Enter first name: ");
				sc.nextLine();
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
				count++;
				Contact x = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
				ab.addContact(x);
				break;
				}
				else {
					System.out.println("Can add only one contact");
					break;
				}
				
			case 2:
				System.out.println("Update Contact:\nEnter name and all details:");
				System.out.println("Enter first name: ");
				sc.nextLine();
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
				break;
			case 3:
				System.out.println("Enter first name of contact to remove: ");
				sc.nextLine();
				String fname= sc.nextLine();
				System.out.println("Enter last name of contact to remove: ");
				String lname= sc.nextLine();
				boolean b = ab.removeContact(fname, lname);
				if(b)
					System.out.println("Contact removed");
				else
					System.out.println("Contact not found");
				break;
				
			case 4:
				List<Contact> cl = new ArrayList<Contact>();
				cl=ab.viewContacts();
				System.out.println("The Contact in Address Book is: ");
				for(Contact z:cl) {
					System.out.println(z);
				}
				break;
			
			case 5: break;
				
			}
		
		}while(c!=5);
	}

}
