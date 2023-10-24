package inventory;

public class DuplicateBookException extends Exception{
    public DuplicateBookException(String message){
        super(message);
    }
}
