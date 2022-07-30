import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int A=Integer.parseInt(br.readLine());
        int B=Integer.parseInt(br.readLine());
        int[] C=new int[A];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            C[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(C);
        int start_index=0;
        int end_index=C.length-1;
        int count=0;
        while (start_index<end_index){
            if(B>C[start_index]+C[end_index]){
                start_index++;
            }else if (B<C[start_index]+C[end_index]) {
                end_index--;
            }else {
                count++;
                start_index++;
                end_index--;
            }
        }
        System.out.println(count);
        br.close();
    }
}
