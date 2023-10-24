package executable;

import inventory.Book;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final int id;
    private int customerID;
    private int storeID;
    private int sellerID;
    private final List<Book> books;
    private double totalCost;

    public Cart(int customerID, int storeID, int  sellerID){
        this.books = new ArrayList<>();
        this.customerID = customerID;
        this.storeID = storeID;
        this.sellerID = sellerID;
        this.totalCost = 0;
        this.id = Main.currentCartId+1;
        Main.currentCartId+=1;
    }

    public int getId() {
        return id;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        this.books.add(book); // quantities
        this.totalCost += book.getPrice();
    }
}
