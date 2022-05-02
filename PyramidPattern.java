package Starspattern;

public class PyramidPattern {
    void banana() {

        for (int i = 0; i < 5; i++) {
            for (int j =2-i; j >1; j--)
            {
                System.out.println(" ");

                   System.out.println(" * ");
                  System.out.println("  *  * ");
                System.out.println( "*  *   *" );
             System.out.println("*    *    *   *");
            System.out.println("*   *   *     *   *");}

        }
    }
    public static void main(String[] args) {
               PyramidPattern my = new PyramidPattern();
                my.banana();
                System.out.println("mybanana");
            }
        }


