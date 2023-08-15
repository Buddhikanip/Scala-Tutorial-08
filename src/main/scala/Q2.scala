import scala.io.StdIn.readLine

object Q2 extends App(){
  val pattx:Int => String = pattx => pattx match {
    case x if(x<=0) => "Negative/Zero"
    case x if(x%2 == 0) => "Even"
    case _ => "Odd"
  }
  print("Enter a number : ")
  val num = readLine().toInt
  println(num + " is a " + pattx(num) + " number.")
}
