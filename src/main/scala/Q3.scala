import scala.io.StdIn.readLine

object Q3 extends App(){


  var toUpper: String => String =  toUpper => toUpper.toUpperCase()
  var toLower: String => String = toLower => toLower.toLowerCase()
  var formatNames :(String, String => String) => String = (name,fn) => fn(name)
  //  def cus(name: String) = toUpper(name.substring(0, 2)) + name.substring(2)

  print("Enter names : ") //Benny,Niroshan,Saman,Kumara
  val names:List[String] = readLine().split(",").toList

  println(formatNames(names(0),toUpper))
  println(formatNames(names(1),(name: String) => toUpper(name.substring(0, 2)) + name.substring(2)))
  println(formatNames(names(2),toLower))
  println(formatNames(names(3),(name: String) => name.substring(0, name.length() - 1) + toUpper(name.substring(name.length() - 1, name.length()))))
}
