package org.neuedu.his01.controller;


import org.neuedu.his01.model.RespBean;
import org.neuedu.his01.model.User;
import org.neuedu.his01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/getUserByIdAndPass")
    public RespBean getUserByIdAndPass(@RequestBody User user){
        return userService.getUserByIdAndPass(user);
    }
}
