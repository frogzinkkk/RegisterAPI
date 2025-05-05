package dev.frogzin.RegisterAPI;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {


    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome!!!";
    }



}
