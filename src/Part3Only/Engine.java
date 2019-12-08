package Part3Only;

public class Engine extends StockItem{ //Class "Engine" 
    private int horsepower; // Private Integer 

    public Engine(String stockCode, int quantity, double price, int horsepower) {//Private variables 

        super(stockCode, quantity, price);
        this.horsepower = horsepower;// super keyword used to invoke immediate parent class constructor.??
    }

    public String getStockName() {return "Engine";} // Returns number of stock for engine 

    public String getStockDescription() {return "car engine";} // Returns description of car engine 

    public String classToString() {
        String returnedString = "Stock Code : " + getFixedStockCode() + "\nStock Name : " + getStockName() +
                "\nStock Description : " + getStockDescription() + "\nQuantity in stock : " + getQuantity() +
                "\nPrice before VAT : " + getPrice() + "\nPrice after VAT : " + getPriceVAT();
        return returnedString; // Calculates final price of the part and prints it. 
    }
}
