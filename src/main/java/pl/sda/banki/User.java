package pl.sda.banki;

public class User {
    private String name;
    private String lastName;
    private int age;
    private BankAcount bankAcount;

    public BankAcount getBankAcount() {
        return bankAcount;
    }

    public void setBankAcount(BankAcount bankAcount) {
        this.bankAcount = bankAcount;
    }

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    public User(User user1, BankAcount bank1){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
