package com.capg;
import java.util.*;
import java.io.*;

public class AddressBook {
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
	 for(Contact x: addressBook) {
		 if(x.firstName.equalsIgnoreCase(a.firstName) && x.lastName.equalsIgnoreCase(a.lastName)) {
		 addressBook.remove(x);
		 addressBook.add(a);
		 y++;
		 }
	 }
	 if(y==0)
		 return "No contact found with this name";
	 else
		 return "Contact Updated";
 }
}
