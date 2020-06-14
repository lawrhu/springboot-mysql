package com.demo.controller;

import com.demo.service.DemoService;
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
  public String testDemo(){

    demoService.addSomeone();
    return "hi";
  }
}
