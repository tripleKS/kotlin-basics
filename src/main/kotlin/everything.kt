import kotlin.random.Random

private val s = "12"

fun main(args: Array<String>) {
    println("Hello there.")

    val s1: String
    var vg2: Int

    val a1 = 12L
    val a2 = 13

    val f1 = if(a1>a2) 3 else 5

    println("kl $f1")

    if(12 > 15){
        println("Hello")
    } else{
        println("Goodby")
    }

    val r1 = Random
    val a = r1.nextInt()

    when(a){
        0 -> println(0)
        1100 -> println(1100)
        in 0..1100 -> println("OK")
        else -> println("hard to guess")
    }

    val aq = arrayOf(1..10)

    for(it in 10..12)
        println("$it")

    val arr1 = 10.rangeTo(12).toList().toTypedArray()
    for(i in arr1.indices){
        println("index and value ${i} ${arr1[i]}")
    }

    myFun("12")
}

fun myFun(param1:String) = println(param1)