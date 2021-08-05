package com.Addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	static Scanner sc = new Scanner(System.in);

	static ArrayList<ContactDetails> personLists = new ArrayList<ContactDetails>();
	//Adding a new contact details
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
	//Edit the contact details
	public static void editContact() {
		System.out.println("Confirm your first name to edit details: ");
		String confirm_name = sc.next();

		for (int i = 0; i < personLists.size(); i++) {
			if (personLists.get(i).getFirstName().equals(confirm_name)) {
				System.out.println("Select form below to change: ");
				System.out.println(
						"\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Mobile number\n8.Email");

				int option = sc.nextInt();

				switch (option) {
				case 1:
					System.out.println("Enter new First Name: ");
					
					personLists.get(i).setFirstName(sc.next());
					break;
				case 2:
					System.out.println("Enter new Last name");
					personLists.get(i).setLastName(sc.next());
					break;
				case 3:
					System.out.println("Enter new Address");
					personLists.get(i).setAddress(sc.next());
					break;
				case 4:
					System.out.println("Enter new City");
					personLists.get(i).setCity(sc.next());
					break;
				case 5:
					System.out.println("Enter new State");
					personLists.get(i).setState(sc.next());
					break;
				case 6:
					System.out.println("Enter new Zip");
					personLists.get(i).setZip(sc.nextLong());
					break;
				case 7:
					System.out.println("Enter new Mobile number");
					personLists.get(i).setPhoneNum(sc.nextLong());
					break;
				case 8:
					System.out.println("Enter new E-mail");
					personLists.get(i).setEmail(sc.next());
					break;
				}
				System.out.println("Contact details Edit sucessufully..: ");
				System.out.println(personLists);

			} else
				System.out.println("Enter valid First name");
		}
	}

}
