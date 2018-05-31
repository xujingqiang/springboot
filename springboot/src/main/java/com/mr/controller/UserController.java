package com.mr.controller;

import com.mr.model.User;
import com.mr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/5/30.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("toMain")
    public String toMain(ModelMap map){
        List<User> user = userService.selectUser();
        map.put("user",user);
        return "main";
    }

    @DeleteMapping(value = "/user/{id}")
    public String del(@PathVariable Integer id){
        userService.delUserById(id);
        return "redirect:/toMain";
    }

    @RequestMapping("add")
    public String add(){
        return "add";
    }
    @PostMapping("user")
    public String add(User user){
        userService.inserUser(user);
        return "redirect:/toMain";
    }

    @GetMapping("update/{id}")
    public String update(@PathVariable("id") Integer id,ModelMap map){
        User user = userService.updateByUserId(id);
        map.put("user",user);
        return "update";
    }

    @PutMapping("/user")
    public String user(User user){
        userService.update(user);
        return "redirect:/toMain";
    }
}
