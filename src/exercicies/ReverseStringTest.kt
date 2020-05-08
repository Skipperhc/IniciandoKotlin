package exercicies

import org.junit.Assert
import org.junit.Test

class ReverseStringTest {
    @Test
    fun reverseUsingSB() {
        Assert.assertEquals("BS niltoK", reverseUsingSB("Kotlin SB"))
    }

    @Test fun reverseUsingLoop() {
        Assert.assertEquals("pooL niltoK", reverseUsingLoop("Kotlin Loop"))
    }
}