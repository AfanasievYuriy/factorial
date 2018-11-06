package com.crpt.problems.factorial;

import com.crpt.problems.factorial.core.FactorialSolver;
import com.crpt.problems.factorial.core.FactorizationFactorialSolver;
import com.crpt.problems.factorial.core.SimpleFactorialSolver;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FactorialSolverTest {

    private FactorialSolver simpleSolver = new SimpleFactorialSolver();
    private FactorialSolver factorizationSolver = new FactorizationFactorialSolver();

    @Test
    public void successfulCalculation_100() {
        Assert.assertEquals(24, simpleSolver.getZeros(100L));
        Assert.assertEquals(24, factorizationSolver.getZeros(100L));
    }

    @Test
    public void successfulCalculation_0() {
        Assert.assertEquals(0, simpleSolver.getZeros(0));
        Assert.assertEquals(0, factorizationSolver.getZeros(0));
    }

    @Test(expected = NumberFormatException.class)
    public void wrongFormat_less_than_0_simple() {
        simpleSolver.getZeros(-100L);
    }

    @Test(expected = NumberFormatException.class)
    public void wrongFormat_less_than_0_factorization() {
        factorizationSolver.getZeros(-100L);
    }

    @Test(expected = NumberFormatException.class)
    public void wrongFormat_more_than_maxInt_factorization() {
        factorizationSolver.getZeros(Integer.MAX_VALUE + 1);
    }

    @Test(expected = NumberFormatException.class)
    public void wrongFormat_more_than_maxInt_simple() {
        simpleSolver.getZeros(Integer.MAX_VALUE + 1);
    }
}
