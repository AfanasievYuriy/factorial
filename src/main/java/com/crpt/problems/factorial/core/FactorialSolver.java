package com.crpt.problems.factorial.core;

public interface FactorialSolver {
    /**
     * Возвращает кол-во нулей в n!. Тип long выбран для защиты от переполнения integer.
     * @param n для n! считается кол-во нулей
     * @return кол-во нулей в n!
     */
    long getZeros(long n);

    static void validateN(long n) {
        if (n > Integer.MAX_VALUE || n < 0) {
            throw new NumberFormatException("N have to be integer value > 0 and < 2 147 483 647 (MAX_INT)");
        }
    }
}
