package com.bl.junit;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {

        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateName("Sushant");
        Assert.assertTrue(isValid);

    }

    @Test
    public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("sushant");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenFirstName_WhenLesserThanThreeCharacters_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("Su");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenFirstName_WhenNull_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName(null);
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenFirstName_WhenEmpty_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenFirstName_WhenNumericCharatersArePresent_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("Asjsak23");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenFirstName_WhenSpecialCharatersArePresent_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("Asjsak@^");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {

        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateName("Lad");
        Assert.assertTrue(isValid);

    }

    @Test
    public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("lad");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenLesserThanThreeCharacters_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("La");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenNull_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName(null);
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenEmpty_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenNumericCharatersArePresent_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("lad29");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenLastName_WhenSpecialCharatersArePresent_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("Ch@d@ga%");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTrue() {

        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateEmail("sushantlad8888@gmail.com");
        Assert.assertTrue(isValid);

    }

    @Test
    public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateEmail("abc()*@gmail.com");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenEmailAddress_WhenNull_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateEmail(null);
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenEmailAddress_WhenEmpty_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateEmail("");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {

        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateMobileNumber("91 8830602356");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateMobileNumber("918830602356");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenMobileNumber_WhenNumberLessThanTenDigits_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateMobileNumber("91 602356");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenMobileNumber_WhenNull_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateMobileNumber(null);
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenMobileNumber_WhenEmpty_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateMobileNumber("");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenMobileNumber_WhenCharatersArePresent_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("9a 948375053h");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenMobileNumber_WhenSpecialCharatersArePresent_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validateName("#6 948375*535");
        Assert.assertFalse(isNotValid);

    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {

        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validatePassword("Sushant@dag11");
        Assert.assertTrue(isValid);
    }

    @Test
    public void givenPassword_WhenLessThanEightCharcters_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validatePassword("sd@A12");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenPassword_WhenNoUpperCaseCharacter_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validatePassword("asjd23$df");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenPassword_WhenNoNumericalNumber_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validatePassword("asjdAG$df");
        Assert.assertFalse(isNotValid);
    }

    @Test
    public void givenPassword_WhenMoreThanOneSpecialCharacter_ShouldReturnFalse() {

        UserValidation userValidator = new UserValidation();
        boolean isNotValid = userValidator.validatePassword("asjd23^$df");
        Assert.assertFalse(isNotValid);
    }

}
