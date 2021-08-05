package com.Addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	static Scanner sc = new Scanner(System.in);

	static ArrayList<ContactDetails> personLists = new ArrayList<ContactDetails>();

	public static void addContact() {

		System.out.println("Enter the First name");
		String fn = sc.nextLine();

		System.out.println("Enter the Last name");
		String ln = sc.nextLine();

		System.out.println("Enter your Address");
		String add = sc.nextLine();

		System.out.println("Enter your City name");
		String city = sc.nextLine();

		System.out.println("Enter your State name");
		String state = sc.nextLine();

		System.out.println("Enter the ZIP ");
		long zip = sc.nextLong();

		System.out.println("Enter your Phone Number");
		long ph = sc.nextLong();

		System.out.println("Enter your Mail address");
		String email = sc.nextLine();
		
		ContactDetails newPerson = new ContactDetails(fn, ln, add, city, state, zip, ph, email);
		personLists.add(newPerson);
		System.out.println(personLists);

	}

}
