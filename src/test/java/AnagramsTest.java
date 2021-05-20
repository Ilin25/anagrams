import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnagramsTest{

    @Test
    @DisplayName("Test for the flipText method with 'null' input parameter")
    void flipText_Null_EmptyString() {
        Assertions.assertEquals(Anagrams.flipText(
                null),
                "",
                "The returned text does not match the specified rules");
    }

    @Test
    @DisplayName("Test for the flipText method with empty string input parameter")
    void flipText_EmptyString_EmptyString() {
       Assertions.assertEquals(Anagrams.flipText(
                        ""),
                        "",
                        "The returned text does not match the specified rules");
    }

    @Test
    @DisplayName("Test for the flipText method with a single symbol input parameter")
    void flipText_OneSymbol_OneSymbol() {
        Assertions.assertEquals(Anagrams.flipText(
                "A"),
                "A",
                "The returned text does not match the specified rules");
    }

    @Test
    @DisplayName("Test for the flipText method with long string symbol input parameter")
    void flipText_LongStringSymbol_FlipLongStringSymbol() {
        Assertions.assertEquals(Anagrams.flipText(
                "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"),
                "zZyYxXwWvVuUtTsSrRqQpPoOnNmMlLkKjJiIhHgGfFeEdDcCbBaA",
                "The returned text does not match the specified rules");
    }

    @Test
    @DisplayName("Test for the flipText method with a single non symbol input parameter")
    void flipText_OneNotSymbol_OneNotSymbol() {
        Assertions.assertEquals(Anagrams.flipText(
                "0"),
                "0",
                "The returned text does not match the specified rules");
    }

    @Test
    @DisplayName("Test for the flipText method with input parameters from a long string of non symbols")
    void flipText_LongStringNotSymbol_FlipLongStringNotSymbol() {
        Assertions.assertEquals(Anagrams.flipText(
                "{!@#$%^&*()_+=-[]{}\"\"\'\';<>?//;"),
                "{!@#$%^&*()_+=-[]{}\"\"'';<>?//;",
                "The returned text does not match the specified rules");
    }

    @Test
    @DisplayName("Test for the flipText method with long string symbol and non symbol parameter")
    void flipText_LongStringSymbolAndNotSymbol_FlipLongStringSymbolAndNotSymbol() {
        Assertions.assertEquals(Anagrams.flipText(
                "Aa1Bb2Cc3Dd4Ee5Ff6Gg7Hh8Ii9Jj10Kk11Ll12Mm12Nn14Oo15Pp16Qq17Rr18Ss19Tt20Uu21Vv22Ww23Xx24Yy25Zz26"),
                "zZ1yY2xX3wW4vV5uU6tT7sS8rR9qQ10pP11oO12nN12mM14lL15kK16jJ17iI18hH19gG20fF21eE22dD23cC24bB25aA26",
                "The returned text does not match the specified rules");
    }

    @Test
    @DisplayName("Test for the flipText method with input parameter from a long string of symbols with spaces")
    void flipText_LongStringSymbolsWithSpaces_FlipLongStringSymbolsWithSpaces() {
        Assertions.assertEquals(Anagrams.flipText(
                "Test for the flipText method with input parameter from a string of many words"),
                "tseT rof eht txeTpilf dohtem htiw tupni retemarap morf a gnirts fo ynam sdrow",
                "The returned text does not match the specified rules.");
    }

}