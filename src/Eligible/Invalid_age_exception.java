package Eligible;

public class Invalid_age_exception extends  Exception{
    @Override
    public String getMessage() {
        return "Invalid Age";
    }
}
