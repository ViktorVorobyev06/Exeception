package Valeriya_Task;

public class Employee {
  private String name;
  private Phone phoneNumber;
  private Position position;

  public Employee(String name,Phone phoneNumber,Position position) {
    this.name=name;
    this.phoneNumber=phoneNumber;
    this.position=position;
  }

  public String getName() {
    return name;
  }

  public Phone getPhoneNumber() {
    return phoneNumber;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public void setPhoneNumber(Phone phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void validatePosition(Position position) throws noValidPositionException {
    Position[] positions=Position.values();
    if(position.getValue()>positions.length){
      throw new noValidPositionException("Не верная позиция",position);
    }
  }

  public void validateName(String name) throws noValidNameException {
    if (name.matches(".*[0-9].*")){
     throw new noValidNameException("Name is not valid",name);
    }
  }
}
