package Part3Only; // Same type of thing as Engine and Lights 

public class NavSys extends StockItem { // Extends? 

    public NavSys(String stockCode, int quantity, double price) { //Left to right reference number, number available and price 

        super(stockCode, quantity, price); //invoke immediate parent class constructor, from google not understanding what it means 100%

    }

    public String getStockName() {
        return "Navigation system"; //Returns name 
    }

    public String getStockDescription() {
        return "GeoVision Sat Nav"; ,//Describes the product 
    }


    public String classToString() {
        String returnedString = "Stock Code : " + getFixedStockCode() + "\nStock Name : " + getStockName() +
                "\nStock Description : " + getStockDescription() + "\nQuantity in stock : " + getQuantity() +
                "\nPrice before VAT : " + getPrice() + "\nPrice after VAT : " + getPriceVAT();
        return returnedString; //Returns price 
    }

}
