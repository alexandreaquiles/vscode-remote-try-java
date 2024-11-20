package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParenthesesValidatorTest {

    private ParenthesesValidator validator;

    @Before
    public void begin() {
        validator = new ParenthesesValidator();
    }

    @Test
    public void t1() {
        Assert.assertFalse(validator.isValid("]"));
    }

    @Test
    public void t2() {
        Assert.assertTrue(validator.isValid("()"));
    }

    @Test
    public void t3() {
        Assert.assertFalse(validator.isValid("][)("));
    }

    @Test
    public void t4() {
        Assert.assertTrue(validator.isValid("()[]{}"));
    }

    @Test
    public void t5() {
        Assert.assertFalse(validator.isValid("{]"));
    }

    @Test
    public void t6() {
        Assert.assertTrue(validator.isValid("{[()]}"));
    }

    @Test
    public void t7() {
        Assert.assertFalse(validator.isValid("{[()]"));
    }

    @Test
    public void t8() {
        Assert.assertFalse(validator.isValid("{}]"));
    }

    @Test
    public void t9() {
        Assert.assertFalse(validator.isValid("{}]()"));
    }

    @Test
    public void t10() {
        Assert.assertFalse(validator.isValid("[)"));
    }

    @Test
    public void t11() {
        Assert.assertFalse(validator.isValid("([)"));
    }

    @Test
    public void t12() {
        Assert.assertTrue(validator.isValid("(abc 1, 2, 3)"));
    }

    @Test
    public void t13() {
        Assert.assertTrue(validator.isValid("(define (factorial x) (if (= x 0) 1 (* x (factorial (- x 1)))))"));
    }
    
    @Test
    public void t14() {
        Assert.assertFalse(validator.isValid("(define (factorial x) (if (= x 0) 1 (* x (factorial (- x 1)"));
    }

}
