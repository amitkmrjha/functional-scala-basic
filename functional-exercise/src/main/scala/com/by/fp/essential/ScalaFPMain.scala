package com.by.fp.essential

import com.typesafe.scalalogging.Logger

object ScalaFPMain:

  val log = Logger(getClass.getName)

  @main def hello(): Unit =
    val coffee = getCoffee
    log.info(s"Bought coffee : [${coffee.price}]")

  def getCoffee: Coffee =
    val cc   = CreditCard()
    val cafe = Cafe()
    val cup  = cafe.buyCoffee(cc)
    cup
