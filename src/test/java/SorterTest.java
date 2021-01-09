import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SorterTest {

    Sorter sort;
    ArrayList<Integer> nums;

    @Before
    public void setUp(){
        sort = new Sorter();
        nums = new ArrayList<>(Arrays.asList(8, 10, 37, 777, 1, 2, 6, 99, 233344, 233, 5, 4, 3, 30, 9, 7));
        this.nums = sort.sort(nums);
    }

    @Test
    public void verifySort(){
        ArrayList<Integer> answerKey = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 37, 99, 233, 777, 233344));
        assertEquals(answerKey.size(), nums.size());
        for(int i = 0; i < answerKey.size(); i++){
            assertEquals(answerKey.get(i), this.nums.get(i));
        }
    }

}
