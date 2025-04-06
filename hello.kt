fun main() {
    print("Enter your name: ")
    val name = readLine()

    print("Enter your age: ")
    val age = readLine()?.toIntOrNull()

    if (age != null) {
        println("Hello, $name! You are $age years old.")
    } else {
        println("Oops! That doesn't look like a valid age.")
    }
}
