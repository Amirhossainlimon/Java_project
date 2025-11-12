public class SumRecursion {

    // Function to calculate sum of first n numbers
    static int sum(int n) {
        if (n == 0){
         return 0; 
      }         // base case
        return n + sum(n - 1);       // recursive call
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Sum of first " + num + " natural numbers = " + sum(num));
    }
}
