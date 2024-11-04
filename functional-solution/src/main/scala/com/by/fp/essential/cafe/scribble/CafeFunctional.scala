package com.by.fp.essential.cafe.scribble

import com.typesafe.scalalogging.Logger

class CoffeeF:
  val price: Double = 2.0

class CreditCardF

/*trait PaymentsF:
  def charge(cc: CreditCard, price: Double): Unit

object PaymentsF:
  def apply(): PaymentsF = new SimulatedPaymentsF()

class SimulatedPaymentsF extends PaymentsF:
  val log                                         = Logger(getClass.getName)
  def charge(cc: CreditCard, price: Double): Unit =
    log.info("charging " + price + " to " + cc)*/

case class Charge(cc: CreditCard, amount: Double):
  def combine(other: Charge): Charge =
    if cc == other.cc then Charge(cc, amount + other.amount)
    else throw Exception("Can't combine charges with different cards")


class CafeFunctional:
  def buyCoffee(cc: CreditCard): (Coffee, Charge) =
    val cup = Coffee()
    (cup, Charge(cc, cup.price))

  def buyCoffee(
      cc: CreditCard,
      n: Int
  ): (List[Coffee], Charge) =
    val purchases: List[(Coffee, Charge)] =
      List.fill(n)(buyCoffee(cc))
    val (coffees, charges)                = purchases.unzip
    val reduced                           =
      charges.reduce((c1, c2) => c1.combine(c2))
    (coffees, reduced)

object CafeFunctional:
  def getCoffee: (Coffee, Charge) =
    val cc   = CreditCard()
    val cafe = CafeFunctional()
    cafe.buyCoffee(cc)

  def coalesce(charges: List[Charge]): List[Charge] =
    charges.groupBy(_.cc).values.map(_.reduce((c1, c2) => c1.combine(c2))).toList
