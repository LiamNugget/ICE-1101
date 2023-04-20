public class StockItem {
  private String itemID;
  private String itemDesc;
  private double price;
  private int quantity;
  private int reOrderLevel;

  public StockItem(String itemID, String itemDesc, double price, int quantity,
                   int reOrderLevel) {
    this.itemID = itemID;
    this.itemDesc = itemDesc;
    this.price = price;
    this.quantity = quantity;
    this.reOrderLevel = reOrderLevel;
  }

  public String toString() {
    return "Item ID: " + itemID + "\nItem Description: " + itemDesc +
        "\nPrice: \u00A3" + price + "\nQuantity: " + quantity +
        "\nReorder Level: " + reOrderLevel;
  }

  public String format() {
    return itemID + ": " + itemDesc + ", Price: \u00A3" + price +
        ", Quantity: " + quantity;
  }

  public String getItemID() { return itemID; }

  public String getItemDesc() { return itemDesc; }

  public double getPrice() { return price; }

  public int getQuantity() { return quantity; }

  public int getReorderLevel() { return reOrderLevel; }

  public void setPrice(double price) { this.price = price; }

  public void setQuantity(int quantity) { this.quantity = quantity; }

  public void setReorderLevel(int reOrderLevel) {
    this.reOrderLevel = reOrderLevel;
  }
}
