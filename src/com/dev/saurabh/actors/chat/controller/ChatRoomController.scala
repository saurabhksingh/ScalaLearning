package com.dev.saurabh.actors.chat.controller

import scala.actors.{TIMEOUT, Actor}
import com.dev.saurabh.actors.chat.action.{Unsubscribe, Subscribe}
import com.dev.saurabh.actors.chat.model.{Post, User, UserPost}

/**
 *
 * Copyright (c)
 * User: sausingh
 * Date: 02/06/2013
 * Time: 10:58 PM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */

class ChatRoomController extends Actor{

  /*
    Extending the Actor class provides the message handling infrastructure like mailbox to ChatRoomController out-of-the-box
   */

  var session = Map.empty[User, Actor]

  //called when start() on  ChatRoomController instance is called
  def act(){
    //defining the actors behavior
//    while(true){
//      receive{
//        case Subscribe(user)=>      //handle subscriptions
//           val subscriber = sender
//           val sessionUser =
//                actor{
//                  while(true){
//                    self.receiveWithin(1800 * 1000){
//                      case Post(msg)=>  subscriber ! Post(msg)  //send message to sender
//                      case TIMEOUT=>
//                         room ! Unsubscribe(user)
//                         self.exit()
//                    }
//                  }
//                }
//          session += user -> sessionUser
//          reply("Subscribed "+ user)
//        case Unsubscribe(user)=>    //handle unsubscriptions
//        case UserPost(user, post)=> //handle user posts
//          for(key <- session.keys; if key != user){
//            session(key) ! msg
//          }
//      }
//    }
  }

  override def exceptionHandler = {
    case e:Exception =>
       println(e.getMessage)
  }
}
