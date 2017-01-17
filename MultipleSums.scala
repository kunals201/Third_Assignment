class Sums
{ 
def sum(s:String,f: (Int, Int) => Int,a: Int, b:Int): Int=f(a,b)   //High order function
}
object MultipleSums extends App 
{
val ms=new Sums
val name="cube function"
name match{
case "square function" =>val sum= ms.sum(name,(l,b)=>l*l+b*b,5,6)
println(s"Sum of Square is $sum")

case "ints function" =>val sum = ms.sum(name,(b,h)=>b+h,5,6)
println(s"Sum of ints is $sum")

case "cube function" =>val sum = ms.sum(name,(b,h)=>b*b*b+h*h*h,5,6)
println(s"Sum of cubes is $sum")

case _ => println("Invalid Input")
}
}
