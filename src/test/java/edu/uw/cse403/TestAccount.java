package edu.uw.cse403;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestAccount {
    @Test
    public void testNoAccounts() {
        assertEquals(0.0, Account.calculateFee(new Account[0]));
    }
}
