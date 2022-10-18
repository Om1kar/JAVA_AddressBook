package AddressBook;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);

    Contacts obj = new Contacts();

    public void addNewContacts() {

        System.out.println("Creating contact");
        System.out.println("Enter First Name");
        obj.setFirstName(sc.next());
        System.out.println("Enter lst Name");
        obj.setLastName(sc.next());
        System.out.println("Enter Address");
        obj.setAddress(sc.next());
        System.out.println("Enter State");
        obj.setState(sc.next());
        System.out.println("Enter Zip");
        obj.setZip(sc.nextInt());
        System.out.println("Enter Phone no");
        obj.setPhoneNo(sc.nextLong());
        System.out.println("Enter E-mail");
        obj.setEmail(sc.next());

    }

    public void showContacts() {
        System.out.println("Enter First Name" + obj.getFirstName());
        System.out.println("Enter lst Name" + obj.getLastName());
        System.out.println("Enter Address" + obj.getAddress());
        System.out.println("Enter State" + obj.getState());
        System.out.println("Enter Zip" + obj.getZip());
        System.out.println("Enter Phone no" + obj.getPhoneNo());
        System.out.println("Enter E-mail" + obj.getEmail());
    }
}