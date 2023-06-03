import org.example.PS.IsPalindrome;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class IsPalindromeTest {
    IsPalindrome isPalindrome;

    @Test
    @DisplayName("Test to lower case")
    void testToLowerCase(){
     String testString = "AwniRifai";
     Assertions.assertEquals("awnirifai",IsPalindrome.toLowerCase(testString));
    }

    @Test
    @DisplayName("Test trim")
    void testTrim(){
        String testString = "Awni r if f ";
        // static imports
        assertEquals("Awniriff",IsPalindrome.trim(testString));
    }

    @Test
    @DisplayName("Test isPal")
    void testIsPal(){
        String ts1 = "A man, a plan, a canal: Panama";
        String ts2 = "race a car";
        String ts3 = "";
        assertEquals(true,IsPalindrome.isPal(ts1));
        assertEquals(false,IsPalindrome.isPal(ts2));
        assertEquals(true,IsPalindrome.isPal(ts3));
    }
}
