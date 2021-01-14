package com.springhow.examples.springboot.thymeleaf.controllers;

import com.springhow.examples.springboot.thymeleaf.domain.entities.UserInfo;
import com.springhow.examples.springboot.thymeleaf.service.UserService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String getUsers(Model model) {
    List<UserInfo> users = userService.getUsers();
    model.addAttribute("users", users);
    model.addAttribute("userInfo", new UserInfo());
    return "users";
  }

  @RequestMapping(value = "/", method = RequestMethod.POST)
  public String createUser(Model model, @ModelAttribute UserInfo userInfo) {
    UserInfo user = userService.createUser(userInfo);
    return "redirect:/users/";
  }
}
