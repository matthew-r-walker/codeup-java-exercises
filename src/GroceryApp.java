import util.Input;

import java.util.Scanner;

public class GroceryApp {

    public static String[] groceryCats = {
        "1. Baby",
        "2. Beverages",
        "3. Bread & Bakery",
        "4. Breakfast & Cereal",
        "5. Canned Goods & Soups",
        "6. Condiments/Spices & Bake",
        "7. Cookies, Snacks & Candy",
        "8. Dairy, Eggs & Cheese",
        "9. Deli",
        "10. Frozen Foods",
        "11. Meat & Seafood",
        "12. Produce"
    };

    public static Input input = new Input();

    public static Scanner sc = new Scanner(System.in);
    public static void makeGroceryList() {
        System.out.println("Would you like to create a grocery list?");
        if (input.yesNo()) {
            System.out.println("Which category would you like to choose from?");
            for (String cat : groceryCats) {
                System.out.println(cat);
            }
        }
        int userNum = input.getInt(1, 12);
        System.out.println(groceryCats[userNum -1]);
    }


    public static void main(String[] args) {
        makeGroceryList();
    }
}
