package com.dev.saurabh.util

/**
 *
 * Copyright (c)
 * User: sausingh
 * Date: 31/05/2013
 * Time: 6:35 PM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */
class SortingUtil {

  //merge sort
  def msort[T](less:(T,T)  => Boolean)
              (xs: List[T]): List[T] = {

    def merge(xs: List[T], ys: List[T]): List[T] =
      (xs, ys) match {
          case (Nil, _) => ys

          case (_, Nil) => xs

          case (x::xs1, y :: ys1) =>
            if(less(x,y)) x::merge(xs1,ys)
            else y::merge(xs, ys1)
      }

    val n = xs.length >> 1;
    if(n == 0) xs
    else {
      val (ys, zs) = xs splitAt(n)
      merge(msort(less)(ys), msort(less)(zs))
    }
  }
}
