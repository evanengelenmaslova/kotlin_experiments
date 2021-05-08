package nl.vintik.kotlin.examples.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * Coroutines are light and super fast
 */
fun launchCoroutines() {
    val time = measureTimeMillis {
        runBlocking {
            repeat(100_000) { // launch a lot of coroutines
                launch {
                    delay(1L)
                    print('.')
                }
            }
        }
    }
    print("coroutine time $time")
}

/**
 * uses significantly more memory
 */
fun launchThreads() {
    val time = measureTimeMillis {
        for (i in 1..100000) {
            Thread {
                Thread.sleep(1)
                print('.')
            }.run()
        }
    }
    print("thread time $time")
}

fun main() = runBlocking { // this: CoroutineScope
    launchCoroutines()
}
