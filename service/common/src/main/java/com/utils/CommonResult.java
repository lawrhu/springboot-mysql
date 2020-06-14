package com.utils;

import com.constants.ResultBodyConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.http.HttpStatus;
import org.springframework.util.Assert;

/**
 * @author:hujc
 * @description: 定义返回格式实体类
 * @date: 2020/6/14
 */
@Data
@Accessors(chain = true)
public class CommonResult<T> {

  /**
   * http状态码
   */
  @JsonIgnore
  private Integer httpStatus;
  /**
   * 返回结果码
   */
  private Integer resultCode;

  /**
   * data内容
   */
  private T data;

  /**
   * 附带message信息，错误信息、异常信息等
   */
  private String resultMessage;

  /**
   * 调用时间 13位时间戳
   */
  private Long currentTime;


  /**
   * 不带参数的返回成功样式
   */
  public static CommonResult ok() {
    return new CommonResult()
        .setResultMessage(ResultBodyConstants.RESULT_SUCCESS_MESSAGE)
        .setCurrentTime(DateUtils.getTimestampNow())
        .setResultCode(ResultBodyConstants.SUCCESS_CODE);
  }

  /**
   * 附带一个message的返回成功样式
   */
  public static CommonResult ok(String resultMessage) {
    return new CommonResult()
        .setResultCode(ResultBodyConstants.SUCCESS_CODE)
        .setCurrentTime(DateUtils.getTimestampNow())
        .setResultMessage(resultMessage);
  }

  /**
   * 带body体的返回成功样式
   */
  public static <T> CommonResult<T> ok(T data) {
    Assert.notNull(data, "Data must not be null");
    return new CommonResult<T>()
        .setData(data)
        .setResultMessage(ResultBodyConstants.RESULT_SUCCESS_MESSAGE)
        .setCurrentTime(DateUtils.getTimestampNow())
        .setResultCode(ResultBodyConstants.SUCCESS_CODE);
  }

  /**
   * 带message参数的返回错误样式
   */
  public static CommonResult error(String resultMessage) {
    return new CommonResult()
        .setResultCode(ResultBodyConstants.ERROR_CODE)
        .setResultMessage(resultMessage);

  }

  /**
   * 带resultcode和错误信息的返回错误样式
   */
  public static CommonResult error(Integer resultCode, String resultMessage) {
    return new CommonResult()
        .setHttpStatus(HttpStatus.OK.value())
        .setResultCode(resultCode)
        .setCurrentTime(DateUtils.getTimestampNow())
        .setResultMessage(resultMessage);
  }

  /**
   * 带httpstatus和resultcode和错误信息的返回错误样式
   */
  public static CommonResult error(Integer httpStatus, Integer resultCode, String resultMessage) {
    return new CommonResult()
        .setHttpStatus(httpStatus)
        .setResultCode(resultCode)
        .setCurrentTime(DateUtils.getTimestampNow())
        .setResultMessage(resultMessage);
  }

}
