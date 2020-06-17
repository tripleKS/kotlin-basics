package com.tasks.executers

import com.tasks.classes.EquilateralTriangle
import com.tasks.classes.IsoscelesTriangle
import com.tasks.classes.Person
import com.tasks.classes.Triangle

fun main() {
    val personNew = Person("Sergey", "?")

    println(personNew)

    val triangle = Triangle(3,4,5)
    println(triangle)

    val triangleI = IsoscelesTriangle(3,4)
    println(triangleI)

    val triangleE = EquilateralTriangle(5)
    println(triangleE)
}

//class OtherClassesRunner {
//}