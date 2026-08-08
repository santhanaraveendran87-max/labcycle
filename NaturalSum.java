class NaturalSum {

    static int sum(int n) {

        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        int n = 10;

        System.out.println("Sum = " + sum(n));
    }
}