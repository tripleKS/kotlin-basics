package com.tasks.classes

open class Triangle(_a: Int, _b: Int, _c: Int) {
    var a = _a
    var b = _b
    var c = _c

    override fun toString() = "Triangle(a=$a, b=$b, c=$c)"
}

open class IsoscelesTriangle : Triangle {
    private constructor(_a: Int, _b: Int, _c: Int) : super(_a, _b, _c) {
    }

    constructor(_ab: Int, _c: Int) : this(_ab, _ab, _c) {
    }
}

class EquilateralTriangle: IsoscelesTriangle {
    private constructor(_ab: Int, _c: Int) : super(_ab, _c) {
    }

    constructor(_abc: Int) : this(_abc, _abc) {
    }

}
