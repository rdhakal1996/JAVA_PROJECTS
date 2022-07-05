package com.vendingmachine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    private final int STARTING_COUNT = 5;
    private LinkedHashMap<String, List<Product>> trayMap = new LinkedHashMap<>();

    public Inventory(){
        File inputFile = new File("vendingInventory.csv");
        try (Scanner inventoryFileScanner = new Scanner(inputFile)){
            while(inventoryFileScanner.hasNextLine()){
                String inventoryFileLine = inventoryFileScanner.nextLine();
                String [] inventoryLineArray = inventoryFileLine.split("\\|");

                String trayID =(inventoryLineArray[0]);
                String productNameString = inventoryLineArray[1];
                double productPrice = Double.parseDouble(inventoryLineArray[2]);
                String productTypeString = inventoryLineArray[3];

                List<Product> trayList = new ArrayList();

                for(int i=0; i<STARTING_COUNT; i++){
                    Product product = new Product(productNameString, productPrice, productTypeString);
                    trayList.add(product);
                }
                trayMap.put(trayID, trayList);
            }
        }catch(FileNotFoundException e){
            e.getStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public boolean isSoldOut(String trayID){
        boolean soldOut=false;
        if(trayMap.get(trayID).size()==0){
            soldOut=true;
        }
        return soldOut;
    }


    public LinkedHashMap<String, List<Product>> getTrayMap() {
        return trayMap;
    }

}
