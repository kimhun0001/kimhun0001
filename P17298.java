import java.io.*;
import java.util.Stack;

public class P17298 {
    public static void main(String[] args) throws IOException {
        System.out.println("수열 크기 입력:");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(bf.readLine());
        int[] A=new int[N];
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[N];

        stack.push(0);

        bf=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i < N; i++) {
            while (!stack.isEmpty() &&A[stack.peek()]<A[i]){
                ans[stack.pop()]=A[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            ans[stack.pop()]=-1;
        }
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bw.write(ans[i]+" ");
        }
        bw.write("\n");
        bw.flush();
    }
}
