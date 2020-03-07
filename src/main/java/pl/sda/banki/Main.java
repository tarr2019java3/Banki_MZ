package pl.sda.banki;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //public static void konto (User user, BankAcount bank){
    //  System.out.println("Imię: " + user.getName());
    //System.out.println("Nazwisko: " + user.getLastName());
    //System.out.println("Wiek: " + user.getAge());
    // System.out.println("Nazwa Banku: " + bank.getName());
    // System.out.println("Numer konta: " + bank.getAccountNumber());
    // System.out.println("Saldo: " + bank.getBalance());
    // System.out.println();


    public static void main(String[] args) {
        // write your code here
        User user1 = new User ("Jan", "Kowalski", 44);
        User user2 = new User ("Marcin", "Nowak", 66);
        User user3 = new User ("Katarzyna", "Dobroń", 33);
        User user4 = new User ("Ola", "Lewandowska", 33);

        BankAcount bank1 = new BankAcount (1, "BankDlaBogatych", 55555, 6555);
        BankAcount bank2 = new BankAcount (2, "BankNowoczesny", 4444, 6532455);
        BankAcount bank3 = new BankAcount (3, "Bank", 3333, 234234);
        BankAcount bank4 = new BankAcount (4, "BigBank", 2222, 2342);

        //Main.konto (user1, bank1);
        //Main.konto (user2, bank2);
        //Main.konto (user3, bank3);
        //Main.konto (user4, bank4);
        user1.setBankAcount (bank1);
        user2.setBankAcount (bank2);
        user3.setBankAcount (bank3);
        user4.setBankAcount (bank4);

        System.out.println (user1.getName () + ", " + user1.getLastName () + ", " + user1.getBankAcount ().getBalance () );
        System.out.println (user2.getName () + ", " + user2.getLastName () + ", " + user2.getBankAcount ().getBalance () );
        System.out.println (user3.getName () + ", " + user3.getLastName () + ", " + user3.getBankAcount ().getBalance () );
        System.out.println (user4.getName () + ", " + user4.getLastName () + ", " + user4.getBankAcount ().getBalance () );

        List<User> users = new ArrayList<User> ();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        ObjectMapper Object = new ObjectMapper ();
        try {
            Object.writeValue (new File ("lista.json"), users);

        } catch (IOException e) {
            e.printStackTrace ( );
        }


    }
}