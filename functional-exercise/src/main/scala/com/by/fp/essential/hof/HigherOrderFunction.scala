package com.by.fp.essential.hof

object HigherOrderFunction:

  // find first - monomorphic
  def findFirst(ss: Array[String], key: String): Int =
    @annotation.tailrec
    def loop(n: Int): Int =
      if n >= ss.length then -1
      else if ss(n) == key then n
      else loop(n + 1)

    loop(0)

//can we abstarct line number 10 in above program
  def findFirstHof(ss: Array[String], key: String): Int = ???

  def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean = ???

  def partial1[A, B, C](a: A, f: (A, B) => C): B => C =
    (b: B) => ???

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = ???

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = ???

  def compose[A, B, C](f: B => C, g: A => B): A => C = ???
