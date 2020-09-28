package com.capg;
import java.util.*;


public class AddressBook {
	public String bookname;
 private List<Contact> addressBook = new ArrayList<Contact>();
 
 public void setAddressBook(List<Contact> m) {
	 this.addressBook= m;
 }
 public List<Contact> getAddressBook(){
	 return this.addressBook;
 }
 public void addContact(Contact contactObj) {
	 addressBook.add(contactObj);
 }
 public List<Contact> viewContacts() {
	 return addressBook;
 }
 public String updateContact(Contact a) {
	 int y=0;
	 Contact b = new Contact("", "", "", "", "", 0, "", "");
	 Contact c = new Contact("", "", "", "", "", 0, "", "");
	
	 for(Contact x: addressBook) {
		 if(x.firstName.equalsIgnoreCase(a.firstName) && x.lastName.equalsIgnoreCase(a.lastName)) {
			 c=x;
		 b=a;
		 y++;
		 }
	 }
	 if(y==0)
		 return "No contact found with this name";
	 else {
		 addressBook.remove(c);
		 addressBook.add(b);
		 return "Contact Updated";
	 }
		
 }
 public boolean removeContact(String firstName, String lastName) {
	 Contact a=new Contact("","","", "", "", 0,"", "");
	 for(Contact x:addressBook) {
		 if(x.firstName.equalsIgnoreCase(firstName) && x.lastName.equalsIgnoreCase(lastName)) {
			 a=x;
		 }
	 }
	 return addressBook.remove(a);
 }
}
