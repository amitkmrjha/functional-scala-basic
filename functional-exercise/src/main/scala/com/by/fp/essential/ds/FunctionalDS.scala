package com.by.fp.essential.ds

import WList.Nil
import WList.Cons

object FunctionalDS:

  val ex1: WList[Double] = WList.Nil
  val ex2: WList[Int]    = WList.Cons(1, WList.Nil)
  val ex3: WList[String] = WList.Cons("a", WList.Cons("b", WList.Nil))

  /*
  Implement the function tail for removing the first element of
  a List (note that the function takes constant time). You can
  use sys.error("message") to throw an exception if the List is
  Nil.
   */
  def tail[A](l: WList[A]): WList[A] = ???

  def setHead[A](l: WList[A], h: A): WList[A] = ???

  /*
  Implement the function drop, which removes the first n
  elements from a list. Dropping n elements from an empty list
  should return the empty list. Note that this function takes time
  proportional only to the number of elements being dropped—
  we don’t need to make a copy of the entire List:
   */
  def drop[A](as: WList[A], n: Int): WList[A] = ???

  /*
  Implement dropWhile, which removes elements from the List
  prefix as long as they match a predicate
   */
  def dropWhile[A](as: WList[A], f: A => Boolean): WList[A] = ???

  def append[A](a1: WList[A], a2: WList[A]): WList[A] =
    a1 match
      case Nil        => a2
      case Cons(h, t) => Cons(h, append(t, a2))

  /*
  Compute the length of a list using foldRight
   */
  def length[A](as: WList[A]): Int = ???

  def foldLeft[A, B](as: WList[A], acc: B, f: (B, A) => B): B = ???

  /*
  Implement append in terms of either foldLeft
   */
  def appendUsingFold[A](a1: WList[A], a2: WList[A]): WList[A] = ???

  /*
  Write a function, map, that generalizes modifying each element
  in a list while maintaining the structure of the list. Here is its
  signature
   */
  def map[A, B](as: WList[A], f: A => B): WList[B] = ???
