package com.exception;

import com.utils.StateCodeEnum;
import org.springframework.http.HttpStatus;

/**
 * @author:hujc
 * @description:
 * @date: 2020/6/14
 */
public class CommonException extends RuntimeException {

  private HttpStatus httpStatus;

  private Integer resultCode;

  private String message;

  public CommonException() {
  }

  public CommonException(String message) {
    this.message = message;
  }

  public CommonException(Integer resultCode, String message) {
    this.resultCode = resultCode;
    this.message = message;
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(HttpStatus httpStatus) {
    this.httpStatus = httpStatus;
  }

  public Integer getResultCode() {
    return resultCode;
  }

  public void setResultCode(Integer resultCode) {
    this.resultCode = resultCode;
  }

  @Override
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CommonException(StateCodeEnum stateCodeEnum) {
    this.resultCode = stateCodeEnum.getCode();
    this.message = stateCodeEnum.getMessage();
  }

  public CommonException(HttpStatus httpStatus, Integer resultCode, String message) {
    this.httpStatus = httpStatus;
    this.resultCode = resultCode;
    this.message = message;
  }
}
