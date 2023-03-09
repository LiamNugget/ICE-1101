/**
A bank account has a balance that can be changed by
deposits and withdrawals.
WARNING: CODE MAY DELIBERATELY CONTAIN ERRORS
WARNING: CODE IS INCOMPLETE
*/

public class BankAccount {
  // Constructs a bank account with a zero balance.
  void NewBankAccount() { balance = 0; }

  // Constructs a bank account with a given balance.
  public BankAccount(double balance) { this.balance = balance; }

  // Deposits money into the bank account.
  public void deposit(double amount, double newBalance) {
    newBalance = balance + amount;
    balance = newBalance;
  }

  // Withdraws money from the bank account.
  public void withdraw(double amount) {
    balance = balance - amount;

    if (balance < 0) {
      balance = 0;
    }
  }

  // Gets the current balance of the bank account.
  public double getBalance() { return balance; }

  public String toString() {
    return getClass().getName() + "[balance=" + balance + "]";
  }

  private double balance;
}