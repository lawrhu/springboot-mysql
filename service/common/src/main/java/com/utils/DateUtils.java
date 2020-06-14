package com.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;

/**
 * @author:hujc
 * @description: 定义返回格式实体类
 * @date: 2020/6/14
 */
@Slf4j
public class DateUtils {

  private static String YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";

  private static String YYYYMMDD = "yyyy-MM-dd";

  private static String YYYYMM = "yyyy-MM";


  private static final Pattern PATTERN_DATA_TIME = Pattern.compile(
      "^[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}$");

  private static final Pattern PATTERN_DATA_MONTH = Pattern.compile(
      "^[0-9]{4}-[0-9]{2}$");

  /**
   将日期转为字符串 yyyy-mm-dd HH:mm:ss
   @param date
   @return
   */
  public static String getYYYYMMDDHHMMSS(Date date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(YYYYMMDDHHMMSS);
    LocalDateTime localDateTime = dateToDateTime(date);
    return formatter.format(localDateTime);
  }

  /**
   * 获取当前时间戳:/秒
   * @return
   */
  public static Long getTimestampNow() {
    return LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
  }

  /**
   LocalDateTime 和DateTime 互转
   @param date
   @return
   */
  public static LocalDateTime dateToDateTime(Date date) {
    Instant instant = date.toInstant();
    return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
  }



}