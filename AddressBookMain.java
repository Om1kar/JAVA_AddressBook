package AddressBook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Address Book Program");

        AddressBook obj1 = new AddressBook();


        System.out.println("1.Add new contact");
        System.out.println("2.show contact");
        num = sc.nextInt();
        switch (num) {
            case 1:
                obj1.addNewContacts();
                break;
            case 2:
                obj1.showContacts();
                break;
            default:
                System.out.println("Invalid");
        }

        while (num != 2) ;

    }
}

