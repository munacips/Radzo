package inventory;

public class NonFiction extends Category{
    public NonFiction(String name, String description) {
        super(name, description);
    }

    @Override
    public String getDescription(){
        return "This is a nonfiction book";
    }

    @Override
    public String getName(){
        return "NonFiction";
    }
}
