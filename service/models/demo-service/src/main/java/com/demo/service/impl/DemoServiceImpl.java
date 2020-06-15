package com.demo.service.impl;


import static com.utils.StateCodeEnum.SUCCESS;

import com.demo.dao.UserMapper;
import com.demo.service.DemoService;
import com.exception.CommonException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

//    UserParam userParam = new UserParam().setName("1").setAge(1);
//    userMapper.insertIntoUser(userParam);

    throw new CommonException(HttpStatus.OK, SUCCESS.getCode(),"asdf");
  }
}
