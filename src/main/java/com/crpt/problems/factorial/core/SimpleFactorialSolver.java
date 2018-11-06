package com.crpt.problems.factorial.core;

/**
 * Для поиска кол-ва нулей в n! необходимо знать кол-во пар 2 и 5 (после разложения факториала на простые
 * множители), так как именно перемножение этих двух простых множителей дает в результате числа
 * кратные 10 (это и есть нули, которые необходимо подсчитать).
 * Однако поскольку чисел, кратных 2 всегда больше, для решения задачи есть смысл найти только
 * кол-во 5 в разложении факториала на простые множители.
 */
public class SimpleFactorialSolver implements FactorialSolver {

    /**
     * Простая (и более медленная, чем {@link FactorizationFactorialSolver}) реализация
     * задачи по подсчету нулей факториала.
     * Суть заключается в подсчете сомножителя равного 5 в каждом из
     * сомножителей (1, 2, 3, .. , n) самого факториала n! : сначала проверяется кратность 5
     * и затем кол-во множителей равных 5.
     * @param n факториал n (n!)
     * @return сумма кол-ва множителей (равных 5) в каждом из сомножителей факториала
     */
    @Override
    public long getZeros(long n) {
        FactorialSolver.validateN(n);

        if (n == 0) {
            return n;
        }

        int zeroCount = 0;
        for (int i = 1; i <= n; i++) {
            int factorialMultiplier = i;

            while (factorialMultiplier > 0) {
                if (factorialMultiplier % 5 == 0) {
                    factorialMultiplier /= 5;
                    zeroCount++;
                }
                else break;
            }
        }

        return zeroCount;
    }
}
