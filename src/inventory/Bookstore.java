package inventory;

import accounts.Administrator;
import executable.Main;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private final List<Book> books;
    private final List<Administrator> administrators;
    private final int id;
    private String location;
    public Bookstore(String location){
        this.location = location;
        this.books = new ArrayList<>();
        this.administrators = new ArrayList<>();
        this.id = Main.currentBookstoreId+1;
        Main.currentBookstoreId+=1;
    }

    public int getId() {
        return id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void removeBook(Book book){
        if(books.contains(book)){
            this.books.remove(book);
        } else {
            System.out.printf("the book %s is not in this bookstore",book.getTitle());
        }
    }

    public List<Book> searchByTitle(String title) throws BookNotFoundException {
        List<Book> result = new ArrayList<>();
        for(Book book:books){
            if(book.getTitle().contains(title)){
                result.add(book);
            }
        }
        if(result.size()==0){
            System.out.printf("No book with title %s",title);
            throw new BookNotFoundException("No such book with title: " + title +" in this bookstore");
        }
        return result;
    }

    public List<Book> searchByAuthor(String author){
        List<Book> result = new ArrayList<>();
        for(Book book:books){
            if(book.getAuthor().contains(author)){
                result.add(book);
            }
        }
        if(result.size()==0){
            System.out.printf("No book written by such author %s",author);
        }
        return result;
    }

    public List<Administrator> getAdministrators() {
        return administrators;
    }
}
