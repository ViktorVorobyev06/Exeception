package Valeriya_Task;

public class noValidPositionException extends Exception{
    noValidPositionException(String message, Position position){
        super(message);
    }
}
