/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package kt.sample.app

class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main(args: Array<String>) {
    println(App().greeting)
}