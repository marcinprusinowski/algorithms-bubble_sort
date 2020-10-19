import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class BubbleSortTest {

    @Test
    public void shouldReturnSortedArray(){
        List<Integer> numbers = new ArrayList<>(List.of(1,4,6,1,41,23,6));
        List<Integer> expected = new ArrayList<>(List.of(1,1,4,6,6,23,41));
        BubbleSort bubbleSort = new BubbleSort(numbers);


        Assertions.assertIterableEquals(expected , bubbleSort.sort());
        Assertions.assertIterableEquals(expected , bubbleSort.improvedSort());

    }


}