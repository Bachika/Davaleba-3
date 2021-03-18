package constructor;

public class Excersise6{

    private float x, y;

    public Excersise6(){ }
    public Excersise6(float _x){
        x = _x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float m1(){
        float result = 0;
        if(y!=0){
             result = x/y+x*y;
        }
        if(x<=0){
            result = (float) (Math.pow(x, 4)+y);
        }
        return result;
    }
    public float m2(){
        if (x < y){
            return x;
        }else return y;
    }

}
