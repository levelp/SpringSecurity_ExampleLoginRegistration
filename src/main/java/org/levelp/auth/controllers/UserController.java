package org.levelp.auth.controllers;

import org.levelp.auth.dto.UserDTO;
import org.levelp.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Anastasiya Solodkaya.
 */
@Controller
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/register")
    public ModelAndView register() {
        return new ModelAndView("register", "user", new UserDTO());
    }

    @RequestMapping("/do_register")
    public ModelAndView do_register(@ModelAttribute("user") UserDTO user) {
        service.register(user);
        return new ModelAndView("redirect:signin");
    }

    @RequestMapping("/signin")
    public String signin() {
        return "login";
    }

    @RequestMapping("/data")
    public ModelAndView data() {
        String username = ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
        return new ModelAndView("data", "username", username);
    }
}
