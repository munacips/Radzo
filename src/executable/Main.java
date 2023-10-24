package executable;

import inventory.Bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int currentID = 0;
    public static int currentBookID = 0;
    public static int currentBookstoreId = 0;
    public static int currentCartId = 0;
    public static List<Bookstore> bookstores = new ArrayList<>();
    public static void main(String[] args) {
        boolean quit = false;
        while(!quit){
            System.out.println("________Menu________");
            System.out.println();
            System.out.println("Choose an option [1-7]");
            System.out.println();
            System.out.println("1 : Create bookstore");
            System.out.println("2 : Create a category");
            System.out.println("3 : Create books");
            System.out.println("4 : Manage inventory");
            System.out.println("5 : Create customer");
            System.out.println("6 : Customer shopping");
            System.out.println("7 : Quit");
            System.out.println();
            System.out.print("Option : ");

            Scanner scan = new Scanner(System.in);
            try {
                int option = scan.nextInt();
                System.out.println();
                switch (option){
                    case 1 -> {
                        System.out.print("Enter the location of the bookstore : ");
                        String location = scan.next();
                        bookstores.add(new Bookstore(location));
                        System.out.printf("Bookstore created in %s",location);
                        System.out.println();
                    }
                    case 7 -> {
                        quit = true;
                    }
                }
            } catch (Exception e){
                System.err.println("Only enter number 1 to 7");
            }
        }
    }
}