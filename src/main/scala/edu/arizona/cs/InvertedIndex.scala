package edu.arizona.cs

import InvertedIndex._
import scala.io.Source
//remove if not needed
import scala.collection.JavaConversions._

object InvertedIndex {

  def main(args: Array[String]): Unit = {
    val fileName: String = "Docs.txt"
    println("********Welcome to  Homework 1 Qn 5!")
    val objInvertedIndex: InvertedIndex = new InvertedIndex(fileName)
    while (true) {
      val qn = scala.io.StdIn.readLine("Which one of the 3 sub questions would you like to test. " +
        "Press 1 for qn1, 2 for qn2 and 3 for qn 3. 0 to exit: ")
      val qn_int = qn.toInt
      if (qn_int == 1) {
        val query = scala.io.StdIn.readLine("Enter query to process: ")
        //val ans1 = objInvertedIndex.runQ5_1(query)
      }
    }
  }
}



class InvertedIndex(var inputFilePath: String) {
  var indexExists = false
  def buildIndex(): Unit = {
    if(! indexExists) buildIndex()
      val source = Source.fromResource(inputFilePath)
      for (line <- source.getLines()) {
        println(line)
        // create index with the data
      }

    source.close()
    indexExists = true

  }

  def runQ5_1(query: String): Array[String] = {
    if(! indexExists) buildIndex()
    val dummy_ans: Array[String] = Array("Doc1", "Doc4")
    dummy_ans
  }

  def runQ5_2(query: String): Array[String] = {
    if(! indexExists) buildIndex()
    val dummy_ans: Array[String] = Array("Doc1", "Doc2", "Doc3", "Doc4")
     dummy_ans
  }

  def runQ5_3(query: String): Array[String] = {
    if(! indexExists) buildIndex()
    val dummy_ans: Array[String] = Array("Doc1", "Doc2", "Doc4")
     dummy_ans
  }




}
