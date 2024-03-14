package BasicAssigment;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("pleace Enter the radice");
        int r = sc.nextInt();
        // pi r*r
        double pi = 3.1415;
        double area = pi * r * r;

        System.out.print("Area of circle is" + area);

    }

}
