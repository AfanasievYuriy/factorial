package com.crpt.problems.factorial;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import java.io.ByteArrayInputStream;

public class AppStarterTest {
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void test_input_string_instead_integer_n() {
        exit.expectSystemExitWithStatus(2);
        System.setIn(new ByteArrayInputStream("abracadabra".getBytes()));
        AppStarter.main(new String[]{});
    }
}