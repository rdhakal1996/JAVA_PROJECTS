package com.vendingmachine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VendingMachine {

    private Inventory inventory;
    private double moneyProvided = 0.00;

    public double getMoneyProvided() {
        return moneyProvided;
    }

    public void setMoneyProvided(double moneyProvided) {
        this.moneyProvided += moneyProvided;
    }

    public VendingMachine(){
        this.inventory = new Inventory();
    }

    public String printInventoryContent(){
        String inventoryDisplayString="";
        LinkedHashMap<String, List<Product>> trayMap = inventory.getTrayMap();
        for(Map.Entry<String, List<Product>> specificTray: trayMap.entrySet()){
            List<Product> inventoryList = specificTray.getValue();
            if(inventoryList.isEmpty()){
                System.out.println("SORRY, ITEM "+specificTray.getKey()+ "IS SOLD OUT!");
            }else{
                Product inventoryItem = inventoryList.get(0);
                inventoryDisplayString += specificTray.getKey() + " : "+inventoryItem.getProductName()
                        + " | Price: $"+ inventoryItem.getProductPrice()+ " | Category: " + inventoryItem.getProductType()+ "\n";
            }
        }
        return inventoryDisplayString;
    }

    public String printLogFedMoney(double totalMoney){
        String salesLog= "";
        if(totalMoney>=0){
            DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy hh:mm:ss");
            Date date = new Date();
            double fedMoney = this.moneyProvided;
            salesLog=dateFormat.format(date)+"FEED MONEY: $"+fedMoney+" $"+totalMoney;
        }
        return salesLog;
    }

//    public String printLogProductSold(String trayID){
//        String salesLog="";
//        if (!trayID.equals(null)) {
//            Product dispensedProduct = inventory.getTrayMap();
//            DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy hh:mm:ss");
//            Date date = new Date();
//            salesLog=dateFormat.format(date)+" "+ dispensedProduct.getProductName()+" "+trayID+" "+dispensedProduct.getProductType();
//        }
//        return salesLog;
//    }

    public String printLogCompleteTransaction(){
        DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy hh:mm:ss");
        Date date = new Date();
        String salesLog=dateFormat.format(date)+" GIVE CHANGE: $"+ moneyProvided+" $0.00";

        return salesLog;
    }

    public String totalSalesReport(){
        String displaySalesReport="";
        LinkedHashMap<String, List<Product>> trayMap = inventory.getTrayMap();
        for(Map.Entry<String, List<Product>> specificTray: trayMap.entrySet()) {
            List<Product> inventoryList = specificTray.getValue();
            Product inventoryItem = inventoryList.get(0);
            int finalSize= 5 - inventoryList.size();
            displaySalesReport+= inventoryItem.getProductName()+ "|"+ finalSize + "\n";
        }
        return displaySalesReport;
    }

    public void makePurchase(String userInputMapKey){
        if(!userInputMapKey.equals(null)){
            if(!inventory.getTrayMap().containsKey(userInputMapKey)){
                System.out.println("Invalid entry, please try again");
            }else if(inventory.isSoldOut(userInputMapKey)){
                System.out.println("Sorry, may be this product was everyone's favorite so we sold out quickly. ");
            }else{
                Product dispensedProduct = inventory.getTrayMap().get(userInputMapKey).get(0);
                if(dispensedProduct.getProductPrice()<=moneyProvided){
                    moneyProvided-=dispensedProduct.getProductPrice();
                    inventory.getTrayMap().get(userInputMapKey).remove(0);

                    String dispenseMessage = dispensedProduct.getProductName()+ ": $"+dispensedProduct.getProductPrice();
                    System.out.println(dispenseMessage);
                    System.out.println(dispensedProduct.getDispenseMessage());
                }else{
                    System.out.println("Sorry, you don't have enough money. Please feed some money");
                }
            }
        }
    }
}
