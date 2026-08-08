class Temperature {

    static double celsiusToFahrenheit(double celsius) {

        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        double celsius = 30;

        double fahrenheit =
                Temperature.celsiusToFahrenheit(celsius);

        System.out.println("Fahrenheit = " + fahrenheit);
    }
}