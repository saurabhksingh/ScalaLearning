package saurabh

/**
 *
 * Copyright (c)
 * User: sausingh
 * Date: 07/06/2013
 * Time: 5:30 PM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */
class Point2D(x:Int, y:Int) {

  def move(dx:Int, dy:Int):Unit = {
    x += dx;
    y += dy;
  }

  override def hashcode(): Int = y + 31*x

  def canEqual(that:AnyRef):Boolean =  that match {
      case p:Point2D =>
        true;

      case _ =>
        false;
  }

  override def equals(that: AnyRef): Boolean =  {
    def strictEquals(other: Point2D):Boolean = {
      other.x == this.x && other.y == this.y
    }

    that match{
        case a:AnyRef if this eq a  => true
        case p:Point2D  => (p canEqual this) && strictEquals(p)
        case _  => false
    }
  }

}
