package com.demo.controller;

import com.demo.service.DemoService;
import com.exception.CommonException;
import com.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:hujc
 * @description:
 * @date: 2020/6/13
 */
@RestController
public class DemoController {

  @Autowired
  private DemoService demoService;

  @GetMapping(value = "/testDemo")
  public CommonResult testDemo(){

    demoService.addSomeone();
    return CommonResult.ok("111");
  }
}
