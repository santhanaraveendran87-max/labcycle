class ba {
    double balance;
    final double minbalance=1000;

    ba(double balance){
        this.balance=balance;
    }
    double calculateinterest(){
        return balance * 0.20;
    }
}
class savingaccount extends ba{
    savingaccount(double balance){
        super(balance);
    }

    double calculateinterest() {
        return balance * 0.40;
    }
}
class fixeddeposit extends savingaccount
{
    fixeddeposit (double balance)
    {
        super(balance);
    }
    double calculateinterest()
    {
        double interest = super.calculateinterest();
        return interest = interest + 5000;
    }
}
public class Bank {
    public static void main(String[] args){
        fixeddeposit f=new fixeddeposit(1000);
        System.out.println(f.minbalance);
        System.out.println(f.calculateinterest());
    }
}
