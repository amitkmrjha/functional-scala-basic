package com.by.fp.essential.eh

object ErrorHandling :
  def lift[A, B](f: A => B): Option[A] => Option[B] = ???

  def map2[A, B, C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] = ???

  def sequence[A](as: List[Option[A]]): Option[List[A]] = ???
