import java.util.Scanner;

public class marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int[] marks= new int[5];

         try{
             for(int i=0; i<5; i++){
                 System.out.println("enter the mark "+ (i+1) +" : ");
                 marks[i]=sc.nextInt();
             }
             int subcount=5;
             int sum=0;

             for(int mak: marks){
                 System.out.println("the first mark "+mak);
                 sum += mak;
             }
             double avg=(double) sum/ subcount;
             System.out.println(avg);
         }
         catch (ArrayIndexOutOfBoundsException e){
             System.out.println("index not avilable");
         }
         catch (ArithmeticException e){
             System.out.println("invalid ");
         }
         finally {
             System.out.println("processing complete");
         }
    }
}