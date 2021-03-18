package constructor;

import java.util.Scanner;

public class Exercise3{

    private int a, b, x;

    public Exercise3(){

    }


    public Exercise3(int _a, int _b){
        a = _a;
        b = _b;
    }

    public void m1(){
        if(a!=b){
            System.out.println("Yes");
        }else System.out.println("No");
    }

    public void m2(){
        if (x > a && x < b){
            System.out.println("mdebareobs");
        }else System.out.println("ar mdebareobs");
    }

}
