package com.by.fp

import com.by.fp.essential.cafe.Cafe
import com.typesafe.scalalogging.Logger

object ScalaFPMain:

  val log = Logger(getClass.getName)

  @main def main(): Unit =
    val coffee = Cafe.getCoffee
    log.info(s"Bought coffee : [${coffee.price}]")
