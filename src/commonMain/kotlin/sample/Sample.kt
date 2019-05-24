package sample

expect class Sample() {
    fun checkMe(): Int
}

fun hello(): String = "Hello from ${Platform.name}"