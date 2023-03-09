import kotlin.math.max
import kotlin.math.min

fun main( ){
    names("loice","jecinta")
   println( nuM(20,97,81,23).contentToString())

    myName("wikipedia")
    println( many().contentToString())
    var cal1=Calculate(20,47,90,32)

   println(cal1.add())
    println(cal1.sub())
    println(cal1.div())
    println(cal1.multiply())


}

fun names(name1:String,name2:String){
   if (name1.length > name2.length)
   {println(name1[0])}
   else if (name2.length > name1.length)
      println(name2[0])
  else (println(name1[0]))
}

fun nuM(num1:Int,num2:Int,num3:Int,num4:Int):Array<Int>{
    var x= arrayOf(num1,num2,num3,num4)
    return arrayOf(x.min())
    return arrayOf(x.max())








}
//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun myName(name:String){
    println( name.split(""))

}
//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun many():Array<String>{
    var x= arrayOf("mary","joanne","lucyanne","rebecca")
    var final=x.plus(arrayOf("maryanne","faith","lucy"))
    return final

}
class Calculate(var num1:Int,var num2:Int,var num3:Int,var num4:Int){
 fun add(){
    println(num1 + num2)

 }
    fun sub(){
     println(num4-num1)
    }
    fun div(){
    println(num3%num1)
    }
    fun multiply(){
   println(num1*num3)
    }
}