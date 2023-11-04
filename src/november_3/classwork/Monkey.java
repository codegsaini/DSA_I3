package november_3.classwork;

import java.util.Scanner;

public class Monkey {

    public static void main(String[] args) {

        int height;
        int jump;
        int slide;
        int actualJump;
        int jumpCount = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter height : ");
        height = scan.nextInt();

        System.out.println("Enter jump : ");
        jump = scan.nextInt();

        System.out.println("Enter slide : ");
        slide = scan.nextInt();

        actualJump = jump - slide;

        while (jumpCount * actualJump + jump <= height) {
            jumpCount++;
        }

        jumpCount++;

        System.out.println("Monkey will have to jump " + jumpCount + " times");

    }

}
