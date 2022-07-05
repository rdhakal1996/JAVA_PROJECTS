package com.storeinfo;

public class StoreHours {



    /*
    Store is open between 8 am (hour 8) and 5 pm (hour 17).
    Implement the logic to determine if the store is open based on the current hour.

    Examples:
    isStoreOpen(8) ➔ true
    isStoreOpen(12) ➔ true
    isStoreOpen(17) ➔ false
    isStoreOpen(22) ➔ false
     */
    public boolean isStoreOpen(int currentHour) {
        if(currentHour>=8 && currentHour<5){
            return true;
        }
        return false;
    }

    /*

    store is open between 8 am (hour 8) and 5 pm (hour 17) on Monday (day M), Wednesday (day W), and Friday (day F).
    Implement the logic to determine if the store is open based on the current hour and the current day.

    NOTE: This problem uses a char to represent the current day of the week. You can use the following key:
        Monday = 'M'
        Wednesday = 'W'
        Friday = 'F'
        Saturday = 'S'

    The char for the current day is only uppercase.

    Examples:
    isStoreOpen(8, 'M') ➔ true
    isStoreOpen(12, 'W') ➔ true
    isStoreOpen(12, 'S') ➔ false
     */
    public boolean isStoreOpen(int currentHour, char currentDay) {
        return false;
    }


    /*
    Store is open between 8 am (hour 8) and 5 pm (hour 17) on Monday (day M), Wednesday (day W), and Friday (day F).
    In the summer, the store is open until 8 pm (hour 20) on Wednesday (day W) and is also open Saturday (day S) from 9 am (hour 9) to 3 pm (hour 15).
    Implement the logic to determine if the store is open based on the current hour, the current day, and if it's summer.

    Examples:
    isStoreOpen(8, 'M', true) ➔ true
    isStoreOpen(12, 'W', false) ➔ true
    isStoreOpen(12, 'S', false) ➔ false
    isStoreOpen(9, 'S', true) ➔ true
     */
    public boolean isStoreOpen(int currentHour, char currentDay, boolean isSummer) {
        return false;
    }
}
