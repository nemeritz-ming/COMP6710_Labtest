package comp1110.labtest;

import java.util.Arrays;
import java.util.Scanner;

public class Permute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        if (Arrays.equals(a1,b1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
