public class BankAccountTester {
    public static void main(String[] args) {
       BankAccount jacksAccount = new BankAccount(0.0);
       BankAccount jillsAccount = new BankAccount(500.0);

       jacksAccount.deposit(200.0, 0);
       jillsAccount.withdraw(200.0);
       jacksAccount.withdraw(300.0);

       System.out.println("Jack's final balance: " + jacksAccount.getBalance());
       System.out.println("Jill's final balance: " + jillsAccount.getBalance());

       System.out.println(jacksAccount.toString());
       System.out.println(jillsAccount.toString());
    }
 }