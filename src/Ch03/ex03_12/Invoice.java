// 3.12 (Invoice Class) Create a class called Invoice that a hardware store
// might use to represent an invoice for an item sold at the store.
// An Invoice should include four pieces of information as instance variables
// —a part number (type String), a part description (type String),
// a quantity of the item being purchased (type int) and a price per item (double).
// Your class should have a constructor that initializes the four instance variables.
// Provide a set and a get method for each instance variable.
// In addition, provide a method named getInvoiceAmount that calculates the invoice amount
// (i.e., multiplies the quantity by the price per item), then returns the amount as a double value.
// If the quantity is not positive, it should be set to 0. If the price per item is not positive,
// it should be set to 0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.
package Ch03.ex03_12;

public class Invoice {

    private String partNumber;
    private String description;
    private int quantity;
    private double price;

    // Invoice constructor that receives four parameters
    public Invoice(String partNumber, String description, int quantity, double price) {
        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    // method that returns the part number
    public String getPartNumber() {
        return partNumber;
    }

    // method that sets the part number
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    // method that returns the description
    public String getDescription() {
        return description;
    }

    // method that sets the description
    public void setDescription(String description) {
        this.description = description;
    }

    // method that returns the quantity
    public int getQuantity() {
        return quantity;
    }

    // method that sets the quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // method that returns the price
    public double getPrice() {
        return price;
    }

    // method that sets the price
    public void setPrice(double price) {
        this.price = price;
    }

    // method that returns the invoice amount
    public double getInvoiceAmount() {

        if (quantity < 0) {
            quantity = 0;
        }

        if (price < 0) {
            price = 0.0;
        }

        return price * quantity;
    }
}