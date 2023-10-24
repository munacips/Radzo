package accounts;

import inventory.Book;
import inventory.Bookstore;

import java.util.List;

public class Administrator extends User{
    private String username;
    private String role;
    private String password;
    private List<Bookstore> bookstores; // need to fix this.

    public Administrator(String firstname, String lastname, String address, int phone, String username, String role, String password) {
        super(firstname, lastname, address, phone);
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addBook(Book book, int BookstoreId){
        for(Bookstore store:bookstores){
            if(store.getId()==BookstoreId){
                store.addBook(book);
            }
        }// what if there is no id
    }

    public void removeBook(Book book, int BookstoreId){
        for(Bookstore store:bookstores){
            if(store.getId()==BookstoreId){
                store.removeBook(book);
            }
        }// what if there is no id
    }
}
