package com.by.fp.essential.cafe.scribble

import com.typesafe.scalalogging.Logger

class Coffee:
  val price: Double = 2.0

class CreditCard

trait Payments:
  def charge(cc: CreditCard, price: Double): Unit
object Payments:
  def apply(): Payments = new SimulatedPayments()

class SimulatedPayments extends Payments:
  val log                                         = Logger(getClass.getName)
  def charge(cc: CreditCard, price: Double): Unit =
    log.info("charging " + price + " to " + cc)

class CafeTestable:
  def buyCoffee(cc: CreditCard, p: Payments): Coffee =
    val cup = Coffee()
    p.charge(cc, cup.price)
    cup

object CafeTestable:
  def getCoffee: Coffee =
    val cc   = CreditCard()
    val p    = Payments()
    val cafe = CafeTestable()
    val cup  = cafe.buyCoffee(cc, p)
    cup
