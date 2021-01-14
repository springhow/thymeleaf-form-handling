package com.springhow.examples.springboot.thymeleaf.domain.repositories;

import com.springhow.examples.springboot.thymeleaf.domain.entities.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

}
