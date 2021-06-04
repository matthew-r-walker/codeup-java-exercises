public class ServerNameGenerator {
   private static String[] adjective = {"adorable", "adventurous", "aggressive", "agreeable", "alert", "alive", "amused", "angry", "annoyed", "annoying"};
   private static String[] noun = {"lion", "tiger", "bear", "dog", "cat", "alligator", "cricket", "bird", "wolf", "snake"};


    public static String randomEle(String[] arr) {
        int rand = (int)(Math.random() * arr.length);
        return arr[rand];
    }

    public static void main(String[] args) {
        System.out.printf("Here is your server name:%n%s-%s",randomEle(adjective), randomEle(noun));
    }
}
