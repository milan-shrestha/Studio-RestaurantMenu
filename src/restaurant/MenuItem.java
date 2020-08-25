package restaurant;

public class MenuItem {

    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    public MenuItem(String name, Double price, String description, String category) {

        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }

}
