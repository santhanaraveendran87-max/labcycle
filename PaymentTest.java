abstract class paym{

    abstract void pay(double amount);

}
class creditcard extends paym{
    void pay(double amount){
        System.out.println("using credit " +amount+" card payment");
    }
}
class upi extends paym{
    void pay(double amount){
        System.out.println("using upi " + amount + "payment");
    }
}
public class PaymentTest{
    public static void main(String[] args){
        paym p = new creditcard();
        p.pay(200);

        p=new upi();
        p.pay(500);

    }
}