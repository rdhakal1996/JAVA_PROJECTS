package com.storeinfo;

public class MainMethod {
    public static void main(String[] arg){
        /*
        Actual test case is on test folder. This is just a simple output
         */
        StoreHours hours = new StoreHours();
        boolean checkOpen = hours.isStoreOpen(10);
        System.out.println(checkOpen);
    }
}
