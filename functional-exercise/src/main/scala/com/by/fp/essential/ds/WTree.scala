package com.by.fp.essential.ds

enum WTree[+A]:
  case Leaf(value: A)                          extends WTree[A]
  case Branch(left: WTree[A], right: WTree[A]) extends WTree[A]
