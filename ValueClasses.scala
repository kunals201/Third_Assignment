class FirstName(val first:String) extends AnyVal
class LastName(val last:String) extends AnyVal
class Age(val age:Int) extends AnyVal
object ValueClasses extends App{

//Display Function
      def displayDetails(a:FirstName,b:LastName,c:Age):String={
                                                              s"${a.first} ${b.last} is of ${c.age} years"
                                                              }
val result=displayDetails(new FirstName("Prashant"),new LastName("Goel"),new Age(25))
println(result)
}
