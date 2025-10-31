package model;

import model.constants.Discount;

public abstract class Food implements Discountable{
    protected int amount; // количество продукта в килограммах
    protected double price; // цена за единицу
    protected boolean isVegetarian; // флаг, который показывает, вегетарианский ли продукт

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }
    @Override
    public double getDiscount() {
        return Discount.DEFAULT;
    }

    public double getPrice(){
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}