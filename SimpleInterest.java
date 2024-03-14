package BasicAssigment;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enterr the prrincle amount");
        int p = sc.nextInt();
        System.out.print("Enter rate of intrest");
        int r = sc.nextInt();
        System.out.print("Enter the time");
        int t = sc.nextInt();
        double si = p * r * t / 100;
        System.out.print("simplle interest is " + si);
    }

}
