package com.utils;

/**
 * @author:hujc
 * @description:
 * @date: 2020/6/8
 */
public class Pairs<T1, T2> {

  private final T1 fst;
  private final T2 snd;

  public Pairs(T1 fst, T2 snd) {
    this.fst = fst;
    this.snd = snd;
  }
}
