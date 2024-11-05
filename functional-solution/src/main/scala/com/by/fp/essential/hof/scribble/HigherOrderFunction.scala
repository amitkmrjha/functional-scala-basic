package com.by.fp.essential.hof.scribble

object HigherOrderFunction:

  // can we abstarct line number 10 in above program
  // (x: Int) => x == 9
  def findFirstHof(ss: Array[String], p: String => Boolean): Int =
    @annotation.tailrec
    def loop(n: Int): Int =
      if n >= ss.length then -1
      else if p(ss(n)) then n
      else loop(n + 1)

    loop(0)
