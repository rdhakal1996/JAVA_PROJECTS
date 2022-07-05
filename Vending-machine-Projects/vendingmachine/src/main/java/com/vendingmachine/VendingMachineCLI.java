package com.vendingmachine;

import java.io.IOException;
import java.util.Scanner;

public class VendingMachineCLI {
    private final String INVENTORY_MENU_OPTION = "Display all available items in inventory";
    private final String PURCHASE_MENU_OPTION = "Purchase";
    private final String EXIT_MENU_OPTION = "Exit";
    private final String HIDDEN_MENU_OPTION = "This section will be hidden to show total sales report";
    public String[] MENU_OPTIONS= {INVENTORY_MENU_OPTION, PURCHASE_MENU_OPTION, EXIT_MENU_OPTION, HIDDEN_MENU_OPTION};

    private final String PURCHASE_FEED_OPTION = "Feed Money";
    private final String PURCHASE_SELECT_OPTION = "Select Product";
    private final String PURCHASE_END_TRANSACTION = "End Transaction";
    public String[] PURCHASE_OPTIONS= {PURCHASE_FEED_OPTION, PURCHASE_SELECT_OPTION, PURCHASE_END_TRANSACTION};

    private Menu menu;
    private VendingMachine vendingMachine;
    private Product product;
    private Inventory inventory;

    private Scanner purchaseMenuInput = new Scanner(System.in);

    public VendingMachineCLI(Menu menu){
        this.menu = menu;
        this.vendingMachine = new VendingMachine();
    }

    public void runMethod(){
        while(true){
            String choice = (String) menu.getMenuOptionValue(MENU_OPTIONS);

            if(choice.equals(INVENTORY_MENU_OPTION)){
                System.out.println(vendingMachine.printInventoryContent());
            }else if(choice.equals(PURCHASE_MENU_OPTION)){
                System.out.println("Current Money provided: $"+ vendingMachine.getMoneyProvided());
                String purchaseChoice = (String) menu.getMenuOptionValue(PURCHASE_OPTIONS);

                if(purchaseChoice.equals(PURCHASE_FEED_OPTION)){
                    try{
                        System.out.println("Please enter how much you want to insert? (Whole $ amount only! >>> ");
                        String moneyInserted = purchaseMenuInput.nextLine();
                        vendingMachine.setMoneyProvided(Double.parseDouble(moneyInserted));
                        System.out.println("Total money is: $"+vendingMachine.getMoneyProvided());
                    }catch(NullPointerException e){
                        System.out.println("User Input value reference server");
                    }
                }else if(purchaseChoice.equals(PURCHASE_SELECT_OPTION)){
                    System.out.println("Please enter your tray choice:");
                    String trayChoice = purchaseMenuInput.nextLine();
                    vendingMachine.makePurchase(trayChoice);

                }else if(purchaseChoice.equals(PURCHASE_END_TRANSACTION)){
                    double changeNeeded = vendingMachine.getMoneyProvided();
                    System.out.println("Here is your change: $"+changeNeeded+". Please Come Again");

                }else{
                    System.out.println("Please Type correct option");
                }
            }else if(choice.equals(EXIT_MENU_OPTION)){
                System.out.println("Exit transaction");
                System.exit(0);
            }else if(choice.equals(HIDDEN_MENU_OPTION)){
                System.out.println("Total sales report here");
            }else{
                System.out.println("Sorry choice you provided is not applicable");
            }
        }


    }

    public static void main(String[] arg){
        Menu menu = new Menu();
        VendingMachineCLI vendingMachineCLI = new VendingMachineCLI(menu);
        vendingMachineCLI.runMethod();
    }
}
