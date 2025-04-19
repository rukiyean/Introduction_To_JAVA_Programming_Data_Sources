package Bolum10;

import java.math.BigDecimal;
import java.math.MathContext;

public class Approximate {

	public static void main(String[] args) {
		MathContext mc = new MathContext(25);

        // Start with e = 1 (first term in the series)
        BigDecimal e = BigDecimal.ONE;

        // Compute e using the series for i = 1 to 1000
        BigDecimal factorial = BigDecimal.ONE; // 0! = 1
        for (int i = 1; i <= 1000; i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i)); // i!
            e = e.add(BigDecimal.ONE.divide(factorial, mc)); // e = e + 1 / i!
            
            // Output e for i = 100, 200, ..., 1000
            if (i % 100 == 0) {
                System.out.printf("e for i = %d: %s%n", i, e.toString());
            }
        }

	}

}
