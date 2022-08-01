package com.company;
import java.util.Scanner;
import java.util.Arrays;
class duplicate
{
    public void d() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,miss=0,duplicate=0;
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        if(a[n-1]!=n)
            System.out.println("The missing element is "+" "+n);
        if(a[0]!=1)
            System.out.println("The missing element is "+" "+1);
        for(i=0;i<n-1;i++)
        {
            if(a[i]!=i+1 && a[i]!=a[i+1])
                miss++;
            if(a[i]==a[i+1])
                duplicate++;
            int j=a[i]+1;
            if(miss>1)
                System.out.println("The missing element is "+j);
            if(duplicate ==1)
                System.out.println("The duplicate element is "+a[i]);
            miss=0;
            duplicate=0;
        }
    }
}
public class Main {

    public static void main(String[] args) {
        duplicate d = new duplicate();
        d.d();
    }
}
