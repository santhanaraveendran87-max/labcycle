class Animal{
    String name;

    Animal(String  name){
        this.name=name;
    }
    void makesound(){
        System.out.println("Animal make sound");
    }
    public String toString(){
        return name;
    }
}
class dog extends Animal{

    dog(String name){
        super(name);
    }
    void makesound(){
        System.out.println("dog bark");
    }
    public String toString(){
        return super.toString()+"(dog)";
    }
}
public class AnimalDog {
    public static void main(String[] args){
        dog d=new dog("puppy");
        d.makesound();
        System.out.println(d.toString());
    }
}