import org.example.PS.ThreeSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ThreeSumTest {
    @Test
    @DisplayName("Test three sum")
    void testThreeSum(){
        int[] test1 =  {-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> ans1 = new ArrayList<>()
        int[] test2 =  {0,1,1};
        Assertions.assertEquals(ThreeSum.solution(test1),);

    }
}
