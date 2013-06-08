package saurabh

/**
 *
 * Copyright (c)
 * User: sausingh
 * Date: 28/05/2013
 * Time: 2:47 PM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */
abstract class Element {

  def contents : Array[String]

  def height: Int  = contents.length;
  def width: Int = if(height == 0) 0 else contents(0).length
}
