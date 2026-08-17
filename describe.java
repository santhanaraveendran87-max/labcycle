class sh {
     String name;

    sh(String name){
        this.name=name;
    }
    void describe(){
        System.out.println("the name is "+name);
    }
}
class circle extends sh{
    double radius;

    circle(String name,double radius){
        this.radius=radius;
        super(name);
    }
    void describe() {
        super.describe();
        double area = Math.PI * radius * radius;
        System.out.println("area"+area);
    }
}
public class describe{
    public static void main(String[] args){
        circle c=new circle("circle",6);
        c.describe();
    }
}