import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MainTest {

    @Test
    public void testProcessArray() {
        int[][] Q = {{8, 16, 24, 32, 40, 48}, {56, 64, 72, 80, 88, 96}, {104, 112, 120, 128, 136, 144}, {152, 160, 168, 176, 184, 192}, {200, 208, 216, 224, 232, 240}, {248, 256, 264, 272, 280, 288}, {296, 304, 312, 320, 328, 336}};
        int[] expected = {37, 6208};
        assertArrayEquals(expected, Main.processArray(Q));
    }

    @Test
    public void testSwapColumns() {
        int[][] Q = {{1,2},{3,4},{5,6}};
        int[][] expected = {{2,1},{4,3},{6,5}};
        Main.swapColumns(Q ,0);
        for(int i=0;i<Q.length;i++){
            assertArrayEquals(expected[i], Q[i]);
        }
    }

    @Test
    public void testSortByFirstRow() {
        int[][] Q = {{2 ,1},{4 ,3},{6 ,5}};
        int[][] expected = {{2 ,1},{4 ,3},{6 ,5}};
        Main.sortByFirstRow(Q);
        for(int i=0;i<Q.length;i++){
            assertArrayEquals(expected[i], Q[i]);
        }
    }

    @Test
    public void testSortBySecondAndThirdRows() {
        int[][] Q = {{1 ,1},{3 ,4},{5 ,6}};
        int[][] expected = {{1 ,1},{3 ,4},{5 ,6}};
        Main.sortBySecondAndThirdRows(Q);
        for(int i=0;i<Q.length;i++){
            assertArrayEquals(expected[i], Q[i]);
        }
    }
}
