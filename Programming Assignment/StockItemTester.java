import java.text.DecimalFormat;

public class StockItemTester {
  public static void main(String[] args) {

    // Creating a new Stock Item
    StockItem item = new StockItem("#1", "Oil", 9.99, 25, 10);

    // Testing the getters
    System.out.println("\nTesting Getters");
    System.out.println("***************");
    System.out.println("Item ID: " + item.getItemID());
    System.out.println("Item Description: " + item.getItemDesc());
    System.out.println("Price: \u00A3" + item.getPrice());
    System.out.println("Quantity: " + item.getQuantity());
    System.out.println("Reorder Level: " + item.getReorderLevel());

    // Testing the setters
    System.out.println("\nTesting Setters");
    System.out.println("***************");
    item.setPrice(5.99);
    item.setQuantity(50);
    item.setReorderLevel(15);
    System.out.println("New Price: \u00A3" + item.getPrice());
    System.out.println("New Quantity: " + item.getQuantity());
    System.out.println("New Reorder Level: " + item.getReorderLevel());

    // Testing toString
    System.out.println("\nTesting toString");
    System.out.println("***************");
    System.out.println(item.toString());

    // Testing format
    System.out.println("\nTesting format");
    System.out.println("***************");
    System.out.println(item.format());
  }
}