package exercicies

import org.junit.Assert
import org.junit.Test

class VawelConsonantTest {
    @Test
    fun countVowels() {
        Assert.assertEquals(11, countVowels("Quantas vogais tem esta frase?"))
    }

    @Test fun countConsonants() {
        Assert.assertEquals(21, countConsonants("Geralmente uma frase possui mais consoantes!"))
    }

    @Test fun countVawelsAndConsonants() {
        var phrase = "estou gostando muito de aprender kotlin!"
        Assert.assertEquals(15, countVowels(phrase))
        Assert.assertEquals(19, countConsonants(phrase))
    }
    @Test fun countVowelsFilter() {
        Assert.assertEquals(8, countVolwelsFilter("Minha frase com vogais!"))
    }
}