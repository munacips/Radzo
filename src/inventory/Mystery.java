package inventory;

public class Mystery extends Category{
    public Mystery(String name, String description) {
        super(name, description);
    }

    @Override
    public String getDescription(){
        return "This is a mystery book";
    }

    @Override
    public String getName(){
        return "Mystery";
    }
}
