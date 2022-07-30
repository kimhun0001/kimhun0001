import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int a = 333;
        int a2 = 20;
        int a3 = 4;

        int[] b = {1, 5, 3, 5, 1, 2, 1, 4};
        int[] b2 = {3, 3, 3, 2, 2, 4};
        String c = "10D10T*10S";
        char[] d = {'a', 'b', 'c'};
        String[] e = {"leo", "kiki", "eden"};
        String[] e2 = {"eden", "kiki"};
        double f = 12.345;
        int[][] g = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int[][] g2 = {{1, 2, 3}, {1, 2, 3}};
        System.out.println(Solution.solution(g));
    }
//Arrays.deepToString(arr)
//Arrays.toString(arr)
// new_id = new_id.replaceAll("[^\\d a-z_.-]", "");


    class Solution {
        public static int solution(int[][] maps) {
            int answer = 0;
            return answer;
        }
    }
}