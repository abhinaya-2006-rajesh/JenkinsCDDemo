import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class multiplicationtest {

    @Test
    public void multiply() {

        assertArrayEquals(
                new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20},
                multiplication.mul(2)
        );
    }
}