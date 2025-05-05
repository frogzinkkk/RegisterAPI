package dev.frogzin.RegisterAPI.Tasks;


import dev.frogzin.RegisterAPI.Users.UserController;
import dev.frogzin.RegisterAPI.Users.UserModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_tasks")
public class TaskModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String difficulty;
  private String target;

  @OneToMany(mappedBy = "task")
  private List<UserModel> user;






}
