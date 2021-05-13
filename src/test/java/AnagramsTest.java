import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnagramsTest{


    @Test
    @DisplayName("Test for the flipText method with parameters")
    void flipText() {
        Assertions.assertAll(
                ()->Assertions.assertEquals(Anagrams.flipText(
                        "qw3rt6 7ab10"), "tr3wq6 7ba10","The returned text does not match the specified rules"),
                ()->Assertions.assertEquals(Anagrams.flipText(
                        "1111"), "1111","The returned text does not match the specified rules"),
                ()->Assertions.assertEquals(Anagrams.flipText(
                        "AsAaAf"), "fAaAsA","The returned text does not match the specified rules"),
                ()->Assertions.assertEquals(Anagrams.flipText(
                        "А1бВ"), "В1бА","The returned text does not match the specified rules"));
    }

}