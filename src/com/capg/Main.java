package com.capg;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 List<AddressBook> book = new ArrayList<AddressBook>();
		 System.out.println("How many address books do you want to make: ");
		 		 int n = sc.nextInt();
		 		 sc.nextLine();
		 for(int i =0;i<n;i++) {
			 
			 System.out.println("Enter name of address book: ");
			 String aname = sc.nextLine();
			 AddressBook ab = new AddressBook(aname);
			 
			 book.add(ab);
			 }
		
		int c=5;
		System.out.println("Welcome to the Address Book");
		do {
			
			System.out.println("Menu \n1.Add a contact \n2.Edit a Contact \n3.Remove a contact \n4.View all contact \n5.Exit");
			c=sc.nextInt();
			switch(c) {
			case 1:
				System.out.println("Enter name of address book: ");
				sc.nextLine();
				String name1 = sc.nextLine();
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
				
				Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
				for(AddressBook x: book) {
					 if(x.bookname.equalsIgnoreCase(name1)) {
						 x.addContact(contact);
					 }
					 else
						 continue;
				}
				break;
				
			case 2:
				System.out.println("Enter name of address book: ");
				sc.nextLine();
				String name2 = sc.nextLine();
				System.out.println("Update Contact:\nEnter name and all details:");
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
				String s = "";
				for(AddressBook x: book) {
					 if(x.bookname.equalsIgnoreCase(name2)) {
						 s = x.updateContact(update);
					 }
					 else
						 continue;
				}
				
				System.out.println(s);
				break;
			case 3:
				System.out.println("Enter name of address book: ");
				sc.nextLine();
				String name3 = sc.nextLine();
				System.out.println("Enter first name of contact to remove: ");
				
				String fname= sc.nextLine();
				System.out.println("Enter last name of contact to remove: ");
				String lname= sc.nextLine();
				boolean b = false;
				for(AddressBook x: book) {
					 if(x.bookname.equalsIgnoreCase(name3)) {
						 b = x.removeContact(fname, lname);
					 }
					 else
						 continue;
				}
				
				if(b)
					System.out.println("Contact removed");
				else
					System.out.println("Contact not found");
				break;
				
			case 4:
				System.out.println("Enter name of address book: ");
				sc.nextLine();
				String name4 = sc.nextLine();
				
				List<Contact> cl = new ArrayList<Contact>();
								
				for(AddressBook x: book) {
					 if(x.bookname.equalsIgnoreCase(name4)) {
						 cl=x.viewContacts();
					 }
					 else
						 continue;
				}
				
				
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