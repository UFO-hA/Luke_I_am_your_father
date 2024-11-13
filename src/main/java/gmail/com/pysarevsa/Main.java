package gmail.com.pysarevsa;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        String hello = "Do you have a right hand?";
        String chus = "Y/N";
        System.out.println(hello + "\n" + chus );

        String otvet = in.nextLine().toLowerCase();

        if (otvet.equals("y")){
            System.out.println("Fuck");
            Thread.sleep(1000);
            System.out.println("you");
            Thread.sleep(1500);
            System.out.println("Picard!!!");
        } else {
            System.out.println("Luck");
            Thread.sleep(1500);
            System.out.println("I");
            Thread.sleep(1000);
            System.out.println("am");
            Thread.sleep(1000);
            System.out.println("your");
            Thread.sleep(1000);
            System.out.println("FATHER!!!");
        }




    }
}