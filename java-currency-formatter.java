import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        // Write your code here.

        NumberFormat usF = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaF = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaF = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        NumberFormat frF = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));

        
        System.out.println("US: " + usF.format(payment));
        System.out.println("India: " + indiaF.format(payment));
        System.out.println("China: " + chinaF.format(payment));
        System.out.println("France: " + frF.format(payment));
    }
}


