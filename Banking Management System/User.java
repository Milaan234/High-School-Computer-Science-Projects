// User class for all accounts
// User accounts are of this type class

public class User {
  
  // instance variables
  private String name;
  public int id;
  public String password;
  private double accountBalance;

  // constructor that instantiates the variables
  public User(String name, int id, String password, double initialBalance) {
    this.name = name;
    this.id = id;
    this.password = password;
    this.accountBalance = initialBalance;
  }

  // gives all user account details (except password)
  public void seeDetails() {
    // display details
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Account Balance: $" + accountBalance);
  }

  // deposits money into user account
  public void deposit(double amount) {
    // add money to account
    accountBalance += amount;
    System.out.println("$" + amount + " deposited!");
  }

  // withdraws money from user account if there is enough money in the account
  public void withdraw(double amount) {
    // checks to see if there is enough money
    if (accountBalance - amount >= 0) {
      // if enough money, withdraw money
      accountBalance -= amount;
      System.out.println("$" + amount + " withdrawed!");
    }
    else {
      // if not enough money, do not withdraw money
      System.out.println("Not enough balance to withdraw this amount. Amount not withdrawed!");
    }
  }

  // transfers money from one account to another if there is enough money from the original account
  public void transfer(double amount, User otherUser) {
    // checks to see if there is enough money
    if (accountBalance - amount >= 0) {
      // is enough money, transfer money
      this.withdraw(amount);
      System.out.println("$" + amount + " removed from your account.");
      otherUser.deposit(amount);
      System.out.println("$" + amount + " added to the other account.");
      System.out.println("Transfer complete!");
    }
    else {
      // if not enough money, do not transfer money
      System.out.println("Not enough balance to transfer this amount. Amount not trasferred!");
    }
  }
  
}
