package constructor;

public class Exercise4 {

    int x = 3, y = 6;

    public Exercise4(){
        System.out.println("Hello My Class");
    }
    public int m1(){
        if (x>0){
            return 4*(x-y);
        }else if(x==0){
            return 2*(x+y);
        }
        return 0;
    }
    public int m2(){
        if (y>0){
            return 4*(x+y);
        }else if(y==0){
            return 2*(x-y);
        }
        return 0;
    }

}
