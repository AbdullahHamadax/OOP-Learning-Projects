public class Main {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(40000, "John", 1000000);
        a1.deposit(12000);
        a1.withdraw(2000);
        System.out.println("First account balance: " + a1.checkBalance());
    }
}