import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12892 {
    static int[] cheakarr;
    static int[] myarr;
    static int cheakSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int S = Integer.parseInt(stringTokenizer.nextToken()); //문자열 크기
        int P = Integer.parseInt(stringTokenizer.nextToken()); //비번 문자열 크기
        int Result = 0; //성공 횟수
        char A[]; //문자열 데이터 저장
        cheakarr = new int[4]; //조건 문자열 확인
        myarr = new int[4]; //현재 확인중인 배열
        cheakSecret = 0; //현재 조건 확인 카운팅
        A = bufferedReader.readLine().toCharArray(); //문자열 데이터 입력

        stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 조건 문자수 입력
        for (int i = 0; i < 4; i++) {
            cheakarr[i] = Integer.parseInt(stringTokenizer.nextToken()); // ACGT 필요수 입력.
            if (cheakarr[i] == 0) // 0이면 확인 넘기고
                cheakSecret++;
        }
        for (int i = 0; i < P; i++) { // ACGT 필요수 저장.
            Add(A[i]);
        }
        if (cheakSecret == 4) // 4개가 일치하면 ++
            Result++;

        for (int i = P; i < S; i++) { //슬라이딩 윈도우 범위 만큼
            int j = i - P;
            System.out.println("S_ADD:"+A[i]+" i:"+i);
            Add(A[i]);
            System.out.println(" S_RE:"+A[j]+" j:"+j);
            Remove(A[j]);
            if (cheakSecret == 4)
                Result++;
            System.out.println(" Result:"+Result);
        }
        System.out.println(Result);
        bufferedReader.close();
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myarr[0]++;
                System.out.println("ADD A:"+myarr[0]);
                if (myarr[0] == cheakarr[0]) cheakSecret++;
                break;
            case 'C':
                myarr[1]++;
                System.out.println("ADD C:"+myarr[1]);
                if (myarr[1] == cheakarr[1]) cheakSecret++;
                break;
            case 'G':
                myarr[2]++;
                System.out.println("ADD G:"+myarr[2]);
                if (myarr[2] == cheakarr[2]) cheakSecret++;
                break;
            case 'T':
                myarr[3]++;
                System.out.println("ADD T:"+myarr[3]);
                if (myarr[3] == cheakarr[3]) cheakSecret++;
                break;
        }
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myarr[0] == cheakarr[0]) cheakSecret--;
                myarr[0]--;
                System.out.println("Re A:"+myarr[0]);
                break;
            case 'C':
                if (myarr[1] == cheakarr[1]) cheakSecret--;
                myarr[1]--;
                System.out.println("Re C:"+myarr[1]);
                break;
            case 'G':
                if (myarr[2] == cheakarr[2]) cheakSecret--;
                myarr[2]--;
                System.out.println("Re G:"+myarr[2]);
                break;
            case 'T':
                if (myarr[3] == cheakarr[3]) cheakSecret--;
                myarr[3]--;
                System.out.println("Re T:"+myarr[3]);
                break;
        }
    }
}
