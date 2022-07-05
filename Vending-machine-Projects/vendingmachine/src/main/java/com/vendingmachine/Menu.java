package com.vendingmachine;

import java.util.Scanner;

public class Menu {

    Scanner inputValue = new Scanner(System.in);
    public Object getMenuOptionValue(Object[] products){
        Object choice = null;
        while(choice==null){
            displayOptionWithValue(products);
            choice= getObjectValueFromOption(products);
        }

        return choice;
    }

    public Object getObjectValueFromOption(Object[] products){
        Object choice = null;
        String chosenValue = inputValue.nextLine();
        try{
            int selectOption = Integer.valueOf(chosenValue);
            if(selectOption>0 && selectOption <= products.length){
                choice = products[selectOption-1];
            }
        }catch(NumberFormatException err){

        }
        if(choice == null){
            System.out.println(System.lineSeparator() + "Option did not match");
        }
        return choice;
    }

    public void displayOptionWithValue(Object[] products){
        System.out.println();
        if(products.length>0) {
            System.out.println();
            for (int i = 0; i < products.length; i++) {
                int productNum = i + 1;
                System.out.println("("+ productNum + ") " + products[i] );
            }
        }
        System.out.println(System.lineSeparator() + "Please choose an option >>>");
        System.out.flush();
    }
}
