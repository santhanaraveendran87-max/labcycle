class shape{
    final String shapetype="2D";

    double area(){
        return 0;
    }
}
class polygon extends shape{
    double area(){
        return -1;
    }
}
class rectangle extends polygon{
    private int len;
    private int bre;

    rectangle(int length,int bredth){
        this.len=len;
        this.bre=bre;
    }
    double area(){
        return len*bre;
    }
}
public class chain {
    public static void main(String[] args){
        rectangle r= new rectangle(20,10);
        System.out.println(r.shapetype);
        System.out.println(r.area());

    }
}