

enum class ALGORITHMS {
    RECURSIVE,
    LOOP
}


/**
 * use recursive
 * Disadvantage: maybe appear [StackOverflowError] if N too big
 */
@Deprecated("""
    Use countPromotionalCocaCola2 instead of it
""")
fun countPromotionalCocaCola(N: Long, count: Long = 0): Long {
    val x = N
    if (x < 3) {
        return count
    } else {
        return countPromotionalCocaCola(N / 3 + N % 3, count + N/3)
    }
}

/**
 * Use loop for super large N
 */
fun countPromotionalCocaCola2(N: Long): Long {
    var n = N
    var count = 0L
    var x = N
    while (x >= 3) {
        x = n / 3 + n % 3
        count += n/3
        n = x
    }
    return count
}

fun calculateCocaColaDrink(N: Long, algorithms: ALGORITHMS = ALGORITHMS.LOOP): Long {
    if (N < 3) return N
    val newCocaCola = when (algorithms) {
        ALGORITHMS.RECURSIVE -> countPromotionalCocaCola(N)
        else -> countPromotionalCocaCola2(N)
    }
    return N + newCocaCola
}


/**
 * Test cases in src/test/kotlin/TestCocaCola.kt
 */
fun main() {
    val N = 5L
    println(calculateCocaColaDrink(N))
}

