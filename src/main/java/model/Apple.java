package model;

import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

public class Apple extends Food {
    String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);

        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Objects.equals(Colour.RED, colour)) {
            return Discount.RED;
        } else {
            return super.getDiscount();
        }
    }
}