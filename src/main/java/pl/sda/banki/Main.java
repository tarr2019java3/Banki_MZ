package pl.sda.banki;

public class Main {
    public static void konto (User user, BankAcount bank){
        System.out.println("Imię: " + user.getName());
        System.out.println("Nazwisko: " + user.getLastName());
        System.out.println("Wiek: " + user.getAge());
        System.out.println("Nazwa Banku: " + bank.getName());
        System.out.println("Numer konta: " + bank.getAccountNumber());
        System.out.println("Saldo: " + bank.getBalance());
        System.out.println();
    }

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

        Main.konto (user1, bank1);
        Main.konto (user2, bank2);
        Main.konto (user3, bank3);
        Main.konto (user4, bank4);

    }
}