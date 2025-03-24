import java.util.ArrayList;

public class Order {

  public int ID;
  private ArrayList<String> itemList;
  private double cost;

  public Order(int ID, ArrayList<String> itemList, double cost) {
    this.ID = ID;
    this.itemList = itemList;
    this.cost = cost;
  }

  public void printOrder() {
    System.out.println("ID: " + this.ID);
    for (int i = 0; i < itemList.size(); i++) {
      System.out.println(itemList.get(i));
    }
    System.out.println("Cost: " + this.cost);
  }
}
