fun kaijyo(n: Int): Long {
    var a : Long = 1
    for(i in 2..n)
        a = a * i
    return a
}
fun main(args:Array<String>){
    println(kaijyo(5))
}