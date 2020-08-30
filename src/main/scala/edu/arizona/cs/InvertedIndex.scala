package edu.arizona.cs

import InvertedIndex._

//remove if not needed
import scala.collection.JavaConversions._

object InvertedIndex {

  def main(args: Array[String]): Unit = {
    try {
      val fileName: String = "Docs.txt"
      println("********Welcome to  Homework 1!")
      val query: String = "schizophrenia AND drug"
      val objInvertedIndex: InvertedIndex = new InvertedIndex(fileName)
      val ans2: Array[String] = objInvertedIndex.runQ5_2(query)
    } catch {
      case ex: Exception => println(ex.getMessage)

    }
  }

}

class InvertedIndex(var inputFilePath: String) {

  var indexExists: Boolean = false

  def runQ5_1(query: String): Array[String] = {
    val dummy_ans: Array[String] = Array("Doc1", "Doc4")
    dummy_ans
  }

  def runQ5_2(query: String): Array[String] = {
    val dummy_ans: Array[String] = Array("Doc1", "Doc2", "Doc3", "Doc4")
    dummy_ans
  }

  def runQ5_3(query: String): Array[String] = {
    val dummy_ans: Array[String] = Array("Doc1", "Doc2", "Doc4")
    dummy_ans
  }

}
