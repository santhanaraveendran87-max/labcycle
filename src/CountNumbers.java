public class  CountNumbers {
    public static void main(String[] args) {

        int[] arr = {5, -3, 0, 8, -1, 4};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int num : arr) {
            if(num > 0)
                positive++;
            else if(num < 0)
                negative++;
            else
                zero++;
        }

        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zeros = " + zero);
    }
}