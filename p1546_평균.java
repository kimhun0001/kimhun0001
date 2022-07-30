import java.util.*;
public class p1546_평균 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int[] B=new int[A];
        int sum=0;
        for (int i = 0; i <B.length ; i++) {
            B[i]=sc.nextInt();
            sum+=B[i];
        }
        Arrays.sort(B);
        int max=B[B.length-1];
        System.out.println("max:"+max);
        System.out.println(sum);
        System.out.println("답:"+sum*100/max/A);
    }
}
