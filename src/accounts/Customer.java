package accounts;

import inventory.Book;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
    private int creditPoints;
    private final List<Book> boughtBooks;
    public Customer(String firstname, String lastname, String address, int phone) {
        super(firstname, lastname, address, phone);
        this.creditPoints = 0;
        this.boughtBooks = new ArrayList<>();
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(int creditPoints) {
        this.creditPoints = creditPoints;
    }

    public List<Book> getBoughtBooks() {
        return boughtBooks;
    }
}
