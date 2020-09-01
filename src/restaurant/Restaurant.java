package restaurant;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem meatballPasta = new MenuItem("Meatball Pasta", 17.99, "Lorem ipsum dolor sit amet," +
                " consectetur adipiscing elit.", "Entree");

        MenuItem antipastoSkewers = new MenuItem("Antipasto Skewers", 11.99, "Sed do eiusmod tempor" +
                " incididunt ut labore et dolore magna aliqua.", "Appetizer");

        MenuItem biscotti = new MenuItem("Biscotti", 7.99, "sed do eiusmod tempor incididunt ut " +
                "labore et.", "Dessert");

        Menu listOfDishes = new Menu();
        listOfDishes.add(meatballPasta);
        listOfDishes.add(antipastoSkewers);
        listOfDishes.add(biscotti);

        System.out.println(listOfDishes);

        System.out.println(meatballPasta);
        System.out.println(antipastoSkewers);
        System.out.println(biscotti);

        listOfDishes.remove(biscotti);
        System.out.println(listOfDishes);
    }
}
