package tasks;

public class Task4 {
    public static int factorial(int n){
        if (n == 0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    public static int factorial(){
        return factorial(5);
    }
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int result = factorial();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Factorial of 5 is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
