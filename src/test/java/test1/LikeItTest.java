package test1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LikeItTest {
    private LikeIt likeIt;

    @Test
    public void emptyNames(){
        Integer[] names = new Integer[0];
        likeIt.display(names);
        assertArrayEquals(new Integer[0], likeIt.display(""));
    }
    @Test
    public void nullNames(){
        Integer[] names = null;
        likeIt.display(names);
        assertArrayEquals(null, likeIt.display(""));
    }
}
