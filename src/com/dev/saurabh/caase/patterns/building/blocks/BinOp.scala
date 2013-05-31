package com.dev.saurabh.caase.patterns.building.blocks

/**
 *
 * Copyright (c)
 * User: sausingh
 * Date: 31/05/2013
 * Time: 9:16 AM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr