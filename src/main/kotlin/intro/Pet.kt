package intro


open class Pet

class Cat : Pet() {
    fun meow() = println("meow")
}

class Dog : Pet() {
    fun woof() = println("woof")
}

fun getMyFavoritePet(): Pet = Cat()

fun main() {
    when (val pet = getMyFavoritePet()) {
        is Cat -> pet.meow()
        is Dog -> pet.woof()
    }
}
