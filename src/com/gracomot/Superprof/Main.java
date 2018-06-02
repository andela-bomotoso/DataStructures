package com.gracomot.Superprof;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ShoppingList[] shoppingLists = new ShoppingList[5];
        shoppingLists[0] = new ShoppingList("10, Mar, 2013", "Walmart", 67.50);
        shoppingLists[1] = new ShoppingList("12 May, 2015", "Kroger", 90.34);
        shoppingLists[2] = new ShoppingList("15, April, 2016", "Macy", 300.98);
        shoppingLists[3] =  new ShoppingList("06, May, 2017", "Target",200.87);
        shoppingLists[4] = new ShoppingList(" 01-Jun, 2018", "Walgreens", 98.6);

        for (ShoppingList shoppinglist:shoppingLists) {
            System.out.println("On "+shoppinglist.getDate()+", I shopped at "+shoppinglist.getStore() +
                    " and I spent "+shoppinglist.getAmountSpent());
        }
    }

    static int factorial(int number)   {
        int fact = 1;
        for (int i = 1; i <=number; i++)    {
            fact = fact * i;
        }
        return fact;
    }
}
