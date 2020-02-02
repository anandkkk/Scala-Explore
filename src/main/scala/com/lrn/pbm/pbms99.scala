package com.lrn.pbm

import com.lrn.pbm.functions._
import com.lrn.pbm.parameters._

object pbms99 extends App {

  val argsIterator = args.iterator

  val onList = argsIterator.next()

  val functionToCall = argsIterator.next()


  val inputlist = onList match{
    case "int" => integerList
    case "string" => stringList
    case _ =>   throw new Exception("Parameter Not Found")
  }

  functionToCall match {
    case "last" => println(findLast(inputlist))
    case _ => throw new Exception("Method Not Found")
  }

}