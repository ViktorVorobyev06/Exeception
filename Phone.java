package Valeriya_Task;

public class Phone {
  private String phoneNumber;

   Phone(String phoneNumber){
     this.phoneNumber=phoneNumber;
   }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String validatePhoneNumber(String phone)throws noValidPhoneNumberException {
      if (phone.length() <= 3 && phone.length() >= 12) {
          throw new noValidPhoneNumberException("Phone number is not valid",phoneNumber);
      }
      return phone;
  }
}
