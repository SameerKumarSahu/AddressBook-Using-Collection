package com.Addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, ArrayList<ContactDetails>> addressBook = new HashMap<String, ArrayList<ContactDetails>>();

		while (true) {
			System.out.println(
					"1.To Create new Address book\n2.To edit address books\n3.To view all the address books names.\n4.Exit");
			int op = scanner.nextInt();

			if (op == 1) {
				ArrayList<ContactDetails> personArrayList = new ArrayList<ContactDetails>();
				System.out.println("Enter the AddressBook Name : ");
				String addressBookName = scanner.next();
				// validating to add new address book
				if (!addressBook.containsKey(addressBookName)) {
					boolean flag = true;
					while (flag) {
						ContactDetails person = new ContactDetails();
						System.out
								.println("1.Add contact in " + addressBookName + "\n2.To Exit from " + addressBookName);
						int choice = scanner.nextInt();
						switch (choice) {
						case 1:
							boolean duplicate=duplicateCheck(personArrayList);
							System.out.println(duplicate);
							if (duplicate) {
							personArrayList = addContact(person, personArrayList);
							addressBook.put(addressBookName, personArrayList);
							
							System.out.println("Added person info in " + addressBookName + " successfully.");
							}
							break;
						default:
							flag = false;
							System.out.println("Exit from " + addressBookName + " address book.");
						}
					}
				} else {
					System.out.println(addressBookName + " address book already present.");
				}
				System.out.println("");
			}

			// Edit the existed address book
			else if (op == 2) {
				ArrayList<ContactDetails> personArrayList = new ArrayList<ContactDetails>();
				System.out.println("Enter a address book name : ");
				String companyName = scanner.next();
				try {
					if (addressBook.containsKey(companyName)) {
						personArrayList = (ArrayList<ContactDetails>) addressBook.get(companyName);
						boolean flag = true;
						while (flag) {
							ContactDetails person = new ContactDetails();
							System.out.println(
									"Press 1 to Add contact in " + companyName + "\nPress 2 to Edit Contact from "
											+ companyName + "\nPress 3 to Delete contact from " + companyName
											+ "\nPress 4 to View contact from " + companyName + "\nPress 5 to Exit "
											+ companyName);
							int choice = scanner.nextInt();
							switch (choice) {
							case 1:
								// duplicateCheck(personArrayList);
								personArrayList = addContact(person, personArrayList);
								break;
							case 2:
								personArrayList = editContact(person, personArrayList);
								break;
							case 3:
								personArrayList = deleteContact(person, personArrayList);
								break;
							case 4:
								viewContact(personArrayList);
								break;
							default:
								flag = false;
								addressBook.put(companyName, personArrayList);
								System.out.println("Exit ");
							}
						}
						// adding contact list to the dictionary (Address book)
						addressBook.put(companyName, personArrayList);
						break;
					} else {
						System.out.println("No such address book");
					}
				} catch (Exception e) {
					System.out.println("No such address book");
					break;
				}

			}

			// shows address book names
			else if (op == 3) {
				if (!addressBook.isEmpty()) {
					System.out.println("Address book names : ");
					for (String key : addressBook.keySet()) {
						System.out.print(key);
					}
					System.out.println();
				} else {
					System.out.println("Address book is empty.");
				}
			}

			// exit
			else {
				break;
			}
		}
	}

	// adding person info to the address book
	public static ArrayList<ContactDetails> addContact(ContactDetails person,
			ArrayList<ContactDetails> personArrayList) {

		System.out.print("Enter first name: ");
		String firstName = scanner.next();
		person.setFirstName(firstName);

		System.out.print("Enter last name: ");
		String lastName = scanner.next();
		person.setLastName(lastName);

		System.out.print("Enter address: ");
		String address = scanner.next();
		person.setAddress(address);

		System.out.print("Enter city: ");
		String city = scanner.next();
		person.setCity(city);

		System.out.print("Enter state: ");
		String state = scanner.next();
		person.setState(state);

		System.out.print("Enter zip: ");
		long zip = scanner.nextLong();
		person.setZip(zip);

		System.out.print("Enter phone no: ");
		long phNumber = scanner.nextLong();
		person.setPhoneNum(phNumber);

		System.out.print("Enter email: ");
		String email = scanner.next();
		person.setEmail(email);

		personArrayList.add(person);
		return personArrayList;
	}

	// edit the person info from address book
	public static ArrayList<ContactDetails> editContact(ContactDetails person,
			ArrayList<ContactDetails> personArrayList) {

		System.out.print("Enter a first name: ");
		String firstName = scanner.next();
		System.out.print("Enter a last name: ");
		String lastName = scanner.next();
		for (int i = 0; i < personArrayList.size(); i++) {
			if (personArrayList.get(i).getFirstName().equals(firstName)
					&& personArrayList.get(i).getLastName().equals(lastName)) {
				System.out.print("Enter address: ");
				String address = scanner.next();
				personArrayList.get(i).setAddress(address);

				System.out.print("Enter city: ");
				String city = scanner.next();
				personArrayList.get(i).setCity(city);

				System.out.print("Enter state: ");
				String state = scanner.next();
				personArrayList.get(i).setState(state);

				System.out.print("Enter zip: ");
				long zip = scanner.nextLong();
				personArrayList.get(i).setZip(zip);

				System.out.print("Enter phone no: ");
				long phNumber = scanner.nextLong();
				personArrayList.get(i).setPhoneNum(phNumber);

				System.out.print("Enter email: ");
				String email = scanner.next();
				personArrayList.get(i).setEmail(email);

				return personArrayList;
			}
		}
		return personArrayList;
	}

	// deleting the person info from address book
	public static ArrayList<ContactDetails> deleteContact(ContactDetails person,
			ArrayList<ContactDetails> personArrayList) {
		System.out.print("Enter a first name: ");
		String firstName = scanner.next();
		System.out.print("Enter a last name: ");
		String lastName = scanner.next();
		for (int i = 0; i < personArrayList.size(); i++) {
			if (personArrayList.get(i).getFirstName().equals(firstName)
					&& personArrayList.get(i).getLastName().equals(lastName)) {
				personArrayList.remove(i);
			}
			return personArrayList;
		}
		return personArrayList;
	}

	// 'viewContact()' will show all the persons information inside address book
	public static void viewContact(ArrayList<ContactDetails> personArrayList) {
		for (ContactDetails c : personArrayList) {
			System.out.println(c.getFirstName() + " " + c.getLastName() + " " + c.getAddress() + " " + c.getCity() + " "
					+ c.getState() + " " + c.getZip() + " " + c.getPhoneNum() + " " + c.getEmail());
		}
	}

	public static boolean duplicateCheck(ArrayList<ContactDetails> personArrayList) {
		boolean flag = true;
//		while (flag) {
		System.out.println("Enter the first name");
		String conformname = scanner.next();
		for (int i = 0; i < personArrayList.size(); i++) {
			ContactDetails c = personArrayList.get(i);
			if (c.getFirstName().equals(conformname)) {
				System.out.println("This Person is Already Present");
				flag= true;
			} else {
				System.out.println("You can Add this Person");
				flag= false;
				//addContact(c, personArrayList);
//					flag = false;

			}
		}
		return flag;
	}
}