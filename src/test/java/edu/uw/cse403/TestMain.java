package edu.uw.cse403;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestMain {
    @Test
    public void testMain() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream old = System.out;
        System.setOut(new PrintStream(out));
        Main.main(new String[0]);
        assertEquals("Hello world!\n", out.toString());
        System.setOut(old);
    }
}
