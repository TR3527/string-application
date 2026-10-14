package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String myItem = "cookies";
        double itemPrice = 2.00;
        int cookieCount = 3;

        System.out.println("You bought " + cookieCount + " " + myItem + " for " + "$" + itemPrice*cookieCount);
    }
}
