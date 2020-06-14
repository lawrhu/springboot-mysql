package com.demo.service.impl;


import com.demo.dao.UserMapper;
import com.demo.domain.param.UserParam;
import com.demo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:hujc
 * @description:
 * @date: 2020/6/14
 */
@Service
@Slf4j
public class DemoServiceImpl implements DemoService {

  @Autowired
  private UserMapper userMapper;

  @Override
  public void addSomeone()  {

    UserParam userParam = new UserParam().setName("1").setAge(1);
    userMapper.insertIntoUser(userParam);

  }
}
