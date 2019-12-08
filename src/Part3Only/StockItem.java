package Part3Only;
// Related to the seperate parts and how their code works, such as the quantity and price 
public class StockItem {
    // Declare class self variables
    private String fixedStockCode;
    private int quantity;
    private double price;

    // Constructor with arguments to set variables
    public StockItem(String stockCode, int quantity, double price) {
        this.fixedStockCode = stockCode;
        this.quantity = quantity;
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity; //sets the base quantity to 0? 
    }

    public void setPrice(double price) {
        this.price = price; //Sets the base price to 0?
    }

    public String getFixedStockCode() {
        return fixedStockCode;//?
    }

    public int getQuantity() {
        return quantity;//?
    }

    public double getPrice() {
        return price; //?
    }

    public double getPriceVAT() {
        double vat = getVat();
        double price = getPrice();

        double priceAfterVAT = price * (1 + vat);
        return priceAfterVAT; //Setting the price after vat, also the price before 

    }

    public String getStockName() {
        String unknown = "Unknown Stock Name";
        return unknown; // Return value if an unknown stock name is searched for 
    }

    public String getStockDescription() {
        String unknown = "Unknown Stock Description";
        return unknown; // Return value if an unknown item is searched for 
    }


    public void addStock(int addedQuantity) {

        if (quantity + addedQuantity < 1) {
            System.out.println("Stock value cannot be less than one"); // Never less than 1 of an item, 0? 
        }
        else if (quantity + addedQuantity > 100) {
            System.out.println("Stock value cannot exceed 100"); // Will never have more than 100 of an item
        }
        else {
            quantity += addedQuantity;
        }
    }

    public boolean sellStock(int soldQuantity) {
        if (quantity - soldQuantity < 1) {
            System.out.println("Cannot sell more stock than is currently available");
            return false;
        }
        else {
            quantity -= soldQuantity;
            return true;
        }
    } // Boolean ensuring you cannot sell an item that there is less than 1 of 

    public double getVat() {
        double standardVat = 0.175; //Used to add VAT to price of item 
        return standardVat;
    }

    public String classToString() {
        String returnedString = "Stock Code : " + getFixedStockCode() + "\nStock Name : " + getStockName() +
                "\nStock Description : " + getStockDescription() + "\nQuantity in stock : " + getQuantity() +
                "\nPrice before VAT : " + getPrice() + "\nPrice after VAT : " + getPriceVAT();
        return returnedString; //Calculate price using different factors such as VAT, also returns number of stock and the description, Same as others? 

    }



}
