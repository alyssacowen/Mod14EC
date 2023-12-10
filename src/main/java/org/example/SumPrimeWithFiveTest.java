package org.example;

import org.junit.Test;



public class SumPrimeWithFiveTest {

    @Test
    public void testSumOfPrimesWithDigitFive_n920() {
        SumPrimeWithFive test = new SumPrimeWithFive();
        int result = test.sumOfPrimesWithDigitFive(920);
        System.out.println("Sum of prime numbers with digit 5 from 0 to 920: " + result);
    }

    @Test
    public void testSumOfPrimesWithDigitFive_n75() {
        SumPrimeWithFive test = new SumPrimeWithFive();
        int result = test.sumOfPrimesWithDigitFive(75);
        System.out.println("Sum of prime numbers with digit 5 from 0 to 75: " + result);

    }

    @Test
    public void testSumOfPrimesWithDigitFive_n831() {
        SumPrimeWithFive test = new SumPrimeWithFive();
        int result = test.sumOfPrimesWithDigitFive(831);
        System.out.println("Sum of prime numbers with digit 5 from 0 to 831: " + result);
    }

    @Test
    public void testSumOfPrimesWithDigitFive_n2020() {
        SumPrimeWithFive test = new SumPrimeWithFive();
        int result = test.sumOfPrimesWithDigitFive(2020);
        System.out.println("Sum of prime numbers with digit 5 from 0 to 2020: " + result);
    }

    public class SumPrimeWithFive {

        // Function to check if a number is prime
        public boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }


        public int sumOfPrimesWithDigitFive(int n) {
            int sum = 0;
            for (int i = 5; i <= n; i++) {
                if (isPrime(i) && String.valueOf(i).contains("5")) {
                    sum += i;
                }
            }
            return sum;
        }
    }
}

