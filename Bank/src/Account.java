public class Account {
    private int accNo;
    private float amount;
    private String name;
    private String password;
    public Account(int a, String n, float am) {
        this.accNo = a;
        this.name = n;
        this.amount = am;
    }
    public Account(int a, String n, float am, String p) {
        this(a,n,am);
        this.password=p;
    }

    public void deposit(float am) {
        this.amount += am;
        System.out.println("Successfully deposited " + am);
    }

    public float checkBalance() {
        return this.amount;
    }

    public void withdraw(float am) {
        if (amount < am) {
            System.out.println("Insufficient balance for withdrawal: " + am);
        } else {
            this.amount -= am;
            System.out.println("Successfully withdrawn: " + am);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", amount=" + amount +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}