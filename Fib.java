/**
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1

  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /**
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if (n == 1) {
            // System.out.println(1);
            return 1;
        } else if (n == 0) {
            // System.out.println(1);
            return 1;
        } else {
            long toReturn = fib_recurrence(n-1) + fib_recurrence(n-2);
            // System.out.println(toReturn);
            return toReturn;
        }
    }
     /* These are class methods because we are not instantiating a Fib object,
     and we don't need object-orientation in this instance because we are
     passing these methods arguements in the UserOf file. Essentially, Fib is a
     class whose merit lies entirely in its methods, not in the class itself.
    */


    /**
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        if ( n<=1 ) {
            return 1;
        }
        long oneBefore = 1;
        long twoBefore = 1;
        long currentfib = 1;

        for (int fibIndex = 1; fibIndex < n ; fibIndex++) {
            twoBefore  = oneBefore;
            oneBefore = currentfib;
            currentfib = oneBefore + twoBefore;
        }
        return currentfib;
    }
    /* Time complexity:
       Consider the size of the problem to be n, where n represents the index of
       the number that we are seeking in the sequence, starting with zero.

       As the proxy for the time required, count the number of loops.

       Then cost of the the recurrence algorithm
       grows linearly
       as the size of the problem increases,
       because the loop runs a total of n times.
     */


    /**
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        return (
            (1/Math.sqrt(5)) * (Math.pow( ((1+Math.sqrt(5))/2), n+1) -
                                Math.pow( ((1-Math.sqrt(5))/2), n+1))
        );
    }
    /* Time complexity:
       Consider the size of the problem to be n, where n represents the index of
       the number that we are seeking in the sequence, starting with zero.

       As the proxy for the time required, count the number of operations
       executed

       Then cost of the the recurrence algorithm does not grow

       as the size of the problem increases,
       because the size of n does not effect the number of operations executed.
     */
}
