import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter account no: ");
        int accNo = in.nextInt();
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.print("Enter initial amount: ");
        float initialAmount = in.nextFloat();
        System.out.print("Enter your password: ");
        String password = in.next();
        Account userAccount = new Account(accNo, name, initialAmount, password);
        System.out.println("First account balance: $" + userAccount.checkBalance());
        System.out.println("First account info: " + userAccount.toString());
        while(true){
            System.out.println("---------------------------------------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Info");
            System.out.println("5. Exit");
            System.out.println("---------------------------------------");
            System.out.println("Enter choice:");
            int choice= in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter amount to deposit:");
                    float am=in.nextFloat();
                    userAccount.deposit(am);
                    continue;
                case 2:
                    System.out.println("Enter amount to Withdraw:");
                    float wam=in.nextFloat();
                    userAccount.withdraw(wam);
                    continue;
                case 3:
                    System.out.println("Current balance:" + userAccount.checkBalance());
                    continue;
                case 4:
                    System.out.println(userAccount.toString());
                    continue;
                case 5:
                    System.out.println("Exiting the program.");
                    in.close();
                    System.exit(0);
                default:
                    System.out.println("INVALID CHOICE! Please enter a correct choice");
            }
        }
    }
}