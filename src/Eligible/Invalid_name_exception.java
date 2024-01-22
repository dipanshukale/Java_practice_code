package Eligible;

public class Invalid_name_exception extends Exception{
    @Override
    public String getMessage() {
        return "Invalid Name";
    }
}
