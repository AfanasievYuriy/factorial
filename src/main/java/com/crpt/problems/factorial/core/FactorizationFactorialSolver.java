package com.crpt.problems.factorial.core;

/**
 * Для поиска кол-ва нулей в n! необходимо знать кол-во пар 2 и 5 (после разложения факториала на простые
 * множители), так как именно перемножение этих двух простых множителей дает в результате числа
 * кратные 10 (это и есть нули, которые необходимо подсчитать).
 * Однако поскольку чисел, кратных 2 всегда больше, для решения задачи есть смысл найти только
 * кол-во 5 в разложении факториала на простые множители.
 */
public class FactorizationFactorialSolver implements FactorialSolver {

    /**
     * Реализация задачи поиска нулей с помощью формулы для разложения факториала на простые
     * множители: a = [n/p] + [n/p^2] + ..., где a = кол-во множителей p; p = множитель (= 5 в случае задачи)
     * <a href="https://ru.wikipedia.org/wiki/%D0%A4%D0%B0%D0%BA%D1%82%D0%BE%D1%80%D0%B8%D0%B0%D0%BB#%D0%A0%D0%B0%D0%B7%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B5_%D0%BD%D0%B0_%D0%BF%D1%80%D0%BE%D1%81%D1%82%D1%8B%D0%B5_%D1%87%D0%B8%D1%81%D0%BB%D0%B0">
     * Wiki</a>.
     *
     * @param n факториал n (n!)
     * @return кол-во нулей n!
     */
    @Override
    public long getZeros(long n) {
        FactorialSolver.validateN(n);

        long result = 0;
        while (n > 0) {
            n /= 5;
            result += n;
        }

        return result;
    }
}
