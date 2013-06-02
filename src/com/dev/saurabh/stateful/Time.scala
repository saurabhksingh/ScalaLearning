package com.dev.saurabh.stateful

/**
 *
 * Copyright (c)
 * User: sausingh
 * Date: 01/06/2013
 * Time: 12:53 PM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */
class Time {

  private[this] var h = 12
  private[this] var m = 0

  def hour: Int = h
  def hour_=(x:Int) {
    require(0<=x && x<24)
    h=x
  }

  def minute: Int = m;
  def minute_=(x:Int) {
    require(0<=x && x<60)  //'require' translates to IllegalStateException if the value does not meet the condition
    m=x
  }

}
