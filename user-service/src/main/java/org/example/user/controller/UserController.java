package org.example.user.controller;

import org.example.user.pojo.User;
import org.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    @ResponseBody
    public User getUserId(@PathParam("id") Long id){
//        User test = new User();
//        test.setName("test");
//        return test;
        return userService.getUserById(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
