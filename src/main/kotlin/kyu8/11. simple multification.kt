package codewars

// This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.

fun simpleMultiplication(n: Int): Int {
    return when {
        n % 2 == 0 -> n * 8
        else -> n * 9
    }
}