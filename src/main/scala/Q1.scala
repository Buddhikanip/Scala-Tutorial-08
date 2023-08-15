import scala.io.StdIn.readLine

object Q1 extends App(){
  val deposit:Double => Double = deposit => deposit match{
    case x if(x <= 20000) => x *2/100
    case x if(x <= 200000) => x *4/100
    case x if(x <= 2000000) => x *3.5/100
    case _ => interest * 6.5/100
  }
  print("Enter deposit amount : ")
  var interest:Double = readLine().toDouble
  println("Deposit amaount is : " + interest + "\nEarnings : "+ deposit(interest) + "\nTotal : " +(interest+deposit(interest)) )
}

