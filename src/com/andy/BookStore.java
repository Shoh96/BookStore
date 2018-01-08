package com.andy;

/**
 * Created by Chama on 1/8/2018.
 */
public class BookStore {
    
    private double totalBookPrice;
    private int no_Books;

    public static final double TAX = 7.5;
    public static final int SHIPPING_FEE = 5;

    public BookStore(double totalBookPrice, int no_Books) {
        this.totalBookPrice = totalBookPrice;
        this.no_Books = no_Books;
    }

    public double getTotalBookPrice() {
        return totalBookPrice;
    }

    public void setTotalBookPrice(double totalBookPrice) {
        this.totalBookPrice = totalBookPrice;
    }

    public int getNo_Books() {
        return no_Books;
    }

    public void setNo_Books(int no_Books) {
        this.no_Books = no_Books;
    }

    public double totalTax(){
        double totalTax = totalBookPrice / 100 * TAX;

        return  totalTax;
    }

   public double orderPrice(){
    int totalShipFee = no_Books * SHIPPING_FEE;

    double orderPrice = totalBookPrice + totalTax() + totalShipFee;

    return orderPrice;
   }
}
