package Starspattern;

public class RightPattern {
    void myapple() {
// Right tringle star pattern
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("*****");
            }
        }
        // left Triangle star pattern
        System.out.println("      *");
        System.out.println("     **");
        System.out.println("    ***");
        System.out.println("   ****");
        System.out.println("  *****");
    }

        public static void main (String[]args){

            RightPattern my = new RightPattern();
            my.myapple();
            System.out.println("myapple");

        }

    }


