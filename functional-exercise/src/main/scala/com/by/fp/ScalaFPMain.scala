package com.by.fp

import com.by.fp.essential.cafe.Cafe
import com.by.fp.essential.hof.HigherOrderFunction
import com.typesafe.scalalogging.Logger

object ScalaFPMain:

  val log = Logger(getClass.getName)

  @main def main(): Unit =
    // cafe
    val coffee = Cafe.getCoffee
    log.info(s"Bought coffee : [${coffee.price}]")

    // tail recursion
    // val factorial5 = TailRecursion.factorial(5)
    // log.info(s"Factorial of 5 is : [$factorial5]")

    // higher order function
