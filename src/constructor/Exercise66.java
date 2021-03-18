package constructor;

public class Exercise66{

    private float x, y;

    public Exercise66(){ }
    public Exercise66(float _x){
        x = _x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float m1() {
        while(x!=y)
        {
            if(x>y)
                x=y;
            else
                y=x-x;
        }
        return x;

    }
    public float m2(){
        while(x!=y)
        {
            if(x>y)
                x=y;
            else
                y=x-x;
        }
        return x;
    }

}
