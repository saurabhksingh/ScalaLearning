package com.dev.saurabh

/**
 *
 * Copyright (c)
 * User: sausingh
 * Date: 28/05/2013
 * Time: 3:14 PM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */
object ArrayElementTest {

  def main(args: Array[String]){

    val el: Element = new ArrayElement(Array("Hello", "World"))

    println("Height : "+el.height + " and Width : "+el.width)

    assert(el.height == 2)
    assert(el.width == "Hello".length)

    println("Asserts passed")
  }
}
