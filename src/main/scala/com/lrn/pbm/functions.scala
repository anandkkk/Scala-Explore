package com.lrn.pbm

object functions{

  def printHello():Unit = {
    println("Hello")
  }
  def findLast[A](anyList:List[A]): A = {
    return anyList.last
  }

}