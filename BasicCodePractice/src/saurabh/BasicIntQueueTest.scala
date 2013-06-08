package saurabh

import junit.framework.TestCase
import junit.framework.Assert.assertEquals

/**
 *
 * Copyright (c)
 * User: sausingh
 * Date: 30/05/2013
 * Time: 10:26 AM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */
class BasicIntQueueTest extends TestCase{

  def testUniformElement(){

    val basicIntQueue:BasicIntQueue = new BasicIntQueue
    basicIntQueue.put(10)
    basicIntQueue.put(20)

    assertEquals(basicIntQueue.get(), 10)
    assertEquals(basicIntQueue.get(), 20)
  }
}
