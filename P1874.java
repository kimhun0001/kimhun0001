import java.util.Scanner;
import java.util.Stack;

public class P1874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer stringBuffer = new StringBuffer();
        int num = 1;
        boolean result = true;

        for (int i = 0; i < N; i++) {
            int su = A[i];
            if (su >= num) { //su 가 num(top값) 보다 클때.
                while (su >= num) { //num이 su 만큼 커질때 까지 + 를 입력.
                    System.out.println(" num:"+num);
                    stack.push(num++);
                    System.out.println(" push num:"+num);
                    stringBuffer.append("+\n");
                    System.out.println(" + ");
                }
                //한개를 pop.
                stack.pop();
                stringBuffer.append("-\n");
                System.out.println(" - ");
            } else { //su 가 num(top값) 보다 작을때.
                int n = stack.pop();
                System.out.println(" n:"+n);
                if (su < n) {
                    System.out.println("NO");
                    result = false;
                } else {
                    stringBuffer.append("-\n");
                    System.out.println(" -- ");
                }
            }
        }
        if (result) System.out.println(stringBuffer.toString());
    }
}
