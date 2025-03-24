import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int orderCount = 0;

    ArrayList<Order> orderList = new ArrayList<Order>();

    int choice = 0;

    do {
      System.out.println("1. See Menu and Order Options");
      System.out.println("2. Order");
      System.out.println("3. Retrieve Order");
      System.out.println("4. Exit");
      System.out.println();
      System.out.println("Enter choice (num): ");
      choice = input.nextInt();

      if (choice == 1) {
        menu();
      }
      else if (choice == 2) {
        int orderID;
        ArrayList<String> itemList = new ArrayList<String>();
        double cost = 0;

        boolean cancelOrder = false;
        int itemChoice = 0;
        
        while (true) {
          System.out.println("Enter item choice (num): ");
          itemChoice = input.nextInt();
          if (itemChoice == 1) {
            itemList.add("Burger");
            cost += 3;
          }
          else if (itemChoice == 2) {
            itemList.add("Fries");
            cost += 1;
          }
          else if (itemChoice == 3) {
            itemList.add("Sprite");
            cost += 0.50;
          }
          else if (itemChoice == 4) {
            itemList.add("Coca Cola");
            cost += 0.75;
          }
          else if (itemChoice == 5) {
            break;
          }
          else if (itemChoice == 6) {
            cancelOrder = true;
            break;
          }
          else {
            System.out.println("Invalid choice");
            continue;
          }
        }

        if (cancelOrder) {
          continue;
        }
        orderCount++;
        orderID = orderCount;
        orderList.add(new Order(orderID, itemList, cost));

        System.out.println();
        System.out.println("Order added!");
        System.out.println();
        System.out.println("Order summary: ");
        orderList.get(orderID - 1).printOrder();
      }
      else if (choice == 3) {
        System.out.println("Enter order ID (num): ");
        int orderID = input.nextInt();

        System.out.println();
        System.out.println("Order summary: ");
        orderList.get(orderID - 1).printOrder();
      }
      else if (choice != 4) {
        System.out.println("Invalid choice");
        System.out.println();
      }

      System.out.println();
    } while (choice != 4);
    System.out.println("Enjoy your meal!");
  }

  public static void menu() {
    System.out.println();
    System.out.println("Menu and Order Options: -------------------");
    System.out.println("1. Burger - $3");
    System.out.println("2. Fries - $1");
    System.out.println("3. Sprite - $0.50");
    System.out.println("4. Coca Cola - $0.75");
    System.out.println("5. That's it!");
    System.out.println("6. Cancel order");
    System.out.println();
  }
}
