/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice01inventorymanagement;

import Classes.Item;
import Enums.Category;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thabo Setsubi st10445734@vcconnnect.edu.za ST10445734
 */
public class Ice01InventoryManagement
{
    static ArrayList<Item> itemList = new ArrayList<>();
    static Item item1 = new Item("Banana", 12.05, Category.FRUITS);
    static Item item2 = new Item("Carrot", 9.99, Category.VEGETABLES);
    static Item item3 = new Item("Lamb Chop", 22.55, Category.MEAT);
    static Item item4 = new Item("Scone", 6.95, Category.BAKERY);
    static Item item5 = new Item("Cheese", 8.00, Category.DAIRY);
    static Category[] cats = Category.values();
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int option = 0;
        int EXIT = 5;
        
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        
        while(option != EXIT)
        {
            System.out.println("Grocery Store Inventory Management System ");
            System.out.println("1. Display all items \n" +
                           "2. Add a new item to the list \n" +
                           "3. Remove an item from the list \n" +
                           "4. Display item by Category \n" +
                           "5. Exit program");
            System.out.print("Choose an option: ");
            option = scan.nextInt();
            switch (option) 
            {
                case 1:
                    displayItemList(itemList);
                case 2:
                    addItemToList(itemList);
                case 3:
                    removeItemFromList(itemList);
                case 4:
                    displayCategory(itemList, Category.MEAT);
                case 5:
                    System.out.println("Exiting... ");
                
            }
            
        }
        
    }
    
    public static void displayItemList(ArrayList<Item> itemList)
    {
        System.out.println("All items in Inventory: ");
        for (int i = 0; i < itemList.size(); i++)
        {
            Item item = itemList.get(i);
            System.out.println(item.getName() + " (" + item.getCategory() + ") -  " + item.getPrice());
        }
        System.out.println();
    }
    
    public static void addItemToList(ArrayList<Item> itemList)
    {
        Scanner scan = new Scanner(System.in);
        String name;
        String c;
        Category cat = Category.FRUITS;
        double price;
        System.out.print("Enter name of item: ");
        name = scan.nextLine();
        
        System.out.println("Enter Category(FRUITS, VEGETABLES, DAIRY, BAKERY, MEAT): ");
        c = scan.nextLine();
        
        System.out.println("Enter price of the item: ");
        price = scan.nextDouble();
        
        if (c.toUpperCase().equals(Category.FRUITS.toString()))
        {
            cat = Category.FRUITS;
        }
        else if (c.toUpperCase().equals(Category.VEGETABLES.toString()))
        {
            cat = Category.VEGETABLES;
        }
        else if (c.toUpperCase().equals(Category.DAIRY.toString()))
        {
            cat = Category.DAIRY;
        }
        else if (c.toUpperCase().equals(Category.BAKERY.toString()))
        {
            cat = Category.BAKERY;
        }
        else if (c.toUpperCase().equals(Category.MEAT.toString()))
        {
            cat = Category.MEAT;
        }
        
        Item newItem = new Item(name, price, cat);
        
        itemList.add(newItem);
        
        System.out.println("Item added successfully");
    }
    
    public static void removeItemFromList(ArrayList<Item> itemList)
    {
        Scanner scan = new Scanner(System.in);
    }
    
    public static void displayCategory(ArrayList<Item> itemList, Category cat)
    {}
    //-------------------------00ooo0oo End of file oo0ooo00------------------//
}
