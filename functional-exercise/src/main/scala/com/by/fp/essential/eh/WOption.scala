package com.by.fp.essential.eh

enum WOption[+A]:
  case WSome(get: A)
  case WNone

  def map[B](f: A => B): WOption[B] = this match
    case WNone => WNone
    case WSome(a) => WSome(f(a))

  def getOrElse[B >: A](default: => B): B = this match
    case WNone => default
    case WSome(a) => a

  def flatMap[B](f: A => WOption[B]): WOption[B] =
    map(f).getOrElse(WNone)

  /* Of course, we can also implement `flatMap` with explicit pattern matching. */
  def flatMap_1[B](f: A => WOption[B]): WOption[B] = this match
    case WNone => WNone
    case WSome(a) => f(a)

  def orElse[B >: A](ob: => WOption[B]): WOption[B] =
    map(WSome(_)).getOrElse(ob)

  /* Again, we can implement this with explicit pattern matching. */
  def orElse_1[B >: A](ob: => WOption[B]): WOption[B] = this match
    case WNone => ob
    case _ => this

  def filter(f: A => Boolean): WOption[A] = this match
    case WSome(a) if f(a) => this
    case _ => WNone

  /* This can also be defined in terms of `flatMap`. */
  def filter_1(f: A => Boolean): WOption[A] =
    flatMap(a => if f(a) then WSome(a) else WNone)

object WOption
  
