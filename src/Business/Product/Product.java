/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Product;

/**
 *
 * @author Rushabh
 */
public class Product {
    private static int count = 0;
    private String prodName;
    private int price;
    private int modelNumber;
    private int availability;
    private int initialAvailability;
    private boolean reserved = false;

    public int getInitialAvailability() {
        return initialAvailability;
    }

    public void setInitialAvailability(int initialAvailability) {
        this.initialAvailability = initialAvailability;
    }
            
    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public Product() {
        count++;
        modelNumber = count;
    }
    
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
    
    
    
    @Override
    public String toString() {
        return prodName;
    }
    
}
