package com.bridgelabz.userregistration.junittesting;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class UserInputValidationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidFirstName("Akshatha");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidFirstName("Ak");
        Assertions.assertEquals(false, result);
    }
}