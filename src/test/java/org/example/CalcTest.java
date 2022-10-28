package org.example;

import org.example.calcpack.Calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalcTest {
    Calc calc;

    @BeforeEach
    public  void setUp(){
        calc = new Calc();
    }

    @AfterEach
    public  void tearDown(){
        calc = null;
    }

    @Test
    public void addText(){
        int result = calc.add(12,14);
        assertEquals(26,result);
    }

    @Test
    public void subTest(){
        assertEquals(10,calc.sub(30,20));
    }

    @Test
    public void mulTest(){
        assertEquals(40,calc.mul(20,2));
    }

    @Test
    public void divTest(){
        assertEquals(6,calc.div(20,3));
    }
}
