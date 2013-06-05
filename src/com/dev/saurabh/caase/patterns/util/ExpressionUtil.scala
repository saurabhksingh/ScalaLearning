package com.dev.saurabh.caase.patterns.util

import com.dev.saurabh.caase.patterns.building.blocks._

/**
 *
 * Copyright (c)
 * User: sausingh
 * Date: 31/05/2013
 * Time: 9:35 AM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */
class ExpressionUtil {

  def simplifyTop(expr: Expr):Expr =  expr match {

      case UnOp("-", UnOp("-", e)) => e  //double negation
      case BinOp("+", e, Number(0)) => e //add 0
      case BinOp("+", Number(0), e) => e //add 0
      case BinOp("*", Number(1), e) => e //multiply by 1
      case BinOp("*", e, Number(1)) => e //multiply by 1
      case _ => expr //default case
  }

}
