class Assignment1 {
    public static void main(String[] args) {
        int number = 5; // Example number
        int factorial = 1; // factorial variable initialized to 1

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}