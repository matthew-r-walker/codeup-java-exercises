import util.Input;
import java.util.*;
import java.util.Map.*;

public class GroceryApp {

    // Array of grocery categories. If you add to this the application will continue to operate properly.
    public static String[] groceryCats = {
        "Baby",
        "Beverages",
        "Bread & Bakery",
        "Breakfast & Cereal",
        "Dairy, Eggs & Cheese",
        "Deli",
        "Frozen Foods",
        "Meat & Seafood",
        "Produce"
    };

    public static Input input = new Input();

    public static Scanner sc = new Scanner(System.in);

    public static HashMap<String, HashMap<String, Integer>> gList = new HashMap<>();

    // This method runs makeGroceryList() based on user response
    public static void makeIt() {
        System.out.println("Would you like to create a grocery list?");
        if (input.yesNo()) {
            makeGroceryList();
        }
    }
    // This method displays grocery categories and allows users to select a category and add items to it
    // until the user decides they're done adding items, once the user is done adding items it executes displayList()
    public static void makeGroceryList() {
        do {
            System.out.println("Which category would you like to choose from?");
            for (int i = 0; i < groceryCats.length; ++i) {
                System.out.println(i + 1 + ". " + groceryCats[i]);
            }

            int userNum = input.getInt(1, groceryCats.length);
            String userChoice = groceryCats[userNum - 1];
            System.out.println(userChoice);

            if (!gList.containsKey(userChoice)) {
                addCat(userChoice);
            }

            HashMap<String, Integer> selectedCat = gList.get(userChoice);

            do {
                addItemOrUpdateItemVal(selectedCat);
                System.out.println("Would you like to add another item from " + userChoice);
            } while (input.yesNo());

            System.out.println("Would you like to add more to the list?");
        } while (input.yesNo());

        displayList();
    }
    //  This method displays a list of categories and items within each category, it will alphabetize
    //  the list categories and the items within each category
    public static void displayList() {
        ArrayList<String> listCats = new ArrayList<>(gList.keySet());
        Collections.sort(listCats);

        for (String cat : listCats) {
            if (gList.containsKey(cat)) {
                Set<Entry<String, Integer>> entrySet = gList.get(cat).entrySet();
                ArrayList<Entry<String, Integer>> listOfEntry = new ArrayList<>(entrySet);
                ArrayList<String> itemList = new ArrayList<>();

                for (Entry<String, Integer> set : listOfEntry) {
                    itemList.add(set.toString().replace('=', ' '));
                }

                Collections.sort(itemList);
                System.out.println("-----------\n" + cat + "\n-----------");
                for (String item : itemList) {
                    System.out.println(item);
                }
            }
        }
    }

    // This method allows the user to add a new item to the selected category or update an existing items quantity
    public static void addItemOrUpdateItemVal(HashMap<String, Integer> items) {
        System.out.println("What item would you like to add?");
        String userInpItem = sc.nextLine();
        System.out.println("How many " + userInpItem + " would you like to add?");
        int userNum = input.getInt();

        if (items.containsKey(userInpItem)) {
            int oldVal = items.get(userInpItem);
            items.replace(userInpItem, oldVal + userNum);
        } else {
            items.put(userInpItem, userNum);
        }
    }
    // This method adds the user selected category to the list
    public static void addCat(String key) {
        if (!gList.containsKey(key)) {
            gList.put(key, new HashMap<String, Integer>());
        }
    }


    public static void main(String[] args) {

        makeIt();

        // this will display what is in the produce hash map key value
//        System.out.println(gList.get("Produce"));

        // this will display the value of strawberries within the hash map key value within the produce hashmap key value
//        System.out.println(gList.get("Produce").get("Strawberries"));
//        System.out.println(gList.get("Produce").keySet());

    }
}
