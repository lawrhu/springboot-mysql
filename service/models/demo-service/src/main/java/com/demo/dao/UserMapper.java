package com.demo.dao;

import com.demo.domain.param.UserParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author:hujc
 * @description:
 * @date: 2020/6/14
 */
@Mapper
@Component
public interface UserMapper {

  void insertIntoUser(UserParam param);
}
