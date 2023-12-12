import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestCocaCola {

    @Test
    fun testCalculateCocaColaDrink0WithLoopAlgorithm() {
        val N = 4L
        val result = calculateCocaColaDrink(N)
        // Assert
        assertEquals(5, result)
    }

    @Test
    fun testCalculateCocaColaDrink1WithLoopAlgorithm() {
        val N = 5L
        val result = calculateCocaColaDrink(N)
        // Assert
        assertEquals(7, result)
    }

    @Test
    fun testCalculateCocaColaDrink2WithLoopAlgorithm() {
        val N = 6L
        val result = calculateCocaColaDrink(N)
        // Assert
        assertEquals(8, result)
    }


    @Test
    fun testCalculateCocaColaDrink0WithRecursiveAlgorithm() {
        val N: Long = 4L
        val result = calculateCocaColaDrink(N, ALGORITHMS.RECURSIVE)
        // Assert
        assertEquals(5, result)
    }

    @Test
    fun testCalculateCocaColaDrink1WithRecursiveAlgorithm() {
        val N = 5L
        val result = calculateCocaColaDrink(N, ALGORITHMS.RECURSIVE)
        // Assert
        assertEquals(7, result)
    }

    @Test
    fun testCalculateCocaColaDrink2WithRecursiveAlgorithm() {
        val N = 6L
        val result = calculateCocaColaDrink(N, ALGORITHMS.RECURSIVE)
        // Assert
        assertEquals(8, result)
    }

    @Test
    fun testCalculateCocaColaDrink3WithRecursiveAlgorithm() {
        val N = 7L
        val result = calculateCocaColaDrink(N, ALGORITHMS.RECURSIVE)
        // Assert
        assertEquals(10, result)
    }

    @Test
    fun testCalculateCocaColaDrink4WithRecursiveAlgorithm() {
        val N = 13L
        val result = calculateCocaColaDrink(N, ALGORITHMS.RECURSIVE)
        // Assert
        assertEquals(19, result)
    }
}