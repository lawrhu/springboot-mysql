package com.exception;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * @author:hujc
 * @description:
 * @date: 2020/6/14
 */
@NoArgsConstructor
public class CommonException extends Exception {

  private HttpStatus httpStatus;

  private Integer resultCode;

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }

  public Integer getResultCode() {
    return resultCode;
  }

  public CommonException(String message) {
    super(message);
  }

  public CommonException(HttpStatus httpStatus, Integer resultCode) {
    this.httpStatus = httpStatus;
    this.resultCode = resultCode;
  }

  public CommonException(HttpStatus httpStatus, Integer resultCode, String message) {
    super(message);
    this.httpStatus = httpStatus;
    this.resultCode = resultCode;
  }

  public CommonException(String message, Integer resultCode) {
    super(message);
    this.resultCode = resultCode;
  }

  public CommonException(String message, HttpStatus httpStatus) {
    super(message);
    this.httpStatus = httpStatus;
  }
}
