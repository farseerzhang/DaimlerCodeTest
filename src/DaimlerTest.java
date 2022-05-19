import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class DaimlerTest {
    public static void main(String[] args) {
        //can be done with jUnit test, but this way is easy to test.
        //one test case
        int[][] input = {{25,30},{2,19},{14,23},{4,8}};
        int[][] correctOutput = {{2,23},{25,30}};

        if (Arrays.deepEquals(correctOutput, merge(input))) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }

    public static int[][] merge(int[][] intervals) {
        // if intervals is empty，return empty
        if(intervals.length==0) return new int[0][0];
        // sort with the left value of interval
        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));
        LinkedList<int[]> list = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of list intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (list.isEmpty() || list.getLast()[1] < interval[0]) {
                list.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                list.getLast()[1] = Math.max(list.getLast()[1], interval[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
