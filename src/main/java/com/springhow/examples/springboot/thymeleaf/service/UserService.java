package com.springhow.examples.springboot.thymeleaf.service;

import com.springhow.examples.springboot.thymeleaf.domain.entities.UserInfo;
import com.springhow.examples.springboot.thymeleaf.domain.repositories.UserInfoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserInfoRepository userInfoRepository;

  public UserService(UserInfoRepository userInfoRepository) {
    this.userInfoRepository = userInfoRepository;
  }

  public List<UserInfo> getUsers() {
    return userInfoRepository.findAll();
  }

  public UserInfo createUser(UserInfo userInfo) {
    return userInfoRepository.save(userInfo);
  }

}
