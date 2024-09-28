package EnumColor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean flag = false;
        do {
            try {
                Scanner inputColor = new Scanner(System.in);
                System.out.println("Enter a color");
                String inputcolor = inputColor.next();

                EnumColor color = EnumColor.valueOf(inputcolor.toUpperCase());
                switch (color){
                    case BLACK:
                        System.out.println("The entered color is Black");
                        flag = true;
                        break;
                    case GREEN:
                        System.out.println("The entered color is Green");
                        flag = true;
                        break;
                    case WHITE:
                        System.out.println("The entered color is White");
                        flag = true;
                        break;
                    default:
                        System.out.println("color not exist in the list");
                }
            } catch (IllegalArgumentException e){
                System.out.println("Enter any color [BLACK, RED, WHITE]");

            }
        } while (!flag);
    }
}