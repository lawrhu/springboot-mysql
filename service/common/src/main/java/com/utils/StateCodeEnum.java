package com.utils;

/**
 * @author:hujc
 * @description:
 * @date: 2020/6/15
 */
public enum StateCodeEnum {

  SUCCESS(200, "操作成功"),
  ERROR(500, "操作失败");

  /**
   * 状态码
   */
  private final Integer code;

  /**
   * 错误信息
   */
  private final String message;


  StateCodeEnum(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

  public Integer getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }
}
