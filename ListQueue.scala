/*Make a trait Queue which performs two functions of enqueue and dequque.
Two classes: DoubleQueue and SquareQueue mix in this trait.
You may use List for the implementation and keep both the classes in the same file with proper packaging.

DoubleQueue enqueues the element after doubling them
SquareQueue enqueues the element after squaring them
dequeue method will remove the first element from the queue(having concrete definition in trait Queue).
*/


package com.knoldus.assignment17jan{

trait Queue{
def enqueue(n:Int,list:List[Int]):List[Int]={
list
}
def dequeue(list:List[Int]):List[Int]={
val del=list.head
println(s"Deleted element is $del")
var finalList=for(ls <- 1 to list.length-1) yield list(ls)
//finalList
finalList.toList

}
}
class DoubleQueue extends Queue{
override def enqueue(a:Int,list:List[Int]):List[Int]={
val temp=2*a
val newList=list :+ temp
newList
}
}
class SquareQueue extends Queue{
override def enqueue(a:Int,list:List[Int]):List[Int]={
val temp=a*a
val newList_1=list :+ temp
newList_1
}
}
object ListQueue{
def main(args:Array[String]):Unit={
//DoubleQueue implement
val d=new DoubleQueue
val listOne=List(1,2,3)
val s=new SquareQueue
val finalList_1=d.dequeue(listOne)
println(finalList_1)
val finalList_2=d.enqueue(10,listOne)
println(finalList_2)
//SquareQueue implement
val listTWo=List(4,5,6)
val finalList_3=s.dequeue(listOne)
println(finalList_3)
val finalList_4=s.enqueue(20,listOne)
println(finalList_4)
}
}
}
