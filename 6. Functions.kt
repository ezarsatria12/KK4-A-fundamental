fun main() {
    val user = setUser("Ezar","editing" ,16 )
    println(user)
    printUser("Ezar")
        }
fun setUser(name: String, hobi: String, age: Int) = "My name is $name,I lake $hobi and im $age years old"
fun printUser(name: String) {
}