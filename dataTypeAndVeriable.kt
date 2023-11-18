
fun main() {
    // Integer data types
    val age: Int = 25
    var count: Int = 0

    // Floating-point data types
    val pi: Double = 3.14
    var temperature: Float = 98.6f

    // Boolean data type
    val isTrue: Boolean = true
    var isFalse: Boolean = false

    // Character data type
    val letter: Char = 'A'
    var symbol: Char = '$'

    // String data type
    val name: String = "John Doe"
    var message: String = "Hello, World!"

    // Nullable data types
    val nullableInt: Int? = null
    var nullableString: String? = null

    // Arrays
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    var fruits: Array<String> = arrayOf("Apple", "Banana", "Orange")

    // Lists
    val colors: List<String> = listOf("Red", "Green", "Blue")
    var animals: MutableList<String> = mutableListOf("Dog", "Cat", "Elephant")

    // Maps
    val ages: Map<String, Int> = mapOf("John" to 25, "Jane" to 30)
    var scores: MutableMap<String, Int> = mutableMapOf("Math" to 90, "Science" to 85)

    // Printing variables
    println("Age: $age")
    println("Count: $count")
    println("Pi: $pi")
    println("Temperature: $temperature")
    println("Is True: $isTrue")
    println("Is False: $isFalse")
    println("Letter: $letter")
    println("Symbol: $symbol")
    println("Name: $name")
    println("Message: $message")
    println("Nullable Int: $nullableInt")
    println("Nullable String: $nullableString")
    println("Numbers: ${numbers.contentToString()}")
    println("Fruits: ${fruits.joinToString()}")
    println("Colors: ${colors.joinToString()}")
    println("Animals: ${animals.joinToString()}")
    println("Ages: ${ages.entries.joinToString()}")
    println("Scores: ${scores.entries.joinToString()}")
}
