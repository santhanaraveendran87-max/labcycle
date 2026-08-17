class em{
    final String companyname;
    double salary ;

    em(String companyname){
        this.companyname=companyname;
    }
    double calculatebonus(){
        return salary * 0.5;
    }
}
class manager extends em{
    manager(String companyname){
        super(companyname);
    }
    double calculatebonus(){
        return salary * 0.10;
    }
}
class seniormanager extends manager{
    seniormanager(String companyname){
        super(companyname);
    }
    double calculatebonus(){
        return salary * 0.15+ 1000;
    }
}
public class Employee {
    public static void main(String[] args){
        seniormanager s= new seniormanager("vipro");
        System.out.println(s.companyname);
        System.out.println(s.calculatebonus());
    }
}