import util.Input;

import java.util.Scanner;

public class GroceryApp {

    public static String[] groceryCats = {
        "Baby",
        "Beverages",
        "Bread & Bakery",
        "Breakfast & Cereal",
        "Canned Goods & Soups",
        "Condiments/Spices & Bake",
        "Cookies, Snacks & Candy",
        "Dairy, Eggs & Cheese",
        "Deli",
        "Frozen Foods",
        "Meat & Seafood",
        "Produce"
    };

    public static Input input = new Input();

    public static Scanner sc = new Scanner(System.in);
    public static void makeGroceryList() {
        System.out.println("Would you like to create a grocery list?");
        if (input.yesNo()) {
            System.out.println("Which category would you like to choose from?");
            for (int i = 0; i < groceryCats.length; ++i) {
                System.out.println(i + 1 + ". " + groceryCats[i]);
            }
        }
        int userNum = input.getInt(1, 12);
        System.out.println(groceryCats[userNum -1]);
    }


    public static void main(String[] args) {
        makeGroceryList();
    }
}
