import com.example.project.Printer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(r);
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

//        for(int i=0;i<5;i++) {
//            int x;
//            x = sc.nextInt();
//            arr.add(i);
//        }
//
//         for(int i=0;i<arr.size();i++) {
//             System.out.println(arr.get(i));
//         }

        System.out.println("Enter a number and a string :");
        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println("abc".matches(".*bc"));
        StringTokenizer st = new StringTokenizer(sb.toString(), " ");

        System.out.println(st.nextElement());

        while (st.hasMoreTokens()) {
            System.out.println(st.nextElement());
        }

        return;
    }
}