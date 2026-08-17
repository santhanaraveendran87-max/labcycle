class vehicle{
    String regno;
    double dailyrate;

    vehicle(String regno,double dailyrate){
    this.regno=regno;
    this.dailyrate=dailyrate;
    }
    double computerate(int days){
        return dailyrate*days;
    }
}
class car extends vehicle{
    int numdoors;

    car(String regno,double dailyrate,int numdoors){
        super(regno,dailyrate);
        this.numdoors=numdoors;
    }

    double computerent(int days){
        double baserent=super.computerate(days);
        return baserent+(baserent*0.20);
    }
}
public class VehicleRental{
    public static void main(String[] args){
        vehicle v=new vehicle("kl36",1000);
        System.out.println(v.computerate(5));

        car c=new car("kl36",1000,4);
        System.out.println(c.computerent(5));
    }
}