public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(2,"John",200000,"2ezfse1337");
        a1.deposit(12000);
        a1.withdraw(2000);
        System.out.println("First account balance: " + a1.checkBalance());
        System.out.println("First account info: " + a1.toString());
    }
}