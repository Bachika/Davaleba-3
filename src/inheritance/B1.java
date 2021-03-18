package inheritance;

import java.util.Scanner;

public class B1 extends A1{
    int y;

//    public B(){
//        System.out.println("B Class");
//    }

    public void m1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Y->");
        y = scanner.nextInt();
    }

    public void m2(){
        System.out.println(x+y);
    }
}
