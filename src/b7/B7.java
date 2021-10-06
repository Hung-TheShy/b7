
package b7;

import java.util.Scanner;
public class B7 {

    
    public static void main(String[] args) {
        int n , firstTerm = 0, secondTerm = 1;
        System.out.print("nhap n");
         Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

    
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
    }
    
}
