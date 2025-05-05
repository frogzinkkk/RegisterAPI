package dev.frogzin.RegisterAPI;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_users_registration")
public class UserModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String Name;
  private int age;
  private String address;
  private String phone;

  public UserModel() {
  }

  public UserModel(String name, int age, String adress, String phone) {
    this.Name = name;
    this.age = age;
    this.address = adress;
    this.phone = phone;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
