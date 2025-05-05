package dev.frogzin.RegisterAPI.Users;

import dev.frogzin.RegisterAPI.Tasks.TaskModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_users")
public class UserModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String Name;

  private int age;

  private String address;

  private String phone;

  @ManyToOne()
  @JoinColumn(name = "task_id") // Foreing Key
  private TaskModel task;


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
