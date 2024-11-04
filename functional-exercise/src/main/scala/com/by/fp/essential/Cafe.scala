package com.by.fp.essential

class Coffee:
  val price: Double = 2.0

class CreditCard:
  def charge(price: Double): Unit =
    println("charging " + price)

class Cafe:
  def buyCoffee(cc: CreditCard): Coffee =
    val cup = Coffee()
    cc.charge(cup.price)
    cup

val cc   = CreditCard()
val cafe = Cafe()
val cup  = cafe.buyCoffee(cc)
