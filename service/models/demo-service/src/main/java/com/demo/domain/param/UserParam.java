package com.demo.domain.param;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author:hujc
 * @description:
 * @date: 2020/6/13
 */
@Data
@Accessors(chain = true)
public class UserParam {

  /**
   * 名称
   */
  private String name;

  /**
   * 年龄
   */
  private Integer age;
}
