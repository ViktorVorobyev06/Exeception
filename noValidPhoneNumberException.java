package Valeriya_Task;

public class noValidPhoneNumberException extends Exception{
     noValidPhoneNumberException(String message, String phoneNumber){
         super(message);
     }
}
