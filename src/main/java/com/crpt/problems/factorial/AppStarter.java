package com.crpt.problems.factorial;

import com.crpt.problems.factorial.core.FactorizationFactorialSolver;
import com.crpt.problems.factorial.core.SimpleFactorialSolver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AppStarter {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = 0;

        try {
            System.out.println("Enter value of 'n':");
            n = Long.parseLong(br.readLine());
            if (n > Integer.MAX_VALUE) {
                throw new NumberFormatException();
            }
        }
        catch (Exception e) {
            System.out.println("N have to be integer value > 0 and < 2 147 483 647 (MAX_INT)");
            System.exit(2);
        }

        try {
            System.out.println("Simple Impl: \t\tNumber of zeros in " + n + "! : " + new SimpleFactorialSolver().getZeros(n));
            System.out.println("Factorization Impl: Number of zeros in " + n + "! : " + new FactorizationFactorialSolver().getZeros(n));
        }
        catch (NumberFormatException e) {
            System.out.println("Unable to count zeros: " + e.getMessage());
        }
    }
}
