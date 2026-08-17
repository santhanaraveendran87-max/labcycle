import java.util.Scanner;

class InsufficientFundsException extends Exception{
    InsufficientFundsException(String message){
        super(message);
    }
}
class Atm {
    double balance =1000;

    void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance) {
            throw new InsufficientFundsException("insufficient amount");
        }
    balance = balance-amount;
    System.out.println(balance);
    }
}
public class exception {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Atm a= new Atm();
        try {
            System.out.println("enter the amount ");
            double amount = sc.nextDouble();
            a.withdraw(amount);
        }
        catch (InsufficientFundsException e){
            System.out.println("error"+e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Enter a valid input");
        }
        finally {
            sc.close();
        }
    }
}