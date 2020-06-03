package com.demo.controller;

import com.demo.entity.UserEntity;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wwwwei on 17/3/18.
 */
@RequestMapping("/demo")
@Controller
public class UserController {

    @Autowired
    private UserService service;

    /**
     * 这个方式我们已经很少用了。页面的路由跳转，交由 vue 来承担
     * @return
     */
    @Deprecated
    @RequestMapping( value = "route", method = RequestMethod.GET )
    private String route() {
        return "test";
    }

    @RequestMapping( value = "insert", method = RequestMethod.POST )
    private Object insert(UserEntity user ) {
        Integer userId = service.createUser(user);
        return userId;
    }

    @ResponseBody
    @RequestMapping( value = "users", method = RequestMethod.POST )
    private Object users() {
        return service.getUsers();
    }

}
