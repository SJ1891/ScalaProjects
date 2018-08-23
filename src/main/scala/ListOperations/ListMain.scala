package ListOperations

object ListMain {


  def main(args: Array[String]) {
    val list1: List[Int] = List(1, 2, 3, 4)
    ListFunctions.prettyPrintList(list1)
    val list2: List[String] = List("a", "b")
    ListFunctions.prettyPrintList(list2)
    println("Filter even")
    ListFunctions.multiplyByTenEven(list1)
    }
}


