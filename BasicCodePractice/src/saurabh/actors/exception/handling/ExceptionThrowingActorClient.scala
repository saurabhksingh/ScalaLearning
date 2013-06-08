package saurabh.actors.exception.handling

/**
 *
 * Copyright (c)
 * User: sausingh
 * Date: 05/06/2013
 * Time: 11:55 AM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */
object ExceptionThrowingActorClient {

  def main(args:Array[String]){
    ExceptionThrowingActor.start();
    ExceptionThrowingActor ! 'hello
  }
}
