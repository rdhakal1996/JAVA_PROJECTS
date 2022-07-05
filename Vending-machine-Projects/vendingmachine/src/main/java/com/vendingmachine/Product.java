package com.vendingmachine;

public class Product {
    private String productName;
    private double productPrice;
    private String productType;

    public Product(String productName, double productPrice, String productType){
        this.productName= productName;
        this.productType=productType;
        this.productPrice=productPrice;
    }

    public String getDispenseMessage(){
        String message="";
        if(productType.equals("Chips")){
            message="Crunch Crunch, Yum!";
        }else if(productType.equals("Candy")){
            message="Munch Munch, yes";
        }else if(productType.equals("Drinks")){
            message="Glug Glug, Yum!";
        }else if(productType.equals("Snacks")){
            message="Chew Chew, Yum!";
        }
        return message;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }


    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
