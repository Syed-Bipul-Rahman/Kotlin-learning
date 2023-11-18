fun main() {
    // Arithmetic operators
    val a = 10
    val b = 5
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b
    val remainder = a % b

    println("Sum: $sum")
    println("Difference: $difference")
    println("Product: $product")
    println("Quotient: $quotient")
    println("Remainder: $remainder")

    // Assignment operators
    var x = 10
    x += 5
    println("x: $x")

    // Comparison operators
    val num1 = 10
    val num2 = 5
    val isEqual = num1 == num2
    val isNotEqual = num1 != num2
    val isGreater = num1 > num2
    val isLess = num1 < num2
    val isGreaterOrEqual = num1 >= num2
    val isLessOrEqual = num1 <= num2

    println("Is Equal: $isEqual")
    println("Is Not Equal: $isNotEqual")
    println("Is Greater: $isGreater")
    println("Is Less: $isLess")
    println("Is Greater or Equal: $isGreaterOrEqual")
    println("Is Less or Equal: $isLessOrEqual")

    // Logical operators
    val condition1 = true
    val condition2 = false
    val andResult = condition1 && condition2
    val orResult = condition1 || condition2
    val notResult = !condition1

    println("AND Result: $andResult")
    println("OR Result: $orResult")
    println("NOT Result: $notResult")

    // Increment and decrement operators
    var count = 0
    count++
    println("Count: $count")
    count--
    println("Count: $count")

    // Unary operators
    val number = 5
    val unaryPlus = +number
    val unaryMinus = -number
    val not = !condition1

    println("Unary Plus: $unaryPlus")
    println("Unary Minus: $unaryMinus")
    println("NOT: $not")
}

