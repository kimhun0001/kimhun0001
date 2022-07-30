import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int count = 0;
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(stringTokenizer.nextToken());
        }
        Arrays.sort(A);

        for (int K = 0; K < N; K++) {
            int start_index = 0;
            int end_index = N - 1;
            long find = A[K];
            System.out.println("find:"+find);


            while (start_index < end_index) {
                if (A[start_index] + A[end_index] == find) {
                    if (start_index != K && end_index != K) {
                        count++;
                        break;
                    } else if (start_index == K) {
                        start_index++;
                    } else if (end_index == K) {
                        end_index--;
                    }
                } else if (A[start_index] + A[end_index] < find) {
                    start_index++;
                } else {
                    end_index--;
                }
            }
        }
        System.out.println(count);
        bufferedReader.close();
    }
}
