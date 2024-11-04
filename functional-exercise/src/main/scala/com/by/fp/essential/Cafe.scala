package com.by.fp.essential

import com.typesafe.scalalogging.Logger

class Coffee:
  val price: Double = 2.0

class CreditCard:
  val log                         = Logger(getClass.getName)
  def charge(price: Double): Unit =
    log.info("charging " + price)

class Cafe:
  def buyCoffee(cc: CreditCard): Coffee =
    val cup = Coffee()
    cc.charge(cup.price)
    cup

object Cafe:
  def getCoffee: Coffee =
    val cc   = CreditCard()
    val cafe = Cafe()
    val cup  = cafe.buyCoffee(cc)
    cup
