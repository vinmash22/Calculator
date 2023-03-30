package pro.sky.java.course2.calculator;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException (String message){
        super(message);
    }
}
