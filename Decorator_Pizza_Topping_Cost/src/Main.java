import com.pizza.topping.cost.Magritta;
import com.pizza.topping.cost.VeggisDelight;
import com.pizza.topping.cost.toppings.ExtraCheese;
import com.pizza.topping.cost.toppings.ExtraCheeseAndMushroom;
import com.pizza.topping.cost.toppings.Jalpenno;

public class Main{
    public static void main(String[] args) {
        System.out.println("Cost of Pizzas based on the Toppings : ");
        System.out.println("Base Cost - ");
        System.out.println("Margritta - "+ new Magritta().cost());
        System.out.println("Veggie Delight Base - "+ new VeggisDelight().cost());
        System.out.println("Extracheese with Magritta Base -" + new ExtraCheese(new Magritta()).cost());
        System.out.println("Veggie delight with extracheese and Mushroom and Jalepeno - "+new Jalpenno(new ExtraCheeseAndMushroom(new VeggisDelight())).cost());
    }
}