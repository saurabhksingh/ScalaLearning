package saurabh

import scala.collection.mutable.ArrayBuffer

/**
 *
 * Copyright (c)
 * User: sausingh
 * Date: 30/05/2013
 * Time: 9:50 AM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */
class BasicIntQueue extends IntQueue{

  private val buff = new ArrayBuffer[Int]

  def get() = buff.remove(0);

  def put(x: Int) {buff += x}
}
