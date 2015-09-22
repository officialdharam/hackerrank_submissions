import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        long sum1 = 0, sum2 = 0;
        for(int i = 0 ; i < n ; i++){
            sum1 += a[i][i] ;
            sum2 +=a[i][n-i-1];
        }
        
        long sum = sum1-sum2;
        if(sum < 0)
            sum*=-1;
        System.out.println(sum);
    }
}
