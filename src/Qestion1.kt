fun whoAmI(value: Any): String {
    return value::class.simpleName ?: "Unknown"
}

fun circleCalculations(radius: Double): Pair<Double, Double> {
    val PI = 3.14
    val circumference = 2 * PI * radius
    val area = PI * radius * radius
    return Pair(circumference, area)
}

fun greetings(name: String, age: Int) {
    println("Hello $name, you are $age years old.")
    if (age >= 18) {
        println("You are eligible to apply for a driving license.")
    } else {
        println("You are not eligible to apply for a driving license.")
    }
}

fun printNames() {
    val names = listOf("Pahan", "Rusith", "Dilum", "Harsha", "Navindu")
    for ((index, name) in names.withIndex()) {
        println("$index: $name")
    }
}