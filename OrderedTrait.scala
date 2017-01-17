
//Ordered Trait 
//class person with two fields name and age
class Person(val name:String,val age:Int) extends Ordered[Person]{
def compare(that:Person)=if(this.name==that.name){
                                                  this.age - that.age
                                                 }
                       else{
                           this.name.length - that.name.length
                           }
                                                                  }


object OrderedTrait extends App{

val personOne=new Person("Himanshu",24)
val personTwo=new Person("Kunal",22)
println(personOne < personTwo)

}
