import com.sun.jdi.connect.Connector
//fun main () {
//    for (i in 0..100){
  //      when{
    //        i % 15 == 0 -> println("FizzBuzz")
      //      i % 3 == 0 -> println("Fizz")
        //    i % 5 == 0 -> println("Buzz")
          //  else -> println(i)
        //}
    //}
//}

fun main (){
    for (i in 0..100) {
        if (i % 15 == 0)
            println("FizzBuzz")
        else if (i % 3 == 0)
            println("Fizz")
        else if (i % 5 == 0)
            println("Buzz")
        else
            println(i)
    }
}
