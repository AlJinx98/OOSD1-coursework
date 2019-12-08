package Part3Only; //Understood that "light" and "Engine" are used for the respective part name, Duh 

public class Lights extends StockItem {
    double brightness;
    public Lights(String stockCode, int quantity, double price, double brightness) { // Variables in order  number of stock, quantity?, Price and brightness of light 
        super(stockCode, quantity, price);
        this.brightness = brightness;
    }

    public String getStockName() {
        return "Car Lights"; //Returns name of lights 
    }

    public String getStockDescription() {
        return "Lights for a car"; , //Describes product 
    }

    public String classToString() {
        String returnedString = "Stock Code : " + getFixedStockCode() + "\nStock Name : " + getStockName() +
                "\nStock Description : " + getStockDescription() + "\nQuantity in stock : " + getQuantity() +
                "\nPrice before VAT : " + getPrice() + "\nPrice after VAT : " + getPriceVAT();
        return returnedString; //Calculates cost 
    }
}
