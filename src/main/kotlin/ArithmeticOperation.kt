fun main(args: Array<String>) {
    var i = 15
    var j = 4

    println(i + j) // 19
    println(i - j) // 11
    println(i * j) // 60
    println(i.toFloat() / j) // 3.75

    if(i > j){
        println("${i} is greater than ${j}")
    }
    else{
        println("${j} is greater than ${i}")
    }
}