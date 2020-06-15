package com.handler;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import com.exception.CommonException;
import com.utils.CommonResult;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author:hujc
 * @description:
 * @date: 2020/6/15
 */
@Slf4j
@RestControllerAdvice
public class LocalExceptionHandler {

  /**
   * 处理自定义异常
   */
  @ExceptionHandler(value = CommonException.class)
  public ResponseEntity<CommonResult> badRequestException(CommonException e) {

    HttpStatus httpStatus;
    if (e.getHttpStatus() == null) {
      httpStatus = INTERNAL_SERVER_ERROR;
    } else {
      httpStatus = e.getHttpStatus();
    }
    CommonResult commonResult = CommonResult.error(e.getResultCode(), ((e.getMessage() != null) ? e.getMessage() : ""));
    log.error("Time {}, Exception {}, CommonResult {}", new Date(), e, commonResult.toString());
    return buildResponseEntity(commonResult, httpStatus);
  }

  /**
   * 统一返回
   */
  private ResponseEntity<CommonResult> buildResponseEntity(CommonResult commonResult,
                                                           HttpStatus httpStatus) {
    return new ResponseEntity<>(commonResult, httpStatus);
  }
}
