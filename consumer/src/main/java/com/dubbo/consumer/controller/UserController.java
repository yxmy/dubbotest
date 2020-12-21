package com.dubbo.consumer.controller;

import com.dubbo.api.bean.UserInfoBean;
import com.dubbo.consumer.service.AnnotateConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author seeyon_yuanxin
 */
@RestController
@RequestMapping(value = "/consumer/user")
public class UserController {

    private final AnnotateConsumerService annotateConsumerService;
    @Autowired
    public UserController (AnnotateConsumerService annotateConsumerService) {
        this.annotateConsumerService = annotateConsumerService;
    }

    @GetMapping (value = "getUser/{id}")
    public String getUser(@PathVariable(value = "id") int id){
        return annotateConsumerService.getUser(id);
    }

    @PostMapping (value = "createUser", produces = "application/json")
    public String createUser(@RequestBody UserInfoBean userInfo){
        return this.annotateConsumerService.createUserInfo(userInfo);
    }

    @PutMapping (value = "updateUser", produces = "application/json")
    public String updateUser(@RequestBody UserInfoBean userInfo){
        return this.annotateConsumerService.updateUserInfo(userInfo);
    }

    @DeleteMapping (value = "deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        return this.annotateConsumerService.deleteUserInfo(id);
    }
}
