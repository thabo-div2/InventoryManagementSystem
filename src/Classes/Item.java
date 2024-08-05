/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Enums.Category;

/**
 *
 * @author lab_services_student
 */
public class Item
{
    // Create a class Item with the following fields: String name, Category category, double price
    String name;
    double price;
    Category category;

    public Item(String name, double price, Category cat)
    {
        this.name = name;
        this.price = price;
        this.category = cat;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public Category getCategory()
    {
        return category;
    }
}
