import java.util.Arrays;

/**
 * Created by Usman on 06/12/2016.
 */
public class DFSQueens
{
    static int[] result; // this array will store the result

    public boolean canPlace(int x2, int y2) {
        for (int i = 0; i < x2; i++) {
            if ((result[i] == y2)|| (Math.abs(i - x2) == Math.abs(result[i] - y2))) {
                return false;
            }
        }
        return true;
    }

    public void placeQueens(int x, int size) {
        for (int i = 0; i < size; i++) {
            if (canPlace(x, i)) {
                result[x] = i; // place the queen at this position.
                if (x == size - 1) {
                    System.out.println("Order of " + size + " queens"+ Arrays.toString(result));
                }
                placeQueens(x + 1, size);
            }
        }
    }

    public static void main(String[] args) {
        int n = 8;
        result = new int[n];
        NQueens2 i = new NQueens2();
        i.placeQueens(0, n);
    }
}
