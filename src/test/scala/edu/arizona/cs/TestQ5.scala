package edu.arizona.cs

import java.util.List

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertEquals

//remove if not needed
import scala.collection.JavaConversions._

class TestQ5 {

  @Test
  def testQ5_1(): Unit = {
    val inputFileFullPath: String = "src/main/resources/Docs.txt"
    try {
      val query: String = "schizophrenia AND drug"
      val objInvertedIndex: InvertedIndex = new InvertedIndex(
        inputFileFullPath)
      val ans_q5_1: Array[String] = objInvertedIndex.runQ5_1(query)
      val doc_names_q1: Array[String] = Array("Doc1", "Doc4")
      var counter1: Int = 0
      assertEquals((doc_names_q1.length), ans_q5_1.length)
      for (docs <- ans_q5_1) {
        assertEquals(doc_names_q1(counter1), ans_q5_1(counter1))
        counter1 = counter1 + 1
      }
    } catch {
      case ex: java.io.FileNotFoundException => println(ex.getMessage)

      case ex: java.io.IOException => println(ex.getMessage)

    }
  }

  @Test
  def testQ5_2(): Unit = {
    val inputFileFullPath: String = "src/main/resources/Docs.txt"
    try {
      val query: String = "breakthrough OR new"
      val objInvertedIndex: InvertedIndex = new InvertedIndex(
        inputFileFullPath)
      val ans_q5_2: Array[String] = objInvertedIndex.runQ5_2(query)
      val doc_names_q2: Array[String] = Array("Doc1", "Doc2", "Doc3", "Doc4")
      var counter1: Int = 0
      assertEquals((doc_names_q2.length), ans_q5_2.length)
      for (docs <- ans_q5_2) {
        assertEquals(doc_names_q2(counter1), ans_q5_2(counter1))
        counter1 = counter1 + 1
      }
    } catch {
      case ex: java.io.FileNotFoundException => println(ex.getMessage)

      case ex: java.io.IOException => println(ex.getMessage)

    }
  }

  @Test
  def testQ5_3(): Unit = {
    val inputFileFullPath: String = "src/main/resources/Docs.txt"
    try {
      val query: String = "(drug OR treatment) AND schizophrenia"
      val objInvertedIndex: InvertedIndex = new InvertedIndex(
        inputFileFullPath)
      val ans_q5_3: Array[String] = objInvertedIndex.runQ5_3(query)
      val doc_names_q3: Array[String] = Array("Doc1", "Doc2", "Doc4")
      var counter1: Int = 0
      assertEquals((doc_names_q3.length), ans_q5_3.length)
      for (docs <- ans_q5_3) {
        assertEquals(doc_names_q3(counter1), ans_q5_3(counter1))
        counter1 = counter1 + 1
      }
    } catch {
      case ex: java.io.FileNotFoundException => println(ex.getMessage)

      case ex: java.io.IOException => println(ex.getMessage)

    }
  }

}
