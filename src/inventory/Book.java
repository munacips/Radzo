package inventory;

import executable.Main;

public class Book extends Category{
    private final int id;
    private String title;
    private String author;
    private double price;
    private String ISBN;
    private int quantity;

    public Book(String title, String author, double price, String ISBN, int quantity,String categoryName, String categoryDescription){
        super(categoryName,categoryDescription);
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        this.quantity = quantity;
        this.id = Main.currentBookID+1;
        Main.currentBookID+=1;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
