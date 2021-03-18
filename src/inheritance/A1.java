package inheritance;

import java.util.Scanner;

public class A1 {
    protected int x;

    public A1(){
        System.out.println("Hello My A Class");
    }

    public void m1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("X->");
        x = scanner.nextInt();
    }
    public void m2(){
        System.out.println("X= "+x);
    }
    public void m3(){
        if (x%2 == 1){
            System.out.println("Kentia");
        }else System.out.println("Luwia");
    }
}
