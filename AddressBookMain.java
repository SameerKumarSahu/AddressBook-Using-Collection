package com.Addressbook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {

			System.out.println("1.Adding Contact Details" + "\n2.Editing the Contact details" + "\n3.Press 0 for exit");
			int option = sc.nextInt();
			switch (option) {

			case 1:
				AddressBook.addContact();
				break;
			case 2:
				AddressBook.editContact();
				break;
			default:
				flag = false;
				System.out.println("Thank You");
			}

		}
	}

}