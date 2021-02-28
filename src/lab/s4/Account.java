package lab.s4;

public class Account {
    private final int id;
    private final String name;
    private int balance;
    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public boolean credit(int amount) {
        this.balance += amount;
        if(amount >= 0){
            System.out.println("so dau vao la so duong");
            return true;
        }else {
            System.out.println("so dau vao khong phai la so duong");
            return false;
        }
    }
    public void debit(int amount) {
        if (amount > this.balance) {
            System.out.println("Thanh Toan khong thanh cong");
        } else {
            this.balance -= amount;
        }
    }
    public void tranferTo(Account account, int amount) {
        if (amount > this.balance) {
            System.out.println("Chuyen tien khong thanh cong");
        } else {
            // Tru tien tai khoan chuyen
            this.balance -= amount;
            account.credit(amount);
        }
    }
}
