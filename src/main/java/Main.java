import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main (String[]args){
        var meat = new Meat(5, 100);
        var red = new Apple(10,50, Colour.RED);
        var green = new Apple(8, 60, Colour.GREEN);

        Food[] items = {meat,red,green};

        var cart = new ShoppingCart(items);
        System.out.println("общую сумму товаров без скидки:"  + cart.totalPrice());
        System.out.println("общую сумму товаров со скидкой:"  + cart.discountPrice());
        System.out.println("сумму всех вегетарианских продуктов без скидки:"  + cart.vegPrice());

    }
}