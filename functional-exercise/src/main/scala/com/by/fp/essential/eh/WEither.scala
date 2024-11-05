package com.by.fp.essential.eh

enum WEither[+E, +A]:
  case WLeft(get: E)
  case WRight(get: A)

  def map[B](f: A => B): WEither[E, B] =
    this match
      case WRight(a) => WRight(f(a))
      case WLeft(e) => WLeft(e)

  def flatMap[EE >: E, B](f: A => WEither[EE, B]): WEither[EE, B] =
    this match
      case WLeft(e) => WLeft(e)
      case WRight(a) => f(a)

  def orElse[EE >: E, AA >: A](b: => WEither[EE, AA]): WEither[EE, AA] =
    this match
      case WLeft(_) => b
      case WRight(a) => WRight(a)

  def map2[EE >: E, B, C](b: WEither[EE, B])(f: (A, B) => C): WEither[EE, C] =
    for
      a <- this
      b1 <- b
    yield f(a, b1)
