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
 
}
