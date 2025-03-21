/*
  Banking Management System
  Program: This program is a banking management system. Users can create an account or login to already created accounts. They have the option to deposit money, withdraw money, transfer money to another account, see account details, or log out.
  Created By: Milaan Shah and Eric Wang
  Date: 18 March 2024
*/

// imports needed libraries
import java.util.Scanner;
import java.util.ArrayList;

// Main class
public class Main {

  // login method that allows user to login into already created account
  public static User login(ArrayList<User> users, boolean loggedIn) {
    Scanner input = new Scanner(System.in);
    int IDIndex = -1;
    String currPass;
    int currUser;
    // asks user for their account ID to log in
    do{
      System.out.println("ENTER NATIONAL IDENTIFICATION NUMBER: ");
      currUser = input.nextInt();
      for (int i = 0; i < users.size(); i++){
        if (currUser == users.get(i).id){
          IDIndex = i;
        }
      }
      if (IDIndex < 0){
        System.out.println("INVALID ID NUMBER\nMAKE SURE ACCOUNT EXISTS");
      }
    } while (IDIndex < 0);

    // asks user for password
    do{
      input.nextLine();
      System.out.println("ENTER PASSWORD: ");
      currPass = input.nextLine(); 
      if(!users.get(IDIndex).password.equals(currPass)){
        System.out.println("INCORRECT PASSWORD");
        loggedIn = false;
      }
      else{
        loggedIn = true;
      }
    } while (!loggedIn);
    System.out.println("LOGGED IN\n");
    // returns User object to indicate which user is logged in
    return users.get(IDIndex);
  }

  // register method that allows users to create a new account
  public static void register(ArrayList<User> users) {
    Scanner input = new Scanner(System.in);
    int tempUser;
    boolean valid = false;

    // asks for unique ID chosen by user
    do{
      valid = true;
      System.out.println("ENTER NATIONAL IDENTIFICATION NUMBER: ");
      tempUser = input.nextInt();
      for (int i = 0; i < users.size(); i++){
        if (tempUser == users.get(i).id){
          System.out.println("ID ALREADY IN USE");
          valid = false;
        }
      }
    } while (!valid);

    // asks for user name
    System.out.println("ENTER NAME: ");
    String name = input.nextLine();
    name = input.nextLine();
      
    String tempPass;
    String confirmedPass;
    int passIndex = 0;
    valid = true;
    boolean check = true;

    // asks for user password
    do{
      System.out.println("ENTER PASSWORD: ");
      tempPass = input.nextLine();
      System.out.println("CONFIRM PASSWORD: ");
      confirmedPass = input.nextLine(); 
      for(int i = 0; i < users.size(); i++){
        if (users.get(i).password.equals(tempPass)){
          valid = false;
          passIndex = i;
        }
      }
      if ((tempPass.equals(confirmedPass)) && (valid == true)){
        // adds user to users list (creates account)
        User registerUser = new User(name, tempUser, tempPass, 0.0);
        users.add(registerUser);
      }
      else if (!valid){
        System.out.println("PASSWORD IS ALREADY IN USE BY THE USER WITH NATIONAL IDENTIFICATION NUMBER " + passIndex);
        System.out.println("Congrats! You have found the easter egg!");
      }
      else {
        System.out.println("PASSWORDS DONT MATCH");
        check = false;
      }
    } while (((!tempPass.equals(confirmedPass)) == false) && (valid == false));

    // completes registration
    if (check) {
      System.out.println("SUCCESSFULLY REGISTERED\n\n\n");
    }
    else {
      System.out.println("UNSUCCESSFUL REGISTERATION\n\n\n");
    }
  }

  // displays menu that user can choose from after being logged in
  public static void displayMenu() {
    System.out.println("1. Deposit money");
    System.out.println("2. Withdraw money");
    System.out.println("3. See account details");
    System.out.println("4. Transfer money");
    System.out.println("5. Log out");
  }

  // main method
  public static void main(String[] args) {
    // this list stores all user accounts
    // user accounts are of type User class
    ArrayList<User> users = new ArrayList<User>();

    // necessary variables
    boolean loggedIn = true;
    int option = 0;
    int choice = 0;
    User activeUser;

    // variable to get user input
    Scanner input = new Scanner(System.in);

    // this loop keeps looping until program ends
    do{
      // asks user to register or login
      System.out.println("1. REGISTER");
      System.out.println("2. LOGIN");
      option = input.nextInt();

      // executes commands based on user choice
      if (option == 2){
        activeUser = login(users, loggedIn);
      }
      else{
        register(users);
        activeUser = login(users, loggedIn);
      }
      
      choice = 0;
      // while loop that runs after being logged in
      while (choice != 5) {
        // display menu and get user choice
        displayMenu();
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        System.out.println();
        // if statements that execute the proper commands
        if (choice == 1) {
          System.out.print("Enter deposit amount: $");
          double amount = input.nextDouble();

          activeUser.deposit(amount);
        }
        else if (choice == 2) {
          System.out.print("Enter withdraw amount: $");
          double amount = input.nextDouble();
          activeUser.withdraw(amount);
        }
        else if (choice == 3) {
          activeUser.seeDetails();
        }
        else if (choice == 4) {
          System.out.print("Enter account ID you want to transfer money to: ");
          int Id = input.nextInt();
          System.out.print("Enter transfer amount: $");
          double amount = input.nextDouble();
          // the following gets the user to which the amount will be transferred
          User transferToUser;
          boolean confirm = false;
          for (int i = 0; i < users.size(); i++){
            if (users.get(i).id == Id){
              transferToUser = users.get(i);
              activeUser.transfer(amount, transferToUser);
              confirm = true;
              break;
            }
          }

          if (!confirm) {
            System.out.println("Other account not found! Transfer cancelled!");

          }
          
        }
        else if (choice != 5) {
          System.out.println("Invalid choice. Please try again.");
        }
        System.out.println("\n");
      }
    }while (loggedIn);
  }
}
