class dev {

    final void poweron(){
        System.out.println("device is power on");
    }
}
class phone extends dev{
    void call(String number){
        System.out.println("calling "+number);
    }
    void installapp(String name){
        System.out.println("calling : "+name);
    }
}
class Smartphone extends phone{
    void installapp(String name) {
        System.out.println("calling : " + name);
    }
}
public class device{
    public static void main(String[] args){
        Smartphone s = new Smartphone();
        s.poweron();
        s.call("2549876325");
        s.installapp("anna");
    }
}