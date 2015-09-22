import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class VeryBigSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum+=sc.nextInt();
        }
        System.out.println(sum);
    }
}
