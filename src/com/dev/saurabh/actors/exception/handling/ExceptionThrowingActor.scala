package com.dev.saurabh.actors.exception.handling

import scala.actors.Actor

/**
 *
 * Copyright (c)
 * User: sausingh
 * Date: 05/06/2013
 * Time: 11:52 AM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */
object ExceptionThrowingActor extends Actor{

  def act() {
    react{
      case 'hello =>
        throw new Exception("Error !!")
    }
  }

  override def exceptionHandler = {
    case e:Exception  =>
      println(e.getMessage)
  }
}
