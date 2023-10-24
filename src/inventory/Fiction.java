package inventory;

public class Fiction extends Category {
    public Fiction(String name, String description) {
        super(name, description);
    }

    @Override
    public String getDescription(){
        return "This is a fiction book";
    }

    @Override
    public String getName(){
        return "Fiction";
    }
}
